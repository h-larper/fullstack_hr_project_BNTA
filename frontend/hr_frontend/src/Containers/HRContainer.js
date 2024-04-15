import { useState } from "react";
import LoginForm from "../Components/LoginForm";
import { RouterProvider, createBrowserRouter } from "react-router-dom";
import LandingPage from "../Components/LandingPage";

const HRContainer = () => {

    // UseStates
    const [currentUser, setCurrentUser] = useState({});

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

    // UseEffects


    // Other Functions


    // Routes
    const HRRoutes = createBrowserRouter([
        {
            path: "/login",
            element: <LoginForm fetchCurrentUser={fetchCurrentUser} />
        },
        {
            path: "/landing",
            element: <LandingPage managees={currentUser.managees}/>
        }
    ]);

    return ( 
        <>
            <h1>Hello from the container!</h1>
            <main>
                <RouterProvider router={HRRoutes} />
            </main>
        </>
     );
}
 
export default HRContainer;