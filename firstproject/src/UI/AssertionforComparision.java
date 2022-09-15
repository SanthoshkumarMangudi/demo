package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertionforComparision {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\softwares\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("https://rahulshettyacademy.com/dropdownsPractise/");
		drive.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		System.out.println(drive.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		Assert.assertTrue(drive.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		//Assert.assertFalse(drive.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		//here static dropdown is used
		drive.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for(int i=1;i<5;i++)
		{
			drive.findElement(By.id("hrefIncAdt")).click();
		}
		drive.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(drive.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(drive.findElement(By.id("divpaxinfo")).getText(),"5 Adult");
	}

}
