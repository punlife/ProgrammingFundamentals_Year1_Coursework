/**
 * EventSolutionTest.java
 */

package org.com1027.question1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests for the Event class.
 * 
 * @author Helen Treharne
 */
public class PaidEventTest {

  /**
   * Creating a paid Event object with valid input parameters for the event. Test that the name and type can be retrieved correctly.
   */

  @Test
  public void testPaidConstruction() {
    PaidEvent event = new PaidEvent("Halloween Evening", EventType.PAID);
    assertEquals("Halloween Evening", event.getEventName());
    assertEquals(EventType.PAID, event.getEventType());
  }

}