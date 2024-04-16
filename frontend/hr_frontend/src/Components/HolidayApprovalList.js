import { useContext } from "react";
import currentUserContext from "./CurrentUserContext";

const HolidayApprovalList = ({pendingHolidayRequests}) => {

    const currentUser = useContext(currentUserContext);

    console.log(pendingHolidayRequests);
    const holidayRequests = pendingHolidayRequests.map((pendingHolidayRequest) => <p> Hello </p>);
    
    return ( 
        <>
            <h3>Holidays to be approved:</h3>
            {holidayRequests}
        </>
     );
}
 
export default HolidayApprovalList;