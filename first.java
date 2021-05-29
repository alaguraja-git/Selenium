import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class first {

	public static void main(String[] args) {
		
		
		// Browser - IE
//		System.setProperty("webdriver.ie.driver","C:\\Selenium\\browsers\\IEDriverServer.exe");  
//		WebDriver driver = new InternetExplorerDriver();
		
		
		// Browser - Chrome
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\browsers\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver();		
		driver.get("http://www.google.com");
		driver.close();
		
		

	}

}
