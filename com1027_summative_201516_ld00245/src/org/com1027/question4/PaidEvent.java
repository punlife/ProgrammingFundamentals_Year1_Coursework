package org.com1027.question4;

import java.util.Map;

public class PaidEvent extends Event {

  // Constructor which receives values from the Event class constructor via
  // the use of super()
  public PaidEvent(String name, EventType eventType, int totalNumberOfSeats, Map<TicketType, Double> prices) {
    super(name, eventType, totalNumberOfSeats, prices);
    // TODO Auto-generated constructor stub
  }

  // This method calculates the total cost of all purchased tickets for this
  // event, and then returns the value
  public double calculateTotalTicketCostOfPurchasedTickets() {
    double totalCost = 0;
    for (TicketType type : TicketType.values()) {
      totalCost += howManyTicketsPurchased(type) * prices.get(type).doubleValue();
    }

    return totalCost;
  }
}
