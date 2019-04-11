package org.com1027.questionOptional;

import java.util.Map;

public class PaidEvent extends Event {

  public PaidEvent(String name, EventType eventType, int totalNumberOfSeats, Map<TicketType, Double> prices) throws Exception {
    super(name, eventType, totalNumberOfSeats, prices);
    // TODO Auto-generated constructor stub
  }

  public double calculateTotalTicketCostOfPurchasedTickets(String discountCode) {
    double totalCost = 0;
    for (TicketType type : TicketType.values()) {
      totalCost += howManyTicketsPurchased(type) * prices.get(type).doubleValue();
    }
    // Bonus Question4
    if (discountCode.equals("ABC") || discountCode.equals("XYZ")) {
      totalCost = totalCost - (totalCost / 0.20);
    }
    return totalCost;
  }
}
