package Practice10;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class EventRegister {
  private List<Event> events = new ArrayList<>();


  public void addEvent(int eventId, String eventName, String eventLocation, String eventOrganizer, long eventDate, String eventType) {
    events.add(new Event(eventId, eventName, eventLocation, eventOrganizer, eventDate, eventType));
  }

  public List<Event> getEventByDate(int date) {
    String dateStr = Integer.toString(date);
    String firstEightDigits = dateStr.substring(0, 8);

    return events.stream()
        .filter(event -> Long.toString(event.getEventDate()).substring(0, 8).equals(firstEightDigits))
        .sorted(Comparator.comparing(e -> Long.toString(e.getEventDate()).substring(8)))
        .collect(Collectors.toList());
  }

  public List<Event> getEventByDateInterval(long startDate, long endDate) {
    return events.stream()
        .filter(event -> event.getEventDate() >= startDate && event.getEventDate() <= endDate)
        .sorted(Comparator.comparingLong(Event::getEventDate))
        .collect(Collectors.toList());
  }

  public List<Event> getEventByLocation(String location) {
    return events.stream()
        .filter(event -> event.getEventLocation().equals(location))
        .collect(Collectors.toList());
  }

  public List<Event> getSortedEventsByDate() {
    return events.stream()
        .sorted(Comparator.comparingLong(Event::getEventDate))
        .collect(Collectors.toList());
  }

  public List<Event> getSortedEventsByType(String type) {
    return events.stream()
        .filter(event -> event.getEventType().equals(type))
        .collect(Collectors.toList());
  }

  public List<Event> getSortedEventsByLocation() {
    return events.stream()
        .sorted(Comparator.comparing(Event::getEventLocation))
        .collect(Collectors.toList());
  }

}
