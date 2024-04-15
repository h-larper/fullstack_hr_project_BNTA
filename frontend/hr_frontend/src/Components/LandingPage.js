import { useState } from "react";
import Calendar from "./Calendar";
import MyHolidaysList from "./MyHolidaysList";
import ReactModal from "react-modal";
import HolidayApprovalList from "./HolidayApprovalList";
import HolidayRequestForm from "./HolidayRequestForm";

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

            {/* Holiday Approvals list Modal */}
            <button onClick={toggleHolidayApprovalListModal}>Approvals</button>
            <ReactModal
                isOpen={holidayApprovalListModal}
                onRequestClose={toggleHolidayApprovalListModal}
                ariaHideApp={false}
            >
                <HolidayApprovalList />
                <button onClick={toggleHolidayApprovalListModal}>Close</button>
            </ReactModal>

            {/* Holiday Request Form Modal */}
            <button onClick={toggleHolidayRequestModal}>Request Leave</button>
            <ReactModal
                isOpen={holidayRequestModal}
                onRequestClose={toggleHolidayRequestModal}
                ariaHideApp={false}
            >
                <HolidayRequestForm />
                <button onClick={toggleHolidayRequestModal}>Close</button>
            </ReactModal>

            {/* Profile Modal */}
            <button onClick={toggleProfileModal}>Profile</button>
            <ReactModal
                isOpen={ProfileModal}
                onRequestClose={toggleProfileModal}
                ariaHideApp={false}
            >
                <HolidayRequestForm />
                <button onClick={toggleProfileModal}>Close</button>
            </ReactModal>
        </>
     );
}
 
export default LandingPage;