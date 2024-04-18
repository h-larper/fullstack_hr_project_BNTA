import { useState } from "react";
import ReactModal from "react-modal";
import UpdateHolidayRequestForm from "./UpdateHolidayRequestForm";
import '../CSS/MyHolidaysList.css'

const Holiday = ({holiday, deleteHolidayRequest, putHolidayRequest}) => {

    const [updateHolidayModal, setUpdateHolidayModal] = useState(false);

    const toggleUpdateHolidayModal = () => {
        setUpdateHolidayModal(!updateHolidayModal);
    }

    const handleDelete = () => {
        deleteHolidayRequest(holiday.id);
    }

    return ( 
        <article>
            <p>Start Date: [{holiday.startDate}] to End Date: [{holiday.endDate}]</p>
            <p>{holiday.timeOffTypeDisplay}</p>
            <p>Notes: {holiday.notes}</p>
            <p>Status: {holiday.status}</p>
            <button onClick={toggleUpdateHolidayModal}>Update</button>
            <ReactModal
                isOpen= {updateHolidayModal}
                onRequestClose={toggleUpdateHolidayModal}
                ariaHideApp={false}
                style={{
                    content: {height:"80%",
                    margin: "auto",
                    width: "50%",
                    borderRadius: "20px"},
                    overlay: {zIndex: 1000}
                }}
            > 
                <UpdateHolidayRequestForm 
                    holiday={holiday} 
                    putHolidayRequest = {putHolidayRequest}
                    toggleUpdateHolidayModal = {toggleUpdateHolidayModal}
                />
                <button className="modal_close_button" onClick={toggleUpdateHolidayModal}>Close</button>
            </ReactModal>
            <button onClick={handleDelete}>Delete</button>
        </article>

     );
}
 
export default Holiday;