import { Calendar, momentLocalizer } from 'react-big-calendar'
import moment from 'moment'
import "react-big-calendar/lib/css/react-big-calendar.css"

// Setup the localizer by providing the moment (or globalize, or Luxon) Object
// to the correct localizer.
const localizer = momentLocalizer(moment) // or globalizeLocalizer

const WorkCalendar = ({calendarEvents}) => {

    const workCalendarEvents = calendarEvents.map((calendarEvent) => {
        const endDate = new Date(calendarEvent.endDate);
        endDate.setDate(endDate.getDate() + 1);
        const displayEndDate = endDate.toISOString().substring(0, 10);
        return {start:calendarEvent.startDate, end: displayEndDate,
            title:calendarEvent.fullName + ": " + calendarEvent.notes,
            status:calendarEvent.status, isCurrentUsersEvent:calendarEvent.isCurrentUsersEvent}
    })

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