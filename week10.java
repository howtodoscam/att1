package selenium6640;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class week10 {
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://gmail.com/");
driver.manage().window().maximize();
Thread.sleep(2000);
WebElement createAccount = 
driver.findElement(By.xpath("(//span[normalize-space()='Create account'])[1]"));
createAccount.click();
WebElement mySelft = driver.findElement(By.xpath("(//span[normalizespace()='For myself'])[1]"));
mySelft.click();
WebElement firstName = driver.findElement(By.name("firstName"));
firstName.sendKeys("pvss");
WebElement lastName = driver.findElement(By.name("lastName"));
lastName.sendKeys("kaushik");
WebElement username = driver.findElement(By.name("Username"));
username.sendKeys("pvsskaushik");
WebElement password = driver.findElement(By.name("Passwd"));
password.sendKeys("kaushik@123");
WebElement confirmPassword = 
driver.findElement(By.name("ConfirmPasswd"));
confirmPassword.sendKeys("kaushik@123");
WebElement nxtButton = driver.findElement(By.xpath("(//span[normalizespace()='Next'])[1]"));
nxtButton.click();
Thread.sleep(3000);
WebElement phoneNumber = 
driver.findElement(By.xpath("(//input[@id='phoneNumberId'])[1]"));
phoneNumber.sendKeys("9032347374");
/*
* Select month = new
* Select(driver.findElement(By.xpath("(//select[@id='month'])[1]")));
* month.selectByValue("8");
*
*
* WebElement day = 
driver.findElement(By.xpath("(//input[@id='day'])[1]"));
* day.sendKeys("24");
*
80
* WebElement year = 
driver.findElement(By.xpath("(//input[@id='year'])[1]"));
* year.sendKeys("1996");
*
* Select gender = new
* Select(driver.findElement(By.xpath("(//select[@id='gender'])[1]")));
* gender.selectByValue("1");
*/
WebElement nxtButton2 = driver.findElement(By.xpath("(//span[normalizespace()='Next'])[1]"));
nxtButton2.click();
}
}