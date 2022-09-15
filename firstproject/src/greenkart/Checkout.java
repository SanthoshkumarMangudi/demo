package greenkart;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Checkout {

	public static void main(String[] args) throws InterruptedException {
String[] productsneed = {"Cauliflower","Cucumber","Carrot","Beans"};
		
	    System.setProperty("webdriver.chrome.driver", "C:\\softwares\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//addtocart(drive,productsneed );  //to call this method
		Addtocartmethod a =new Addtocartmethod();
		a.addtocart(drive, productsneed);
		drive.findElement(By.cssSelector("a.cart-icon")).click();
		drive.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		/*WebDriverWait wait = new WebDriverWait(drive,Duration.ofSeconds(5));        <--implicit wait-->
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));*/
		drive.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		drive.findElement(By.cssSelector("button.promoBtn")).click();
		//drive.findElement(By.cssSelector("span.promoInfo")).getText();
		WebDriverWait waits = new WebDriverWait(drive,Duration.ofSeconds(5));
		waits.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
				
		
		Assert.assertEquals(drive.findElement(By.cssSelector("span.promoInfo")).getText(),"Code applied ..!");
		drive.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		drive.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/select[1]")).click();
		drive.findElement(By.xpath("//option[contains(text(),'India')]")).click();
		drive.findElement(By.cssSelector("input.chkAgree")).click();
		drive.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
		
		
		
		}
	public void addtocart (WebDriver drive,String[] productsneed)
	{
	int j=0;
	 List<WebElement> products =  drive.findElements(By.cssSelector("h4[class='product-name']"));
	 
	 for(int i=0;i<products.size();i++)
	 {
		String[] name=products.get(i).getText().split("-");
		String productsrequired =name[0].trim();
		List listproductsneed=Arrays.asList(productsneed);//to convert  static to dynamic 
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
