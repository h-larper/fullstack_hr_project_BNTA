import { useContext } from "react";
import currentUserContext from "./CurrentUserContext";
import HolidayForApproval from "./HolidayForApproval";

const HolidayApprovalList = ({pendingHolidayRequests, patchRequestedTimeOff}) => {

    const currentUser = useContext(currentUserContext);

    const holidayRequests = pendingHolidayRequests.map((pendingHolidayRequest) => {
        return <HolidayForApproval pendingHolidayRequest={pendingHolidayRequest} patchRequestedTimeOff={patchRequestedTimeOff} key={pendingHolidayRequest.id}/>
    });
    
    return ( 
        <>
            <h4>Holidays To Be Approved</h4>
            {holidayRequests}
        </>
     );
}
 
export default HolidayApprovalList;