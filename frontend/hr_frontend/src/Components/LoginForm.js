import { useState } from "react";

const LoginForm = ({fetchCurrentUser}) => {

    const [emailAddress, setEmailAddress] = useState("");
    const [password, setPassword] = useState("");

    const handleSubmit = (event) => {
        event.preventDefault();
        let userCredentials = {
            workEmail: emailAddress,
            password: password
        }
        
        fetchCurrentUser(userCredentials);
        setEmailAddress("");
        setPassword("");
    }

    return ( 
        <>
            <h2>Login Form:</h2>

            <form onSubmit={handleSubmit}>
                <label htmlFor="emailAddress-field">Email Address:</label>
                <input
                    type="text"
                    placeholder="Enter Email Address"
                    id="emailAddress-field"
                    required
                    value={emailAddress}
                    onChange={(event) => setEmailAddress(event.target.value)}
                />
                <label htmlFor="password-field">Password:</label>
                <input
                    type="password"
                    placeholder="Enter Password"
                    id="password-field"
                    required
                    value={password}
                    onChange={(event) => setPassword(event.target.value)}
                />
                <input
                    type="submit"
                    value="Login"
                />
            </form>
        </>
     );
}
 
export default LoginForm;