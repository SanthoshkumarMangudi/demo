package firstproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\softwares\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		drive.get("https://manage.vkdigital.co.in/index.php/lco_portal");
		drive.findElement(By.id("Customername")).sendKeys("9865572595");
		drive.findElement(By.name("pass")).sendKeys("72595");
		drive.findElement(By.name("txtCaptcha")).sendKeys("32869");
		//drive.findElement(By.className("btn")).click();
		//drive.findElement(By.cssSelector("input[name='login']")).click();
		drive.findElement(By.linkText("Forgot Password")).click();
		drive.findElement(By.xpath("//input[@placeholder='User Name']")).sendKeys("9865572595");
		drive.findElement(By.xpath("//form/input[2]")).sendKeys("santhoshcables@gmail.com");
		drive.findElement(By.cssSelector("form input:nth-child(5)")).click();

		System.out.println(drive.getTitle());

	}

}
