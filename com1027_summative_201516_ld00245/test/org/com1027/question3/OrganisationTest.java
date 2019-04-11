/**
 * OrganisationSolutionTest.java
 */

package org.com1027.question3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

/**
 * Tests for the <code>Organisation</code> class.
 * 
 * @author Helen Treharne
 */
public class OrganisationTest {

  /**
   * Creating an Organisation object with a valid name. Testing that the name can be retrieved correctly.
   */
  @Test
  public void testConstruction() {
    Organisation owner = new Organisation("Surrey University");
    assertEquals("Surrey University", owner.getName());
  }

}
