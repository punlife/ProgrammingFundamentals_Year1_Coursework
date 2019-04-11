/**
 * AllTests.java
 */

package org.com1027.questionOptional;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author Helen Treharne
 */
@RunWith(Suite.class)
@SuiteClasses({ FreeEventTest.class, PaidEventTest.class, EventHistoryTest.class, EventHistoryTest_v2.class, TicketTest.class,
    OrganisationTest.class, ExceptionTest.class })
public class AllTests {
}
