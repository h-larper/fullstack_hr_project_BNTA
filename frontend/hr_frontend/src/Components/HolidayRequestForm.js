import { useState } from "react";
import Holiday from "./Holiday";

const HolidayRequestForm = ({fetchRequestedTimeOffs, currentUser}) => {

    const [startDate, setStartDate] = useState("");
    const [endDate, setEndDate] = useState("");
    const [type, setType] = useState("");
    const [notes, setNotes] = useState("");
    // const [value, setValue] = useState(null);

    const handleChange = (event) => {
        setType(event.target.value);
    }

    const handleSubmit = (event) => {
        event.preventDefault();
        let newTimeOffRequest = {
            startDate,
            endDate,
            timeOffType: type,
            notes,
            status: "PENDING",
            employee_id: currentUser.id
        }
        fetchRequestedTimeOffs(newTimeOffRequest)
    }

    // const mappedRequestedHoliday = fetchRequestedTimeOffs.map((fetchRequested_time_off) => {
    //     return <Holiday />
    // })


    return ( 
        <>
            <p>HOLIDAY REQUESTS</p>
            <form onSubmit={handleSubmit}>
                <label htmlFor="start_date_field">Start Date</label>
                <input
                    id = "start_date_field"
                    type = "date"
                    placeholder="Start Date"
                    value = {startDate}
                    onChange={(event) => setStartDate(event.target.value)}
                    required
                />

                <label htmlFor="end_date_field">End Date</label>
                <input
                    id = "end_date_field"
                    type = "date"
                    placeholder="End Date"
                    value = {endDate}
                    onChange={(event) => setEndDate(event.target.value)}
                    required
                />

                <label htmlFor="type_field">Type</label>
                <select  
                    id = "type_field"
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
                    id = "notes_field"
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