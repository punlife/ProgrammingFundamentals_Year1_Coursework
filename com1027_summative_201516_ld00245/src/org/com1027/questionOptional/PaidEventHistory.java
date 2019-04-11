package org.com1027.questionOptional;

import java.util.ArrayList;
import java.util.List;

public class PaidEventHistory extends History<PaidEvent> {

  public PaidEventHistory(Organisation organisation) throws Exception {
    super(organisation);
    // TODO Auto-generated constructor stub
  }

  // Extra Question
  public List<String> listOfSoldOutEvents() {
    List<String> SoldOut = new ArrayList<String>();
    for (PaidEvent pe : PaidEvents) {
      if (pe.getTotalNumberOfSeats() == pe.howManyTicketsPurchased(TicketType.STUDENT)
          + pe.howManyTicketsPurchased(TicketType.MEMBER)) {
        SoldOut.add(pe.getEventName());
      }

    }

    return SoldOut;
  }
}
