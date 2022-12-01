package selenium6640;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class week9
{
public static void main(String[] args)
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
 //URL launch
 driver.get("https://www.justdial.com/Bangalore/Bakeries");
 // identify elements list with same class nam5e
 List<WebElement> m = driver.findElements(By.xpath("//h2[@class='store-name']"));
 // iterate over list
 for(int i = 0; i< m.size(); i++) {
 //obtain text
 String s = m.get(i).getText();
 System.out.println("Text is: " + s);
 }
 driver.quit();
}
}

