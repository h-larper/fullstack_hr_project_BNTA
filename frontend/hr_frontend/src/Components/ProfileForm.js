import currentUserContext from "./CurrentUserContext";
import { useContext } from "react";

const ProfileForm = () => {

    const currentUser = useContext(currentUserContext);

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

                
            </form>

        </>
     );
}
 
export default ProfileForm;