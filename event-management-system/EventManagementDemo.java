import java.time.LocalDateTime;
import java.util.List;

public class EventManagementDemo {
    public static void main(String[] args) {
        EventManager manager = new EventManager();
        
        System.out.println("=== Event Management System Demo ===\n");
        
        // Create some sample events
        Event event1 = new Event(
            "EVT001",
            "Team Meeting",
            "Weekly team sync-up meeting",
            LocalDateTime.of(2026, 1, 10, 10, 0),
            LocalDateTime.of(2026, 1, 10, 11, 0),
            "Conference Room A"
        );
        
        Event event2 = new Event(
            "EVT002",
            "Project Presentation",
            "Q4 project presentation to stakeholders",
            LocalDateTime.of(2026, 1, 12, 14, 0),
            LocalDateTime.of(2026, 1, 12, 16, 0),
            "Main Auditorium"
        );
        
        Event event3 = new Event(
            "EVT003",
            "Training Session",
            "Java advanced topics training",
            LocalDateTime.of(2026, 1, 15, 9, 0),
            LocalDateTime.of(2026, 1, 15, 12, 0),
            "Training Room B"
        );
        
        // Add events
        System.out.println("Adding events...");
        System.out.println("Event 1 added: " + manager.addEvent(event1));
        System.out.println("Event 2 added: " + manager.addEvent(event2));
        System.out.println("Event 3 added: " + manager.addEvent(event3));
        System.out.println("Total events: " + manager.getEventCount() + "\n");
        
        // Try to add duplicate
        System.out.println("Trying to add duplicate event: " + manager.addEvent(event1));
        System.out.println();
        
        // List all events
        System.out.println("All Events:");
        List<Event> allEvents = manager.getAllEvents();
        for (Event event : allEvents) {
            System.out.println("  - " + event.getName() + " at " + event.getLocation() + 
                             " (" + event.getStartTime() + ")");
        }
        System.out.println();
        
        // Get events in range
        System.out.println("Events between Jan 10 and Jan 13, 2026:");
        LocalDateTime rangeStart = LocalDateTime.of(2026, 1, 10, 0, 0);
        LocalDateTime rangeEnd = LocalDateTime.of(2026, 1, 13, 23, 59);
        List<Event> eventsInRange = manager.getEventsInRange(rangeStart, rangeEnd);
        for (Event event : eventsInRange) {
            System.out.println("  - " + event.getName() + " (" + event.getStartTime() + ")");
        }
        System.out.println();
        
        // Get upcoming events
        System.out.println("Upcoming events from Jan 11, 2026:");
        LocalDateTime now = LocalDateTime.of(2026, 1, 11, 0, 0);
        List<Event> upcomingEvents = manager.getUpcomingEvents(now);
        for (Event event : upcomingEvents) {
            System.out.println("  - " + event.getName() + " (" + event.getStartTime() + ")");
        }
        System.out.println();
        
        // Update an event
        System.out.println("Updating event EVT001...");
        Event updatedEvent1 = new Event(
            "EVT001",
            "Team Meeting - URGENT",
            "Weekly team sync-up meeting - Important updates",
            LocalDateTime.of(2026, 1, 10, 10, 0),
            LocalDateTime.of(2026, 1, 10, 11, 30),
            "Conference Room A"
        );
        System.out.println("Event updated: " + manager.updateEvent("EVT001", updatedEvent1));
        Event retrieved = manager.getEvent("EVT001");
        System.out.println("Updated event: " + retrieved.getName() + "\n");
        
        // Get events by location
        System.out.println("Events at Conference Room A:");
        List<Event> roomAEvents = manager.getEventsByLocation("Conference Room A");
        for (Event event : roomAEvents) {
            System.out.println("  - " + event.getName());
        }
        System.out.println();
        
        // Remove an event
        System.out.println("Removing event EVT003...");
        System.out.println("Event removed: " + manager.removeEvent("EVT003"));
        System.out.println("Total events after removal: " + manager.getEventCount() + "\n");
        
        // Check if event exists
        System.out.println("Does EVT002 exist? " + manager.hasEvent("EVT002"));
        System.out.println("Does EVT003 exist? " + manager.hasEvent("EVT003"));
        
        System.out.println("\n=== Demo Complete ===");
    }
}
