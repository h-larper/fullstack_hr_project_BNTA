const HolidayApprovalList = ({managees}) => {
    
    const holidayRequests = managees.forEach((managee) => {
        const filterPending = managee.requestedTimeOffs.filter((requestedTimeOff) => {
            console.log(requestedTimeOff.status == "PENDING");
            return requestedTimeOff.status == "PENDING"
        })
        return filterPending.map((requestedTimeOff) => { return <p> hello </p>});
    });
    
    return ( 
        <>
            <h3>Holidays to be approved:</h3>
            {holidayRequests}
        </>
     );
}
 
export default HolidayApprovalList;