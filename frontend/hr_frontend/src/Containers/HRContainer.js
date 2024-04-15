import { useEffect, useState } from "react";

const HRContainer = () => {

    // UseStates
    const [currentUser, setCurrentUser] = useState({});

    // Fetch Requests
    const fetchCurrentUser = async (userLoginCredentials) => {
        const response = await fetch("http://localhost:8080/employees/login", {
            method: "POST",
            headers: {"Content-Type": "application/json"},
            body: JSON.stringify(userLoginCredentials)
        });
        const data = await response.json();
        setCurrentUser(data);
    }

    // UseEffects


    // Other Functions


    // Routes

    return ( 
        <h1>Hello from the container!</h1>
     );
}
 
export default HRContainer;