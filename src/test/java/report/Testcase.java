package report;

import org.testng.SkipException;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Testcase {
	@Test
	public void testCase01() {
		
		System.out.println("Test methos 1. fail....");
		Assert.assertTrue(false);
		
	}
	@Test
	public void testCase02() {
		
		System.out.println("Test methos 2. fail....");
		Assert.assertTrue(false);
		
	}
	@Test
	public void testCase03() {
		
		System.out.println("Test methos 3 pass.....");
		Assert.assertTrue(true);
		
	}
	@Test
	public void testCase04() {
		
		System.out.println("Test methos 4 pass.....");
		Assert.assertTrue(true);
		
	}
	@Test
	public void testCase05() {
		
		System.out.println("Test methos 5 skip.....");
		throw new SkipException("skipped");
		
	}

}
