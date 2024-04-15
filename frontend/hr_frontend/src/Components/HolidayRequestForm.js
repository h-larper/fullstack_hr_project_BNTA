import { useState } from "react";

const HolidayRequestForm = () => {

    const [date, setDate] = useState("");
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
                <input
                    type = "date"
                    label = "Date"
                    placeholder="Date"
                    value = {date}
                    onChange={(event) => setDate(event.target.value)}
                    required
                />
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

            </form>
        </>
     );
}
 
export default HolidayRequestForm;