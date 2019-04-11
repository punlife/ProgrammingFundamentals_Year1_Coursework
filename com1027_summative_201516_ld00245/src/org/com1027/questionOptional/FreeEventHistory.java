package org.com1027.questionOptional;

import java.util.ArrayList;
import java.util.List;

public class FreeEventHistory extends History<FreeEvent> {

  public FreeEventHistory(Organisation organisation) throws Exception {
    super(organisation);
    // TODO Auto-generated constructor stub
  }

  public List<String> listOfSoldOutEvents() {
    List<String> SoldOut = new ArrayList<String>();
    for (FreeEvent fe : FreeEvents) {
      if (fe.getTotalNumberOfSeats() == fe.howManyTicketsPurchased(TicketType.STUDENT)
          + fe.howManyTicketsPurchased(TicketType.MEMBER)) {
        SoldOut.add(fe.getEventName());
      }

    }
    return SoldOut;
  }
}
