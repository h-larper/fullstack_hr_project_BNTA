import { useEffect, useState } from "react";
import LoginForm from "../Components/LoginForm";
import { RouterProvider, createBrowserRouter } from "react-router-dom";
import LandingPage from "../Components/LandingPage";
import MyHolidaysList from "../Components/MyHolidaysList";
import CurrentUserContext from "../Components/CurrentUserContext";

const HRContainer = () => {

    // UseStates
    const [currentUser, setCurrentUser] = useState({});
    const [pendingHolidayRequests, setPendingHolidayRequests] = useState([]);
    const [currentUserHolidays, setCurrentUserHolidays] = useState([]);

    // Fetch Requests
    const fetchCurrentUser = async (userLoginCredentials) => {
        try{
            const response = await fetch("http://localhost:8080/employees/login", {
                method: "POST",
                headers: {"Content-Type": "application/json"},
                body: JSON.stringify(userLoginCredentials)
            });
            const data = await response.json();
            setCurrentUser(data);
            return response.status
        }catch(exception){}
    }

    const postRequestedTimeOff = async (newTimeOffRequest) => {
        const response = await fetch ("http://localhost:8080/requested_time_off", {
                method: "POST",
                headers: {"Content-Type": "application/json"},
                body: JSON.stringify(newTimeOffRequest)
        });
        const newHoliday = await response.json();
        setCurrentUserHolidays([...currentUserHolidays, newHoliday]);
    }

    const fetchCurrentUserHolidays = async (id) => {
        const response = await fetch(`http://localhost:8080/requested_time_off/employee/${id}`);
        const data = await response.json();
        setCurrentUserHolidays(data);
    }


    // UseEffects
    useEffect(() => {
        //Makes sure current user has id/ logged in
        if (currentUser.id){
            //Fetches the holidays based on current user's id
            fetchCurrentUserHolidays(currentUser.id);
        }

        if(currentUser.managees) {
            let allPendingHolidayRequests = [];
            currentUser.managees.forEach((managee) => {
                let holidayRequests = managee.requestedTimeOffs.filter((requestedTimeOff) => requestedTimeOff.status === "PENDING");
                holidayRequests = holidayRequests.map((holidayRequest) => {
                    holidayRequest.fullName = managee.firstName + " " + managee.lastName;
                    return holidayRequest;
                });
                allPendingHolidayRequests = allPendingHolidayRequests.concat(holidayRequests);
                });
            setPendingHolidayRequests(allPendingHolidayRequests);
        };
        

        //Called every time currentUser is assigned (On startup or when changed)
    }, [currentUser]);

    // Other Functions


    // Routes
    const HRRoutes = createBrowserRouter([
        {
            path: "/",
            element: <LoginForm fetchCurrentUser={fetchCurrentUser} />
        },
        {
            path: "/landing",
            element: (
            <>
            <LandingPage postRequestedTimeOff = {postRequestedTimeOff} 
            pendingHolidayRequests = {pendingHolidayRequests} />
            <MyHolidaysList currentUserHolidays = {currentUserHolidays}/>
            </>
            )
        }
    ]);

    return ( 
        <>
            <CurrentUserContext.Provider value= {{currentUser, setCurrentUser}}>
                <h1>Hello from the container!</h1>
                <main>
                    <RouterProvider router={HRRoutes} />
                </main>
            </CurrentUserContext.Provider>
        </>
     );
}
 
export default HRContainer;