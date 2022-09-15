package firstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edgebrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\softwares\\selenium web driver\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

	}

}
