import '../CSS/MyHolidaysList.css'

const HolidayForApproval = ({pendingHolidayRequest, patchRequestedTimeOff}) => {
    
    const handleApproval = (event) => {
        let approvalStatus = {
            status: "APPROVED"
        }
        patchRequestedTimeOff(approvalStatus, pendingHolidayRequest.id)
    }

    const handleRejection = (event) => {
        let approvalStatus = {
            status: "REJECTED"
        }
        patchRequestedTimeOff(approvalStatus, pendingHolidayRequest.id)
    }
    
    return ( 
        <>
            <article id="approvals">
                <p>{pendingHolidayRequest.fullName}</p>
                <p>[{pendingHolidayRequest.startDate}] to [{pendingHolidayRequest.endDate}]</p>
                <p>{pendingHolidayRequest.timeOffType}</p>
                <p>{pendingHolidayRequest.notes}</p>
                <div id="button_container">
                    <button id= "approval_button" onClick={handleApproval}>Approve</button>
                    <button id= "reject_button" onClick={handleRejection}>Reject</button>
                </div>
            </article>
        </>
    );
}
 
export default HolidayForApproval;