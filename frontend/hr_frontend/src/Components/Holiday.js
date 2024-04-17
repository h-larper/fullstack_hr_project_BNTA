const Holiday = ({holiday, deleteHolidayRequest}) => {

    const handleDelete = () => {
        deleteHolidayRequest(holiday.id);
    }

    return ( 
        <article>
            <p>Start Date: [{holiday.startDate}] to End Date: [{holiday.endDate}]</p>
            <p>{holiday.timeOffType}</p>
            <p>Notes: {holiday.notes}</p>
            <p>Status: {holiday.status}</p>
            <button>Update</button>
            <button onClick={handleDelete}>Delete</button>
        </article>

     );
}
 
export default Holiday;