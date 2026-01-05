import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

class EventManager {
    private Map<String, Event> events;

    public EventManager() {
        this.events = new HashMap<>();
    }

    /**
     * Adds a new event to the system
     * @param event The event to add
     * @return true if event was added successfully, false if event with same ID already exists
     */
    public boolean addEvent(Event event) {
        if (event == null || event.getId() == null) {
            return false;
        }
        if (events.containsKey(event.getId())) {
            return false;
        }
        events.put(event.getId(), event);
        return true;
    }

    /**
     * Removes an event from the system
     * @param eventId The ID of the event to remove
     * @return true if event was removed, false if event was not found
     */
    public boolean removeEvent(String eventId) {
        if (eventId == null || !events.containsKey(eventId)) {
            return false;
        }
        events.remove(eventId);
        return true;
    }

    /**
     * Updates an existing event
     * @param eventId The ID of the event to update
     * @param updatedEvent The updated event data
     * @return true if event was updated, false if event was not found
     */
    public boolean updateEvent(String eventId, Event updatedEvent) {
        if (eventId == null || updatedEvent == null || !events.containsKey(eventId)) {
            return false;
        }
        events.put(eventId, updatedEvent);
        return true;
    }

    /**
     * Gets a specific event by ID
     * @param eventId The ID of the event to retrieve
     * @return The event if found, null otherwise
     */
    public Event getEvent(String eventId) {
        return events.get(eventId);
    }

    /**
     * Gets all events in the system
     * @return List of all events
     */
    public List<Event> getAllEvents() {
        return new ArrayList<>(events.values());
    }

    /**
     * Gets events within a specific time range
     * @param startTime The start of the time range
     * @param endTime The end of the time range
     * @return List of events that overlap with the given time range
     */
    public List<Event> getEventsInRange(LocalDateTime startTime, LocalDateTime endTime) {
        if (startTime == null || endTime == null) {
            return new ArrayList<>();
        }
        
        return events.values().stream()
                .filter(event -> isEventInRange(event, startTime, endTime))
                .sorted(Comparator.comparing(Event::getStartTime))
                .collect(Collectors.toList());
    }

    /**
     * Checks if an event overlaps with a given time range
     * @param event The event to check
     * @param rangeStart The start of the time range
     * @param rangeEnd The end of the time range
     * @return true if the event overlaps with the range, false otherwise
     */
    private boolean isEventInRange(Event event, LocalDateTime rangeStart, LocalDateTime rangeEnd) {
        LocalDateTime eventStart = event.getStartTime();
        LocalDateTime eventEnd = event.getEndTime();
        
        return !(eventEnd.isBefore(rangeStart) || eventStart.isAfter(rangeEnd));
    }

    /**
     * Gets upcoming events (events that haven't ended yet)
     * @param fromTime The reference time to check from
     * @return List of upcoming events sorted by start time
     */
    public List<Event> getUpcomingEvents(LocalDateTime fromTime) {
        if (fromTime == null) {
            return new ArrayList<>();
        }
        
        return events.values().stream()
                .filter(event -> event.getEndTime().isAfter(fromTime))
                .sorted(Comparator.comparing(Event::getStartTime))
                .collect(Collectors.toList());
    }

    /**
     * Gets events by location
     * @param location The location to filter by
     * @return List of events at the specified location
     */
    public List<Event> getEventsByLocation(String location) {
        if (location == null) {
            return new ArrayList<>();
        }
        
        return events.values().stream()
                .filter(event -> location.equals(event.getLocation()))
                .sorted(Comparator.comparing(Event::getStartTime))
                .collect(Collectors.toList());
    }

    /**
     * Gets the total number of events in the system
     * @return The count of events
     */
    public int getEventCount() {
        return events.size();
    }

    /**
     * Checks if an event with the given ID exists
     * @param eventId The ID to check
     * @return true if event exists, false otherwise
     */
    public boolean hasEvent(String eventId) {
        return events.containsKey(eventId);
    }

    /**
     * Clears all events from the system
     */
    public void clearAllEvents() {
        events.clear();
    }
}
