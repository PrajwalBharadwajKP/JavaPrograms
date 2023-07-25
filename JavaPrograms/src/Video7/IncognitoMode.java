package Video7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IncognitoMode {
	public static void main(String[] args) {
		ChromeOptions c=new ChromeOptions();
		c.addArguments("headless");
		WebDriver driver=new  ChromeDriver(c);
		
	}

}
