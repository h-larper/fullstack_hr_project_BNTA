import Holiday from "./Holiday";

const MyHolidaysList = ({currentUserHolidays, deleteHolidayRequest}) => {

    const mappedHolidays = currentUserHolidays.map((holiday, index) => {
        return <Holiday key={index} holiday={holiday} deleteHolidayRequest={deleteHolidayRequest} />
    });

    return ( 
        <>
            <h1>My Holidays List</h1>
            {mappedHolidays}
        </>
     );
}
 
export default MyHolidaysList;