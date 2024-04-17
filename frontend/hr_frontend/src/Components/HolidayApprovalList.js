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
            <h3>Holidays to be approved:</h3>
            {holidayRequests}
        </>
     );
}
 
export default HolidayApprovalList;