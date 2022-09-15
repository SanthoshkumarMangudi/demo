package greenkart;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multipleproducts {
	public static void main(String[] args) throws InterruptedException {
		String[] productsneed = {"Cauliflower","Cucumber","Carrot","Beans"};
		int j=0;
	    System.setProperty("webdriver.chrome.driver", "C:\\softwares\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		 List<WebElement> products =  drive.findElements(By.cssSelector("h4[class='product-name']"));
		 
		 for(int i=0;i<products.size();i++)
		 {
			String[] name=products.get(i).getText().split("-");
			String productsrequired =name[0].trim();
			List listproductsneed=Arrays.asList(productsneed);
			if(listproductsneed.contains(productsrequired))
			{
				j++;
			    drive.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			    if(j==productsneed.length)
			    {
			    	break;
			    }
			}
		 }
		
	}

}
