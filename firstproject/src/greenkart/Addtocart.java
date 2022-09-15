package greenkart;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addtocart {

	public static void main(String[] args) {
	    System.setProperty("webdriver.chrome.driver", "C:\\softwares\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		 List<WebElement> products =  drive.findElements(By.cssSelector("h4[class='product-name']"));
		 for(int i=0;i<products.size();i++)
		 {
			String name=products.get(i).getText();
			if(name.contains("Beetroot"))
			{
			    drive.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			    break;
			}
		 }
		

	}

}
