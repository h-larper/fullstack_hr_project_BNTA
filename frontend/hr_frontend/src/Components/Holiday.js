const Holiday = ({holiday}) => {
    return ( 
        <article>
            <p>Start Date: [{holiday.startDate}] to End Date: [{holiday.endDate}]</p>
            <p>{holiday.timeOffType}</p>
            
        </article>

     );
}
 
export default Holiday;