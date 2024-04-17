import { useState } from "react";
import ReactModal from "react-modal";
import UpdateHolidayRequestForm from "./UpdateHolidayRequestForm";

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
            <p>{holiday.timeOffType}</p>
            <p>Notes: {holiday.notes}</p>
            <p>Status: {holiday.status}</p>
            <button onClick={toggleUpdateHolidayModal}>Update</button>
            <ReactModal
                isOpen= {updateHolidayModal}
                onRequestClose={toggleUpdateHolidayModal}
                ariaHideApp={false}
                style={{
                    content:{},
                    overlay:{zIndex: 1000}
                }}
            > 
                <UpdateHolidayRequestForm 
                    holiday={holiday} 
                    putHolidayRequest = {putHolidayRequest}
                />
                <button onClick={toggleUpdateHolidayModal}>Close</button>
            </ReactModal>
            <button onClick={handleDelete}>Delete</button>
        </article>

     );
}
 
export default Holiday;