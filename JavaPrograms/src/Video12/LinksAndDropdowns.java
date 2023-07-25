package Video12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksAndDropdowns {
	public static void main(String[] args) {
	int dropdown=0;
	int link=0;
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/Prajwal/Desktop/Prajwal/Selenium%20Class/sample%20web%20pages/login%20page.html");
	List<WebElement> linkElement = driver.findElements(By.tagName("a"));
	for(WebElement element:linkElement)
		link++;
	List<WebElement> dropdownElement = driver.findElements(By.tagName("select"));
	for(WebElement element:dropdownElement)
		dropdown++;
	System.out.println("No of links are: "+link);
	System.out.println("No of dropdowns are: "+dropdown);
	}
}