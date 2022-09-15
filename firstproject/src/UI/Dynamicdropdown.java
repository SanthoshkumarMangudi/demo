package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\softwares\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("https://rahulshettyacademy.com/dropdownsPractise/");
		drive.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(5000);
		//drive.findElement(By.linkText("Coimbatore (CJB)")).click();
		//drive.findElement(By.xpath("(//a[@value='MAA'])[1]")).click();
		
		//To avoid index we use parent child xpath
		
		drive.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR']//a[@value='CJB']")).click();
		drive.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='DEL']")).click();
		//drive.findElement(By.cssSelector(".ui-datepicker-days-cell-over.ui-datepicker-current-day.ui-datepicker-today")).click();
		drive.findElement(By.xpath("//td[@class=' ui-datepicker-days-cell-over ui-datepicker-today']//a")).click();
	}
}
