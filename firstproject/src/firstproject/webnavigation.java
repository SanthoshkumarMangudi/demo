package firstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webnavigation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\softwares\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		drive.get("https://instagram.com");
		drive.manage().window().maximize();
		drive.navigate().to("https://facebook.com");
		drive.navigate().back();
		drive.navigate().forward();
		drive.navigate().refresh();

	}

}
