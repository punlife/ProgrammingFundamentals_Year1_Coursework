package org.com1027.questionOptional;

import java.util.Map;

public class FreeEvent extends Event {

  public FreeEvent(String name, EventType eventType, int totalNumberOfSeats, Map<TicketType, Double> prices) throws Exception {
    super(name, eventType, totalNumberOfSeats, prices);
    constructorValidation();
    setPrice();
  }

  // Extra Question
  public static void setPrice() {
    for (TicketType type : TicketType.values())
      prices.put(type, 0.0);
  }

}