import { Calendar, momentLocalizer } from 'react-big-calendar'
import moment from 'moment'
import "react-big-calendar/lib/css/react-big-calendar.css"
import '../CSS/WorkCalendar.css';

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
            status:calendarEvent.status, currentUsersEvent:calendarEvent.currentUsersEvent}
    })

    const eventStyleGetter = (event) => {
        let newStyle = {
            backgroundColor: "#D3D3D3",
            color: "#000000"
        }
        if(event.status === "APPROVED"){
            newStyle.backgroundColor = "#B9FF66";
        }
        if(event.status === "REJECTED"){
            newStyle.backgroundColor = "#FFCCCB";
        }
        if(event.currentUsersEvent && event.status === "APPROVED"){
            newStyle.backgroundColor = "#00AD43";
        }
        if(event.currentUsersEvent && event.status === "REJECTED"){
            newStyle.backgroundColor = "#FF6347";
            
        }
        return {
            className: "",
            style: newStyle
        }
    }

    return ( 
        <div id = "calendar" style={{height: "60vh", width: "55vw"}}>
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