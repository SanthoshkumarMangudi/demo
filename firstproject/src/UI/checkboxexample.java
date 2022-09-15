package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkboxexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\softwares\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("https://rahulshettyacademy.com/AutomationPractice/");
		drive.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		Assert.assertTrue(drive.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		drive.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		Assert.assertFalse(drive.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		
		System.out.println(drive.findElements(By.cssSelector("input[type='checkbox']")).size());

}
}