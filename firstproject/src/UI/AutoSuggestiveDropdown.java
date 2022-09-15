package UI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\softwares\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("https://rahulshettyacademy.com/dropdownsPractise/");
		drive.findElement(By.id("autosuggest")).sendKeys("united");
		Thread.sleep(5000);
		 List<WebElement> options =drive.findElements(By.cssSelector("li[class=ui-menu-item] a"));
		for(WebElement option:options)
		{
			if(option.getText().equalsIgnoreCase("United Kingdom (UK)"))
			{
			option.click();
			break;
			}
		}
			
		

	}

}
