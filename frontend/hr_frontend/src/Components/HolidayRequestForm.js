import { useState } from "react";

const HolidayRequestForm = () => {

    const [startDate, setStartDate] = useState("");
    const [endDate, setEndDate] = useState("");
    const [type, setType] = useState("");
    const [notes, setNotes] = useState("");
    const [value, setValue] = useState(null);

    const handleChange = (event) => {
        setValue(event.target.value);
    }

    return ( 
        <>
            <p>HOLIDAY REQUESTS</p>
            <form>
                <label htmlFor="start_date_field">Start Date</label>
                <input
                    type = "date"
                    placeholder="Start Date"
                    value = {startDate}
                    onChange={(event) => setStartDate(event.target.value)}
                    required
                />

                <label htmlFor="end_date_field">End Date</label>
                <input
                    type = "date"
                    placeholder="End Date"
                    value = {endDate}
                    onChange={(event) => setEndDate(event.target.value)}
                    required
                />

                <label htmlFor="type_field">Type</label>
                <select  
                    id = "type"
                    onChange={handleChange}
                >
                    <option value = "sick_leave">Sick Leave</option>
                    <option value = "compassionate_leave">Compassionate Leave</option>
                    <option value = "parental_leave">Parental Leave</option>
                    <option value = "holiday_leave">Holiday Leave</option>
                    <option value = "other">Other</option>
                </select>

                <label htmlFor="notes_field">Notes</label>
                <input 
                    type = "text"
                    placeholder="Notes"
                    value = {notes}
                    onChange={(event) => setNotes(event.target.value)}
                    required
                />
                <input type="submit" value="Submit"/>
            </form>
        </>
     );
}
 
export default HolidayRequestForm;