package org.com1027.questionOptional;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class ExceptionTest {

  @Test(expected = LackCapitalOrganisationException.class)
  public void LackCapitalOrganisationExceptionTest() throws Exception {
    Organisation organisation = new Organisation("surrey University");
    FreeEventHistory eventHistory = new FreeEventHistory(organisation);
  }

  @Test(expected = NullEventNameException.class)
  public void NullEventNameExceptionTest() throws Exception {
    Map<TicketType, Double> prices = new HashMap<>();
    prices.put(TicketType.MEMBER, 0.0);
    prices.put(TicketType.STUDENT, 0.0);
    prices.put(TicketType.CONCESSION, 0.0);
    FreeEvent obj = new FreeEvent(null, EventType.FREE, 10, prices);
  }

  @Test(expected = NullEventTypeException.class)
  public void NullEventTypeExceptionTest() throws Exception {
    Map<TicketType, Double> prices = new HashMap<>();
    prices.put(TicketType.MEMBER, 0.0);
    prices.put(TicketType.STUDENT, 0.0);
    prices.put(TicketType.CONCESSION, 0.0);
    FreeEvent obj = new FreeEvent("Halloween Evening", null, 10, prices);
  }

  @Test(expected = NullEventPricesException.class)
  public void NullEventPricesExceptionTest() throws Exception {
    PaidEvent obj = new PaidEvent("Halloween Evening", EventType.FREE, 10, null);
  }
}
