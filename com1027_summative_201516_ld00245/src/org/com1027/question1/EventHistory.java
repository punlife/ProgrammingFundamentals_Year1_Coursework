package org.com1027.question1;

import java.util.ArrayList;
import java.util.List;

public class EventHistory {

  List<FreeEvent> FreeEvents = new ArrayList<FreeEvent>();
  List<PaidEvent> PaidEvents = new ArrayList<PaidEvent>();

  /**
   * Passes a free event object into the method then adds it to the list.
   * 
   * @param event
   *          Free event object that is passed in and added to the list
   */
  public void addFreeEvent(FreeEvent event) {
    FreeEvents.add(event);
  }

  /**
   * Passes a paid event object into the method then adds it to the list.
   * 
   * @param event
   *          Paid event object that is passed in and added to the list
   */
  public void addPaidEvent(PaidEvent event) {
    PaidEvents.add(event);
  }

  /**
   * Creates a string with all the free event names and event types and then returns it
   * 
   * @return String with all event names and types and returns it
   */
  public String displayFreeEvents() {
    String displayEvent = null;
    for (FreeEvent event : FreeEvents) {
      if (displayEvent == null) {
        displayEvent = event.getEventName() + ": " + event.getEventType() + "\n";
      }
      else {
        displayEvent += event.getEventName() + ": " + event.getEventType() + "\n";
      }
    }
    return displayEvent;
  }

  /**
   * Creates a string with all the paid event names and event types and then returns it
   * 
   * @return String with all event names and types and returns it
   */
  public String displayPaidEvents() {
    String displayEvent = null;
    for (PaidEvent event : PaidEvents) {
      if (displayEvent == null) {
        displayEvent = event.getEventName() + ": " + event.getEventType() + "\n";
      }
      else {
        displayEvent += event.getEventName() + ": " + event.getEventType() + "\n";
      }
    }
    return displayEvent;
  }
}
