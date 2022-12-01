package selenium6640;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class week7 {
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();
Thread.sleep(2000);
WebElement searchBar = driver.findElement(By.name("q"));
searchBar.sendKeys("CMRIT");
searchBar.sendKeys(Keys.ENTER);
Thread.sleep(15000);
driver.quit();
}
}
