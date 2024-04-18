import Holiday from "./Holiday";
import '../CSS/MyHolidaysList.css';

const MyHolidaysList = ({currentUserHolidays, deleteHolidayRequest, putHolidayRequest}) => {

    const mappedHolidays = currentUserHolidays.map((holiday, index) => {
        return <Holiday
                    key={index} 
                    holiday={holiday} 
                    deleteHolidayRequest={deleteHolidayRequest}
                    putHolidayRequest = {putHolidayRequest} 
                />
    });

    return ( 
        <>
            <h1>My Holidays List</h1>
            {mappedHolidays}
        </>
     );
}
 
export default MyHolidaysList;