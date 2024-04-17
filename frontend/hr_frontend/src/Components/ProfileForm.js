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
                    type = "text"
                    placeholder={currentUser.currentUser.firstName}
                    readOnly
                />
                <label htmlFor="last-name-field">Last Name: </label>
                <input
                    id = "last-name-field"
                    type="text"
                    placeholder={currentUser.currentUser.lastName}
                    readOnly
                />

                
            </form>

        </>
     );
}
 
export default ProfileForm;