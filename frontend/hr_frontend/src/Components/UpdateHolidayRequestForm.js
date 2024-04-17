import { useState } from "react";

const UpdateHolidayRequestForm = ({holiday}) => {

    const [startDate, setStartDate] = useState("");
    const [endDate, setEndDate] = useState("");
    const [notes, setNotes] = useState("");

    const handleSubmit = () => {}

    return (  
        <>
            <form onSubmit={handleSubmit}>
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
                    placeholder = {holiday.timeOffType}
                    readOnly
                />

                <label htmlFor="notes_field">Notes:</label>
                <input 
                    id = "notes_field"
                    type = "text"
                    placeholder={holiday.notes}
                    value = {notes}
                    onChange={(event) => setNotes(event.target.value)}
                    required
                />
                <input type="submit" value="Submit"/>
            </form>
        </>
    );
}
 
export default UpdateHolidayRequestForm;