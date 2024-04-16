const HolidayForApproval = ({pendingHolidayRequest}) => {
    return ( 
        <>
            <p>{pendingHolidayRequest.fullName}</p>
            <p>[{pendingHolidayRequest.startDate}] to [{pendingHolidayRequest.endDate}]</p>
            <p>{pendingHolidayRequest.timeOffType}</p>
            <p>{pendingHolidayRequest.notes}</p>
        </>
    );
}
 
export default HolidayForApproval;