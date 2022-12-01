package selenium6640;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class week11 {
public static void main(String[] args) throws InterruptedException
{
// System property for chrome driver
System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");
//Using driver ref variable creating new obj for chromedriver
WebDriver driver = new ChromeDriver();
//Maximizing the chrome browser
driver.manage().window().maximize();
//MouseActions
//Actions builder = new Actions(driver);
// Launch google website
driver.get("https://www.google.co.in/");
 //Fetching the google searchBar
WebElement searchBar = driver.findElement(By.name("q"));
//Sending myntra in searchbar
searchBar.sendKeys("Myntra");
Thread.sleep(1000);
//Submitting the data
searchBar.submit();
//Fetching myntralink from google search
WebElement myntraLink = 
driver.findElement(By.xpath("(//h3[contains(text(),'Myntra: Online Shopping for Women, Men,Kids Fashi')])[1]"));
myntraLink.click();
WebElement profileHyperLink = 
driver.findElement(By.xpath("(//span[normalize-space()='Profile'])[1]"));
profileHyperLink.click();
WebElement loginBtn = 
driver.findElement(By.xpath("(//a[normalize-space()='login / Signup'])[1]"));
loginBtn.click();
WebElement mobileNo = 
driver.findElement(By.xpath("(//input[@type='tel'])[1]"));
mobileNo.sendKeys("9032347374");
WebElement continueBtn = 
driver.findElement(By.xpath("(//div[@class='submitBottomOption'])[1]"));
continueBtn.click();
Thread.sleep(1000);
WebElement otp01 = 
driver.findElement(By.xpath("(//input[@name='otp0'])[1]"));
otp01.sendKeys("1");
WebElement otp02 = 
driver.findElement(By.xpath("(//input[@name='otp1'])[1]"));
otp02.sendKeys("2");
WebElement otp03 = 
driver.findElement(By.xpath("(//input[@name='otp2'])[1]"));
otp03.sendKeys("3");
WebElement otp04 = 
driver.findElement(By.xpath("(//input[@name='otp3'])[1]"));
otp04.sendKeys("4");
driver.close();
}
}