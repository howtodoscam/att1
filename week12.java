package selenium6640;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class week12
{
public static void main(String[] args) throws Exception 
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");
 
Thread.sleep(2000);
WebElement searchBar = driver.findElement(By.name("q"));
searchBar.sendKeys("Convert pdf to word online");
searchBar.sendKeys(Keys.ENTER);
WebElement pdfToWordHyperLink = driver.findElement(
By.xpath("(//h3[normalize-space()='PDF to Word Converter -100% Free - Smallpdf.com'])[1]"));
pdfToWordHyperLink.click();
Thread.sleep(2000);
WebElement popupClose = driver.findElement(By.xpath("(//span[normalizespace()='Got it'])[1]"));
popupClose.click();
WebElement chooseFileBtn = driver.findElement(By.xpath("(//span[normalizespace()='Choose Files'])[1]"));
chooseFileBtn.click();

Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
 StringSelection str = new 
StringSelection("C:\\Users\\LENOVO\\Documents\\sample.pdf");
 clipboard.setContents(str, null);
 Robot robot = new Robot();
 robot.keyPress(KeyEvent.VK_ENTER);
 robot.keyRelease(KeyEvent.VK_ENTER);
 robot.keyPress(KeyEvent.VK_CONTROL);
 robot.keyPress(KeyEvent.VK_V);
 robot.keyRelease(KeyEvent.VK_V);
 robot.keyRelease(KeyEvent.VK_CONTROL);
 robot.keyPress(KeyEvent.VK_ENTER);
 robot.keyRelease(KeyEvent.VK_ENTER);
 Thread.sleep(5000);
 WebElement convertToWord = driver.findElement(By.xpath("(//div)[197]"));
 convertToWord.click();
 WebElement choosePlan = 
driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
 choosePlan.click();
 Thread.sleep(7000);
 WebElement download = driver.findElement(By.xpath("(//div)[212]"));
 download.click();
}
}