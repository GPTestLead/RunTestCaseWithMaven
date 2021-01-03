package ToolTip;

import org.testng.annotations.Test;

public class FirstTestNG {

	@Test(priority=1,description="Login functionality")
	public void login()
	{
		System.out.println("First Test");
	}
	@Test(priority=2,description="Select functionality")
	public void SelectItem()
	{
		System.out.println("Item selected");
	}
	@Test(priority=-3,description="Select functionality")
	public void Checkout()
	{
		System.out.println("Checkout");
	}
}
