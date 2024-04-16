const Holiday = ({holiday}) => {
    return ( 
        <article>
            <p>Start Date: [{holiday.startDate}] to End Date: [{holiday.endDate}]</p>
            <p>{holiday.timeOffType}</p>
            <p>Notes: {holiday.notes}</p>
            <p>Status: {holiday.status}</p>
        </article>

     );
}
 
export default Holiday;