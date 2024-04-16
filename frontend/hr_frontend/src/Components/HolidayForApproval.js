const HolidayForApproval = ({pendingHolidayRequest}) => {
    
    
    
    return ( 
        <>
            <article>
                <p>{pendingHolidayRequest.fullName}</p>
                <p>[{pendingHolidayRequest.startDate}] to [{pendingHolidayRequest.endDate}]</p>
                <p>{pendingHolidayRequest.timeOffType}</p>
                <p>{pendingHolidayRequest.notes}</p>
                <button>Approve</button>
                <button>Reject</button>
            </article>
        </>
    );
}
 
export default HolidayForApproval;