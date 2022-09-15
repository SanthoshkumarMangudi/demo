package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class updatedstaticdropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\softwares\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("https://rahulshettyacademy.com/dropdownsPractise/");
		drive.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for(int i=1;i<5;i++)
		{
			drive.findElement(By.id("hrefIncAdt")).click();
		}
		int i=0;
		while(i<3)
		{
			drive.findElement(By.id("hrefIncChd")).click();
			i++;
		}
		drive.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(drive.findElement(By.id("divpaxinfo")).getText());

	}

}
