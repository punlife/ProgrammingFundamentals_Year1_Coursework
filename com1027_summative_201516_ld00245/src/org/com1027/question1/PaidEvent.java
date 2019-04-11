package org.com1027.question1;

public class PaidEvent {

  /**
   * 
   * @param name
   *          Contains the event name
   * @param eventType
   *          Type of event, either Free or Paid
   */
  public PaidEvent(String name, EventType eventType) {
    this.name = name;
    this.eventType = eventType;
  }

  private String    name = null;
  private EventType eventType;

  /**
   * Getter
   * 
   * @return Returns the name field
   */
  public String getEventName() {

    return this.name;
  }

  /**
   * Getter
   * 
   * @return Returns the eventType field
   */
  public EventType getEventType() {

    return this.eventType;
  }
}
