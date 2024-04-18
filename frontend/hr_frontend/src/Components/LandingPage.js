import { useContext, useState } from "react";
import ReactModal from "react-modal";
import HolidayApprovalList from "./HolidayApprovalList";
import HolidayRequestForm from "./HolidayRequestForm";
import ProfileForm from "./ProfileForm";
import currentUserContext from "./CurrentUserContext";
import WorkCalendar from "./WorkCalendar";
import { useNavigate } from "react-router";
import MyHolidaysList from "./MyHolidaysList";
import '../CSS/LandingPage.css';

const LandingPage = ({pendingHolidayRequests, patchRequestedTimeOff, postRequestedTimeOff, currentUserHolidays,
    patchUserProfile, putHolidayRequest, deleteHolidayRequest,calendarEvents}) => {
  
    const [holidayApprovalListModal, setHolidayApprovalListModal] = useState(false);
    const [holidayRequestModal, setHolidayRequestModal] = useState(false);
    const [profileModal, setProfileModal] = useState(false);

    const navigate = useNavigate();

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

    const handleSignOut = (event) => {
        currentUser.setCurrentUser(null);
        navigate("/");
    }
    
    return ( 
        <>
            <div id = "banner">
                <h2>👋🏼 Welcome {currentUser.currentUser.firstName}   </h2>
                <h3>Days off remaining: {currentUser.currentUser.calculateRemainingTimeOffs}</h3>
            </div>
            <nav>
                <button onClick={handleSignOut}>Sign Out</button>
                <button onClick={toggleProfileModal}>Profile</button>
                {currentUser.currentUser.managees.length > 0 ? <button onClick={toggleHolidayApprovalListModal}>Approvals</button> : <></>}
                <button onClick={toggleHolidayRequestModal}>Request Leave</button>
            </nav>

            <section id = "main_content">
                <div id="calendar_box">
                    <WorkCalendar
                        calendarEvents={calendarEvents}
                    />

                </div>
                <div id="my_holiday_list">
                    <MyHolidaysList 
                        currentUserHolidays = {currentUserHolidays} 
                        deleteHolidayRequest = {deleteHolidayRequest}
                        putHolidayRequest = {putHolidayRequest} 
                    />
                </div>
            </section>

            {/* Holiday Approvals list Modal */}
            <ReactModal
                isOpen={holidayApprovalListModal}
                onRequestClose={toggleHolidayApprovalListModal}
                ariaHideApp={false}
                style={{
                    content: {height:"80%",
                    margin: "auto",
                    width: "50%",
                    borderRadius: "20px"},
                    overlay: {zIndex: 1000}
                }}
            >
                <HolidayApprovalList 
                    pendingHolidayRequests = {pendingHolidayRequests} 
                    patchRequestedTimeOff={patchRequestedTimeOff}
                />
                <button className="modal_close_button" onClick={toggleHolidayApprovalListModal}>Close</button>
            </ReactModal>

            {/* Holiday Request Form Modal */}
            <ReactModal
                isOpen={holidayRequestModal}
                onRequestClose={toggleHolidayRequestModal}
                ariaHideApp={false}
                style={{
                    content: {height:"80%",
                    margin: "auto",
                    width: "50%",
                    borderRadius: "20px"},
                    overlay: {zIndex: 1000}
                }}
            >
                <HolidayRequestForm 
                    postRequestedTimeOff={postRequestedTimeOff} 
                    currentUser={currentUser} 
                    toggleHolidayRequestModal={toggleHolidayRequestModal} 
                />
                <button className="modal_close_button" onClick={toggleHolidayRequestModal}>Close</button>
            </ReactModal>

            {/* Profile Modal */}
            <ReactModal
                isOpen={profileModal}
                onRequestClose={toggleProfileModal}
                ariaHideApp={false}
                style={{
                    content: {height:"80%",
                    margin: "auto",
                    width: "50%",
                    borderRadius: "20px"},
                    overlay: {zIndex: 1000}
                }}
            >
                <ProfileForm 
                    patchUserProfile = {patchUserProfile} 
                    toggleProfileModal={toggleProfileModal}
                />
                <button className="modal_close_button" onClick={toggleProfileModal}>Close</button>
            </ReactModal>
        </>
     );
}
 
export default LandingPage;