/**
 * EventHistorySolutionTest.java
 */

package org.com1027.question1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

/**
 * Tests the EventHistory class.
 * 
 * @author Helen Treharne
 */
public class EventHistoryTest {

  /**
   * Creating an EventHistory object. Add three free events. Assert that the displayed resulting events is correct.
   * 
   */
  @Test
  public void testDisplayFreeEvents() {
    EventHistory eventHistory = new EventHistory();

    FreeEvent event1 = new FreeEvent("Halloween Evening1", EventType.FREE);
    FreeEvent event2 = new FreeEvent("Halloween Evening2", EventType.FREE);
    FreeEvent event3 = new FreeEvent("Halloween Evening3", EventType.FREE);

    eventHistory.addFreeEvent(event1);
    eventHistory.addFreeEvent(event2);
    eventHistory.addFreeEvent(event3);

    assertEquals("Halloween Evening1: FREE" + "\n" + "Halloween Evening2: FREE" + "\n" + "Halloween Evening3: FREE" + "\n",
        eventHistory.displayFreeEvents());

  }

  @Test
  public void testDisplayPaidEvents() {
    // create an event history object
    // create two paid events
    // assert that their names can be displayed properly
    EventHistory eventHistory = new EventHistory();

    PaidEvent event1 = new PaidEvent("Christmas Party1", EventType.PAID);
    PaidEvent event2 = new PaidEvent("Christmas Party2", EventType.PAID);

    eventHistory.addPaidEvent(event1);
    eventHistory.addPaidEvent(event2);

    assertEquals("Christmas Party1: PAID" + "\n" + "Christmas Party2: PAID" + "\n", eventHistory.displayPaidEvents());
  }

}
