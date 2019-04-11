package org.com1027.question4;

import java.util.Map;

public class FreeEvent extends Event {

  // Constructor which receives values from the Event class constructor via
  // the use of super()
  public FreeEvent(String name, EventType eventType, int totalNumberOfSeats, Map<TicketType, Double> prices) {
    super(name, eventType, totalNumberOfSeats, prices);
    // TODO Auto-generated constructor stub
  }

}