package groupsdemo;

import org.testng.annotations.Test;

public class Testgroup1 {
	
	@Test(groups= {"Smoke"})
	public void Test1()
	{
		System.out.println("My first smoke Test case");
	}
	@Test(groups= {"Smoke"})
	public void Test2()
	{
		System.out.println("My second smoke test case");
	}

	
	@Test(groups= {"functional"})
	public void Test3()
	{
		System.out.println("My first functional Test case");
	}
	
	@Test(groups= {"regression"})
	public void Test4()
	{
		System.out.println("My first regression Test case");
	}

}
