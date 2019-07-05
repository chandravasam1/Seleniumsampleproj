package Test1;

import org.testng.annotations.Test;

public class Class123 {
	
	
	@Test(priority=0)
	void setup()
	{
		
		System.out.println("This is the test step");
	}

	@Test(priority=-1)
	void login()
	{
		
		System.out.println("This is the test step");
	}
	@Test(priority=-2)
	void teardown()
	{
		
		System.out.println("Closing browser");
	}

}
