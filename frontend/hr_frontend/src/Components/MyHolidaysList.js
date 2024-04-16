import Holiday from "./Holiday";

const MyHolidaysList = ({currentUserHoliday}) => {

    const mappedHolidays = currentUserHoliday.map((holiday,index) => {
        return <Holiday key={index} holiday = {holiday} />
    })

    return ( 
        <>
        <h1>My Holidays List</h1>
        {mappedHolidays}
        </>
     );
}
 
export default MyHolidaysList;