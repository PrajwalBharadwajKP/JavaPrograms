package Video15;

import java.time.Duration;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FetchBrowserNameAndVersion {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Capabilities cap=((RemoteWebDriver) driver).getCapabilities();
		System.out.println(cap.getBrowserName());
		System.out.println(cap.getBrowserVersion());
	}

}
