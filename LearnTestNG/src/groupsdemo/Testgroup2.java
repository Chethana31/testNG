package groupsdemo;

import org.testng.annotations.Test;

public class Testgroup2 {
	@Test(groups= {"Smoke"})
	public void Test5()
	{
		System.out.println("My third smoke test case");
	}
	@Test(groups= {"regression"})
	public void Test6()
	{
		System.out.println("My second regression test case");
	}
	@Test(groups= {"functional"})
	public void Test7()
	{
		System.out.println("My second smoke test case");
	}
	@Test(groups= {"regression"})
	public void Test8()
	{
		System.out.println("My third regression test case");
	}



}
