import { useState } from "react";

const HRContainer = () => {

    // UseStates
    const [currentUser, setCurrentUser] = useState({});

    // Fetch Requests
    const fetchCurrentUser = async () => {
        const response = await fetch("http://localhost:8080/employees/login");
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