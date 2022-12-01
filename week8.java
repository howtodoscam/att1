package selenium6640;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class week8 {
public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");
Thread.sleep(2000);
WebElement searchBar = driver.findElement(By.name("q"));
searchBar.sendKeys("CMRIT");
searchBar.sendKeys(Keys.ENTER);
Thread.sleep(2000);
driver.findElement(By.xpath("//a[normalize-space()='Images']")).click();
WebElement Image = driver.findElement(By.xpath("//img[@alt='The CMRIT Campus - CMR IT']"));
Actions action = new Actions(driver);
action.contextClick(Image).build().perform();
Robot robot = new Robot();
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(500);
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(500);
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(500);
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(500);
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(500);
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(500);
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(500);
robot.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(500);
robot.keyPress(KeyEvent.VK_ENTER);
Thread.sleep(3000);
robot.keyPress(KeyEvent.VK_ENTER);
System.out.println("downloaded");
driver.close();
}
}
