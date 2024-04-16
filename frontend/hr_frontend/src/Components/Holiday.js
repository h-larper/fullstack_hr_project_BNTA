const Holiday = ({holiday}) => {
    return ( 
        <article>
            <p>Start Date: [{holiday.startDate}] to End Date: [{holiday.endDate}]</p>
            <p>{holiday.timeOffType}</p>
            <p>Notes: {holiday.notes}</p>
            <p>Status: {holiday.status}</p>
            <button>Update</button>
            <button>Delete</button>
        </article>

     );
}
 
export default Holiday;