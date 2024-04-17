import { Calendar, momentLocalizer } from 'react-big-calendar'
import moment from 'moment'
import "react-big-calendar/lib/css/react-big-calendar.css"

// Setup the localizer by providing the moment (or globalize, or Luxon) Object
// to the correct localizer.
const localizer = momentLocalizer(moment) // or globalizeLocalizer

const WorkCalendar = ({currentUserHolidays}) => {

    const calendarEvents = currentUserHolidays.map((currentUserHoliday) => {
        const endDate = new Date(currentUserHoliday.endDate);
        endDate.setDate(endDate.getDate() + 1);
        const displayEndDate = endDate.toISOString().substring(0, 10);
        return {start:currentUserHoliday.startDate, end: displayEndDate, title:currentUserHoliday.notes}
    })

    return ( 
        <div style={{height: "60vh", width: "60vw", margin: "auto"}}>
            <Calendar
            localizer={localizer}
            events={calendarEvents}
            defaultView={'month'}
            views={['month', 'agenda']}
            />
        </div>
    );
}
 
export default WorkCalendar;