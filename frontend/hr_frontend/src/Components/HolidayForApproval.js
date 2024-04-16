const HolidayForApproval = ({pendingHolidayRequest, patchRequestedTimeOff}) => {
    
    const handleApproval = (event) => {
        let approvalStatus = {
            status: "APPROVED"
        }
        patchRequestedTimeOff(approvalStatus, pendingHolidayRequest.employeeId, pendingHolidayRequest.id)
    }

    const handleRejection = (event) => {
        
    }
    
    return ( 
        <>
            <article>
                <p>{pendingHolidayRequest.fullName}</p>
                <p>[{pendingHolidayRequest.startDate}] to [{pendingHolidayRequest.endDate}]</p>
                <p>{pendingHolidayRequest.timeOffType}</p>
                <p>{pendingHolidayRequest.notes}</p>
                <button onClick={handleApproval}>Approve</button>
                <button onClick={handleRejection}>Reject</button>
            </article>
        </>
    );
}
 
export default HolidayForApproval;