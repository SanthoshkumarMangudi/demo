package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaalert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.get("https://manage.vkdigital.co.in/index.php/lco_portal");
		drive.findElement(By.cssSelector("input[type='submit']")).click();
		System.out.println(drive.switchTo().alert().getText());
		drive.switchTo().alert().accept();
	}

}
