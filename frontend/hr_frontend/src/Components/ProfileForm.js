import currentUserContext from "./CurrentUserContext";
import { useContext, useState } from "react";

const ProfileForm = () => {

    const currentUser = useContext(currentUserContext);

    const [sortCode, setSortCode] = useState(currentUser.currentUser.sortCode);
    const [accountNumber, setAccountNumber] = useState(currentUser.currentUser.accountNumber);

    const handleSubmit = (event) => {
        event.preventDefault();
    }

    return ( 
        <>
            <p>PROFILE</p>
            <form onSubmit={handleSubmit}>
                <label htmlFor="first-name-field">First Name: </label>
                <input 
                    id = "first-name-field"
                    placeholder={currentUser.currentUser.firstName}
                    readOnly
                />
                <label htmlFor="last-name-field">Last Name: </label>
                <input
                    id = "last-name-field"
                    placeholder={currentUser.currentUser.lastName}
                    readOnly
                />
                <label htmlFor="work-email-field">Work Email: </label>
                <input
                    id = "work-email-field"
                    placeholder={currentUser.currentUser.workEmail}
                    readOnly
                />
                <label htmlFor="sort-code-field">Sort Code: </label>
                <input
                    id = "sort-code-field"
                    type = "text"
                    value = {sortCode}
                    maxLength="6"
                    onChange={(event) => setSortCode(event.target.value)}
                    placeholder={currentUser.currentUser.sortCode}
                />
                <label htmlFor="account-number-field">Account Number: </label>
                <input  
                    id = "account-number-field"
                    type = "text" 
                    value = {accountNumber}
                    maxLength="8"
                    onChange={(event) => setAccountNumber(event.target.value)}
                    placeholder={currentUser.currentUser.accountNumber}
                />
                <label htmlFor="start-date-field">Start Date: </label>
                <input
                    id = "start-date-field"
                    placeholder={currentUser.currentUser.employeeStartDate}
                    readOnly
                />


            </form>

        </>
     );
}
 
export default ProfileForm;