# Event Management System

## Overview

A comprehensive event management system implemented in Java that allows you to create, manage, and query events efficiently. This system provides a complete solution for handling events with various attributes such as time, location, and descriptions.

## Features

### Core Functionality

1. **Add Event**: Add new events to the system with unique IDs
2. **Remove Event**: Remove events by their ID
3. **Update Event**: Modify existing event details
4. **Get Event**: Retrieve a specific event by ID
5. **List All Events**: Get a list of all events in the system

### Advanced Queries

1. **Get Events in Time Range**: Find all events that overlap with a specific time period
2. **Get Upcoming Events**: Retrieve events that haven't ended yet from a given time
3. **Get Events by Location**: Filter events by their location
4. **Check Event Existence**: Verify if an event with a specific ID exists
5. **Get Event Count**: Get the total number of events in the system

## Classes

### Event

Represents an individual event with the following properties:
- `id`: Unique identifier for the event
- `name`: Name of the event
- `description`: Detailed description of the event
- `startTime`: Event start time (LocalDateTime)
- `endTime`: Event end time (LocalDateTime)
- `location`: Location where the event takes place

### EventManager

Manages a collection of events and provides methods to:
- Add, remove, and update events
- Query events by various criteria
- Filter events by time range and location

## Usage Example

```java
EventManager manager = new EventManager();

// Create a new event
Event event = new Event(
    "EVT001",
    "Team Meeting",
    "Weekly team sync-up meeting",
    LocalDateTime.of(2026, 1, 10, 10, 0),
    LocalDateTime.of(2026, 1, 10, 11, 0),
    "Conference Room A"
);

// Add event to the system
manager.addEvent(event);

// Get all events
List<Event> allEvents = manager.getAllEvents();

// Get events in a time range
LocalDateTime start = LocalDateTime.of(2026, 1, 10, 0, 0);
LocalDateTime end = LocalDateTime.of(2026, 1, 12, 23, 59);
List<Event> eventsInRange = manager.getEventsInRange(start, end);

// Get upcoming events
List<Event> upcoming = manager.getUpcomingEvents(LocalDateTime.now());

// Update an event
Event updatedEvent = new Event(
    "EVT001",
    "Team Meeting - URGENT",
    "Weekly team sync-up meeting with important updates",
    LocalDateTime.of(2026, 1, 10, 10, 0),
    LocalDateTime.of(2026, 1, 10, 11, 30),
    "Conference Room A"
);
manager.updateEvent("EVT001", updatedEvent);

// Remove an event
manager.removeEvent("EVT001");
```

## Running the Demo

To run the demonstration:

```bash
# Compile the Java files
javac event-management-system/*.java

# Run the demo
java -cp event-management-system EventManagementDemo
```

## API Reference

### EventManager Methods

| Method | Parameters | Return Type | Description |
|--------|-----------|-------------|-------------|
| `addEvent` | `Event event` | `boolean` | Adds a new event to the system |
| `removeEvent` | `String eventId` | `boolean` | Removes an event from the system |
| `updateEvent` | `String eventId, Event updatedEvent` | `boolean` | Updates an existing event |
| `getEvent` | `String eventId` | `Event` | Retrieves a specific event |
| `getAllEvents` | None | `List<Event>` | Returns all events |
| `getEventsInRange` | `LocalDateTime start, LocalDateTime end` | `List<Event>` | Returns events in time range |
| `getUpcomingEvents` | `LocalDateTime fromTime` | `List<Event>` | Returns upcoming events |
| `getEventsByLocation` | `String location` | `List<Event>` | Returns events at a location |
| `getEventCount` | None | `int` | Returns total number of events |
| `hasEvent` | `String eventId` | `boolean` | Checks if event exists |
| `clearAllEvents` | None | `void` | Removes all events |

## Time Complexity

- Add Event: O(1)
- Remove Event: O(1)
- Update Event: O(1)
- Get Event: O(1)
- Get All Events: O(n)
- Get Events in Range: O(n)
- Get Upcoming Events: O(n log n) due to sorting
- Get Events by Location: O(n log n) due to sorting
- Has Event: O(1)
- Get Event Count: O(1)

Where n is the total number of events in the system.

## Space Complexity

O(n) - where n is the number of events stored in the system.

## Design Decisions

1. **HashMap Storage**: Events are stored in a HashMap with event ID as the key for O(1) access time
2. **Immutable IDs**: Event IDs are immutable to maintain data integrity
3. **Time Range Overlap**: The system checks for overlapping time ranges, not just events that start within the range
4. **Sorted Results**: Query results are sorted by start time for better usability
5. **Null Safety**: All methods include null checks to prevent NullPointerExceptions

## Future Enhancements

Potential improvements for the system:
- Add recurring events support
- Implement event conflict detection
- Add event categories/tags
- Support for event attendees/participants
- Event notifications and reminders
- Database persistence
- RESTful API endpoints
- User authentication and authorization

## License

This is a sample implementation for educational purposes.
