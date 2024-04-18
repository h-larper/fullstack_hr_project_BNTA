import { Calendar, momentLocalizer } from 'react-big-calendar'
import moment from 'moment'
import "react-big-calendar/lib/css/react-big-calendar.css"

// Setup the localizer by providing the moment (or globalize, or Luxon) Object
// to the correct localizer.
const localizer = momentLocalizer(moment) // or globalizeLocalizer

const WorkCalendar = ({currentUserHolidays, calendarEvents}) => {

    // const calendarEvents = currentUserHolidays.map((currentUserHoliday) => {
    //     const endDate = new Date(currentUserHoliday.endDate);
    //     endDate.setDate(endDate.getDate() + 1);
    //     const displayEndDate = endDate.toISOString().substring(0, 10);
    //     return {start:currentUserHoliday.startDate, end: displayEndDate, title:currentUserHoliday.notes, status:currentUserHoliday.status}
    // })

    const workCalendarEvents = calendarEvents.map((currentUserHoliday) => {
        const endDate = new Date(currentUserHoliday.endDate);
        endDate.setDate(endDate.getDate() + 1);
        const displayEndDate = endDate.toISOString().substring(0, 10);
        return {start:currentUserHoliday.startDate, end: displayEndDate, title:currentUserHoliday.notes, status:currentUserHoliday.status}
    })

    // const inclusiveDate = (date) => {
    //     const endDate = new Date(date);
    //     endDate.setDate(endDate.getDate() + 1);
    //     const displayEndDate = endDate.toISOString().substring(0, 10);
    //     return displayEndDate
    // }

    // const calendarEvents = () => {
    //     console.log("hello");
    //     const currentUserEvents = currentUserHolidays.map((currentUserHoliday) => {
    //         const endDate = new Date(currentUserHoliday.endDate);
    //         endDate.setDate(endDate.getDate() + 1);
    //         const displayEndDate = endDate.toISOString().substring(0, 10);
    //         return {start:currentUserHoliday.startDate, end:displayEndDate, title:currentUserHoliday.notes}
    //         })
    //     console.log(currentUserEvents);
    //     return currentUserEvents;
    // }

    const eventStyleGetter = (event) => {
        let newStyle = {
            backgroundColor: "#000000"
        }
        if(event.status === "APPROVED"){
            newStyle.backgroundColor = "#00FF00";
        }
        if(event.status === "REJECTED"){
            newStyle.backgroundColor = "#FF0000";
        }
        return {
            className: "",
            style: newStyle
        }
    }

    return ( 
        <div style={{height: "60vh", width: "60vw", margin: "auto"}}>
            <Calendar
            localizer={localizer}
            events={workCalendarEvents}
            eventPropGetter={(eventStyleGetter)}
            defaultView={'month'}
            views={['month', 'agenda']}
            />
        </div>
    );
}
 
export default WorkCalendar;