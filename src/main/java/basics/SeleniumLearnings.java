package basics;

import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumLearnings
{

	public static void main(String[] args)
	{
		SeleniumLearnings sel=new SeleniumLearnings();
		sel.helloWorld();
	}
	
	public static void  helloWorld()
	{
		System.out.println("Static method can be called using objects as well.");
	}

}
