package selenium6640;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class week4 {
public static void main(String[] args) throws InterruptedException
{
Map<String, Object> prefs = new HashMap<String, Object>();
//add key and value to map as follow to switch off browser notification
//Pass the argument 1 to allow and 2 to block
prefs.put("profile.default_content_setting_values.notifications", 2);
//Create an instance of ChromeOptions
ChromeOptions options = new ChromeOptions();
// set ExperimentalOption - prefs
options.setExperimentalOption("prefs", prefs);
System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");
WebDriver driver = new ChromeDriver(options);
driver.manage().window().maximize();
driver.get("https://www.axisbank.com/");
Thread.sleep(2000);
WebElement popupClose = 
driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]"));
popupClose.click();
driver.close();
Thread.sleep(2000);
}
}
