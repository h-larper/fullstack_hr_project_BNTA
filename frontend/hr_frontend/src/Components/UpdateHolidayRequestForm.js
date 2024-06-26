import { useState } from "react";

const UpdateHolidayRequestForm = ({holiday, putHolidayRequest, toggleUpdateHolidayModal}) => {

    const [startDate, setStartDate] = useState(holiday.startDate);
    const [endDate, setEndDate] = useState(holiday.endDate);
    const [notes, setNotes] = useState(holiday.notes);

    const handleSubmit = (event) => {
        event.preventDefault();
        const updatedHolidayRequest = {
            startDate,
            endDate,
            timeOffType: holiday.timeOffType,
            notes,
            status: "PENDING"
        }
        putHolidayRequest(holiday.id, updatedHolidayRequest);
        toggleUpdateHolidayModal();
    }

    return (  
        <>
            <h4>Update Holiday</h4>
            <form id="update_form" onSubmit={handleSubmit}>
                <label htmlFor="start_date_field">Start Date:</label>
                <input
                    id = "start_date_field"
                    type = "date"
                    placeholder={holiday.startDate}
                    value = {startDate}
                    onChange={(event) => setStartDate(event.target.value)}
                    required
                />

                <label htmlFor="end_date_field">End Date:</label>
                <input
                    id = "end_date_field"
                    type = "date"
                    placeholder={holiday.endDate}
                    value = {endDate}
                    onChange={(event) => setEndDate(event.target.value)}
                    required
                />

                <label htmlFor="type_field">Type:</label>
                <input  
                    id = "type_field"
                    type = "text"
                    placeholder = {holiday.timeOffTypeDisplay}
                    readOnly
                />

                <label htmlFor="notes_field">Notes:</label>
                <input 
                    id = "notes_field"
                    type = "text"
                    value = {notes}
                    onChange={(event) => setNotes(event.target.value)}
                    required
                />
                <input id="update_button" type="submit" value="Submit"/>
            </form>
        </>
    );
}
 
export default UpdateHolidayRequestForm;