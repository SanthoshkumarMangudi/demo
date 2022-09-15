package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\softwares\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("https://rahulshettyacademy.com/dropdownsPractise/");
		drive.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		System.out.println(drive.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		System.out.println(drive.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		System.out.println(drive.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		System.out.println(drive.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		
		System.out.println(drive.findElements(By.cssSelector("input[type='checkbox']")).size());

	}

}
