package aatest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Morning {
	
	@Test
	public void test()
	{
		System.out.println("welcome");
		
		Assert.assertEquals(11, 10);
		
	}

}
