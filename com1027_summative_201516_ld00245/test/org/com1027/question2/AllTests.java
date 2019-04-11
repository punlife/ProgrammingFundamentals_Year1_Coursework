/**
 * AllSolutionTests.java
 */

package org.com1027.question2;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author Helen Treharne
 */
@RunWith(Suite.class)
@SuiteClasses({ FreeEventTest.class, PaidEventTest.class, EventHistoryTest.class, TicketTest.class, OrganisationTest.class })
public class AllTests {
}
