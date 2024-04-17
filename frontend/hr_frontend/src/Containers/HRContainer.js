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

    const fetchHolidayApprovals = async (managerId) => {
        const response = await fetch(`http://localhost:8080/employees/${managerId}/holiday_approvals`)
        const data = await response.json();
        setPendingHolidayRequests(data);
    }

    const postRequestedTimeOff = async (newTimeOffRequest) => {
        const response = await fetch ("http://localhost:8080/requested_time_offs", {
                method: "POST",
                headers: {"Content-Type": "application/json"},
                body: JSON.stringify(newTimeOffRequest)
        });
        const newHoliday = await response.json();
        setCurrentUserHolidays([...currentUserHolidays, newHoliday]);
    }

    const fetchCurrentUserHolidays = async (id) => {
        const response = await fetch(`http://localhost:8080/requested_time_offs/employee/${id}`);
        const data = await response.json();
        setCurrentUserHolidays(data);
    }

    const patchRequestedTimeOff = async (approvalStatus, requestedTimeOffId) => {
        const response = await fetch (`http://localhost:8080/requested_time_offs/${requestedTimeOffId}`, {
            method: "PATCH",
            headers: {"Content-Type": "application/json"},
            body: JSON.stringify(approvalStatus)
        });
        setPendingHolidayRequests(pendingHolidayRequests.filter((holidayRequest) => holidayRequest.id !== requestedTimeOffId));
    }

    const deleteHolidayRequest = async (holidayId) => {
        await fetch (`http://localhost:8080/requested_time_off/${holidayId}`, {
            method: "DELETE",
            headers: {"Content-Type": "application/json"}
        });
        setCurrentUserHolidays(currentUserHolidays.filter((holiday) => holiday.id !== holidayId));
    }


    // UseEffects
    useEffect(() => {
        //Makes sure current user has id/ logged in
        if (currentUser.id){
            //Fetches the holidays based on current user's id
            fetchCurrentUserHolidays(currentUser.id);
        }
        
        if(currentUser.managees){
            fetchHolidayApprovals(currentUser.id)
        }
        
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
            <LandingPage postRequestedTimeOff = {postRequestedTimeOff} patchRequestedTimeOff={patchRequestedTimeOff} 
            pendingHolidayRequests = {pendingHolidayRequests} currentUserHolidays={currentUserHolidays}/>
            <MyHolidaysList currentUserHolidays={currentUserHolidays} deleteHolidayRequest={deleteHolidayRequest} />
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