package firstproject;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class locators2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\softwares\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*System.setProperty("webdriver.edge.driver","C:\\softwares\\selenium web driver\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();*/
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		locators2 s =new locators2();
		String password=s.getpassword(driver);
		System.out.println(password);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.id("inputUsername")).sendKeys("santhosh");

		driver.findElement(By.name("inputPassword")).sendKeys(password);

		driver.findElement(By.className("signInBtn")).click();

		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());

		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");

		driver.findElement(By.xpath("//*[text()='Log Out']")).click();

		driver.close();






		}
         public String getpassword(WebDriver driver) throws InterruptedException
         {
        	 driver.get("https://rahulshettyacademy.com/locatorspractice/"); 
        	 driver.findElement(By.linkText("Forgot your password?")).click();

        	 Thread.sleep(1000);

        	 driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        	 String passwordtext =driver.findElement(By.cssSelector("form p")).getText();
        	 String[] passwordright = passwordtext.split("'");
             String[] passwordleft=passwordright[1].split("'");
             String password=passwordleft[0];
             return password;
             




		}













		}