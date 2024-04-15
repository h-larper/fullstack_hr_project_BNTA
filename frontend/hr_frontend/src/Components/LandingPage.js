import { useState } from "react";
import Calendar from "./Calendar";
import MyHolidaysList from "./MyHolidaysList";
import ReactModal from "react-modal";
import HolidayApprovalList from "./HolidayApprovalList";

const LandingPage = () => {
    
    const [holidayApprovalListModal, setHolidayApprovalListModal] = useState(false);
    const [holidayRequestModal, setHolidayRequestModal] = useState(false);
    const [profileModal, setProfileModal] = useState(false);

    const toggleHolidayApprovalListModal = () => {
        setHolidayApprovalListModal(!holidayApprovalListModal);
    }
    const toggleHolidayRequestModal = () => {
        setHolidayRequestModal(!holidayRequestModal);
    }
    const toggleProfileModal = () => {
        profileModal(!profileModal);
    }
    
    return ( 
        <>
            <Calendar />
            <MyHolidaysList />

            <button onClick={toggleHolidayApprovalListModal}>Requests</button>
            <ReactModal
                isOpen={holidayApprovalListModal}
                onRequestClose={toggleHolidayApprovalListModal}
                ariaHideApp={false}
            >
                <HolidayApprovalList />
                <button onClick={toggleHolidayApprovalListModal}>Close</button>
            </ReactModal>
        </>
     );
}
 
export default LandingPage;