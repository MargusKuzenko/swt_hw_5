package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv1 {

	@Test(timeout = 4000)
	public void testCreatesNextDateAndCallsRun() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1529), (-1529), (-1529));
	    String string0 = nextDate0.run(12, 31, 2013);
	    assertEquals("12/32/2013", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate1() throws Throwable {
	    NextDate nextDate0 = new NextDate(28, 0, 2);
	    String string0 = nextDate0.run(3, 28, 2021);
	    assertEquals("3/29/2021", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate0() throws Throwable {
	    NextDate nextDate0 = new NextDate((-27), 28, 882);
	    String string0 = nextDate0.run(5, 28, 1860);
	    assertEquals("5/29/1860", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate3() throws Throwable {
	    NextDate nextDate0 = new NextDate(1931, 2, 1931);
	    String string0 = nextDate0.run(2, 30, 1801);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate2() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(1, 1, 1840);
	    assertEquals("1/2/1840", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate5() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 29, 1803);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate4() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 28, 1801);
	    assertEquals("3/1/1801", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1529), (-1529), (-1529));
	    String string0 = nextDate0.run(12, 31, 2013);
	    assertEquals("12/32/2013", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate(28, 0, 2);
	    String string0 = nextDate0.run((-133), 3, 28);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive1() throws Throwable {
	    NextDate nextDate0 = new NextDate(1801, 1801, 1801);
	    String string0 = nextDate0.run(4, 11, 1801);
	    assertEquals("4/12/1801", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate14() throws Throwable {
	    NextDate nextDate0 = new NextDate(28, 0, 2);
	    String string0 = nextDate0.run(28, 3, 10);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithZeroAndNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate(1088, (-4608), (-4608));
	    String string0 = nextDate0.run(0, (-4105), 8);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive0() throws Throwable {
	    NextDate nextDate0 = new NextDate(248, 28, 8);
	    String string0 = nextDate0.run(6, 12, 1857);
	    assertEquals("6/13/1857", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate13() throws Throwable {
	    NextDate nextDate0 = new NextDate(28, 0, 2);
	    String string0 = nextDate0.run(2, 8, 1805);
	    assertEquals("2/9/1805", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive2() throws Throwable {
	    NextDate nextDate0 = new NextDate(1905, 10, 1905);
	    String string0 = nextDate0.run(10, 10, 1905);
	    assertEquals("10/11/1905", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate15() throws Throwable {
	    NextDate nextDate0 = new NextDate(28, 0, 2);
	    String string0 = nextDate0.run(3, 2, 1000);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate7() throws Throwable {
	    NextDate nextDate0 = new NextDate((-2780), 12, 12);
	    String string0 = nextDate0.run(12, 8, 1801);
	    assertEquals("12/9/1801", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate6() throws Throwable {
	    NextDate nextDate0 = new NextDate(7, 7, 7);
	    String string0 = nextDate0.run(7, 7, 1804);
	    assertEquals("7/7/1804", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate9() throws Throwable {
	    NextDate nextDate0 = new NextDate(9, 9, 9);
	    String string0 = nextDate0.run(9, 30, 1801);
	    assertEquals("10/1/1801", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate8() throws Throwable {
	    NextDate nextDate0 = new NextDate(1879, 11, 1879);
	    String string0 = nextDate0.run(11, 31, 1879);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate10() throws Throwable {
	    NextDate nextDate0 = new NextDate(1879, 8, 1879);
	    String string0 = nextDate0.run(8, 31, 1879);
	    assertEquals("9/1/1879", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate12() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 3, 3);
	    String string0 = nextDate0.run(6, 1522, 2525);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate11() throws Throwable {
	    NextDate nextDate0 = new NextDate(28, 18, 6);
	    String string0 = nextDate0.run(3, 972, 2021);
	    assertEquals("invalid Input Date", string0);
	}

}