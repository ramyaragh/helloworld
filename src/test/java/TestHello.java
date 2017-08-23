//package simplePackage;

import simplepackage.*;

/**
 * @author Ramya Raghavendra
 *         Created on 8/23/17.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class TestHello {

	@Test
	public void testConcatenate() {
		Hello myUnit = new Hello();

		String result = myUnit.concatenate("one", "two");

		assertEquals("onetwo", result);

	}

	@Test
	public void testAdd() {
		Hello myUnit = new Hello();

		int result = myUnit.add(10,20);

		assertEquals(30, result);
	}
}