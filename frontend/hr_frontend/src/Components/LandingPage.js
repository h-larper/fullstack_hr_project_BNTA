import { useContext, useState } from "react";
import Calendar from "./Calendar";
import ReactModal from "react-modal";
import HolidayApprovalList from "./HolidayApprovalList";
import HolidayRequestForm from "./HolidayRequestForm";
import ProfileForm from "./ProfileForm";
import currentUserContext from "./CurrentUserContext";

const LandingPage = ({fetchRequestedTimeOffs, pendingHolidayRequests}) => {
    
    const [holidayApprovalListModal, setHolidayApprovalListModal] = useState(false);
    const [holidayRequestModal, setHolidayRequestModal] = useState(false);
    const [profileModal, setProfileModal] = useState(false);

    const currentUser = useContext(currentUserContext);

    const toggleHolidayApprovalListModal = () => {
        setHolidayApprovalListModal(!holidayApprovalListModal);
    }
    const toggleHolidayRequestModal = () => {
        setHolidayRequestModal(!holidayRequestModal);
    }
    const toggleProfileModal = () => {
        setProfileModal(!profileModal);
    }
    
    return ( 
        <>

            <h2>Welcome {currentUser.currentUser.firstName} </h2>

            <Calendar />

            {/* Holiday Approvals list Modal */}
            <button onClick={toggleHolidayApprovalListModal}>Approvals</button>
            <ReactModal
                isOpen={holidayApprovalListModal}
                onRequestClose={toggleHolidayApprovalListModal}
                ariaHideApp={false}
            >
                <HolidayApprovalList pendingHolidayRequests = {pendingHolidayRequests}/>
                <button onClick={toggleHolidayApprovalListModal}>Close</button>
            </ReactModal>

            {/* Holiday Request Form Modal */}
            <button onClick={toggleHolidayRequestModal}>Request Leave</button>
            <ReactModal
                isOpen={holidayRequestModal}
                onRequestClose={toggleHolidayRequestModal}
                ariaHideApp={false}
            >
                <HolidayRequestForm fetchRequestedTimeOffs = {fetchRequestedTimeOffs} currentUser = {currentUser}/>
                <button onClick={toggleHolidayRequestModal}>Close</button>
            </ReactModal>

            {/* Profile Modal */}
            <button onClick={toggleProfileModal}>Profile</button>
            <ReactModal
                isOpen={profileModal}
                onRequestClose={toggleProfileModal}
                ariaHideApp={false}
            >
                <ProfileForm />
                <button onClick={toggleProfileModal}>Close</button>
            </ReactModal>
        </>
     );
}
 
export default LandingPage;