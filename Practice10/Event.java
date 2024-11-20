public class Event {
  private int eventId;
  private String eventName;
  private String eventLocation;
  private String eventOrganizer;
  private long eventDate;
  private String eventType;

  public Event(int eventId, String eventName, String eventLocation, String eventOrganizer, long eventDate, String eventType) {
    this.eventId = eventId;
    this.eventName = eventName;
    this.eventLocation = eventLocation;
    this.eventOrganizer = eventOrganizer;
    this.eventDate = eventDate;
    this.eventType = eventType;
  }

  public int getEventId() {
    return this.eventId;
  }

  public String getEventName() {
    return this.eventName;
  }

  public String getEventLocation() {
    return this.eventLocation;
  }

  public String getEventOrganizer() {
    return this.eventOrganizer;
  }

  public long getEventDate() {
    return this.eventDate;
  }

  public String getEventType() {
    return this.eventType;
  }

  public String toString() {
    return eventId + " " + eventName + " " + eventLocation + " " + eventOrganizer + " " + eventDate + " " + eventType;
  }

  public static void main(String[] args) {
    EventRegister eventRegister = new EventRegister();
    eventRegister.addEvent(1, "name1", "location1", "organizer1", 202101011900L, "type1");
    eventRegister.addEvent(2, "name2", "location1", "organizer2", 202101011800L, "type2");
    eventRegister.addEvent(3, "name3", "location3", "organizer3", 202101031500L, "type3");
    eventRegister.addEvent(4, "name4", "location2", "organizer4", 202101041700L, "type4");

    System.out.println(eventRegister.getEventByLocation("location1"));
    System.out.println(eventRegister.getEventByDate(20210101));
    System.out.println(eventRegister.getEventByDateInterval(202101010000L, 202101020000L));
    System.out.println(eventRegister.getSortedEventsByLocation());
    System.out.println(eventRegister.getSortedEventsByDate());
    System.out.println(eventRegister.getSortedEventsByType("type1"));

  }
}
