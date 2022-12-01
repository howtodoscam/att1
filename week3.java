package selenium6640;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class week3 {
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
Thread.sleep(2000);
WebElement createNewAccountButton = 
driver.findElement(By.xpath("(//a[normalize-space()='Create New Account'])[1]"));
createNewAccountButton.click();
Thread.sleep(5000);
WebElement firstName = driver.findElement(By.name("firstname"));
firstName.sendKeys("pvss");
WebElement surName = driver.findElement(By.name("lastname"));
surName.sendKeys("kaushik");
WebElement mobileNoOrEmailId= driver.findElement(By.name("reg_email__"));
mobileNoOrEmailId.sendKeys("1234567890");
WebElement password = driver.findElement(By.name("reg_passwd__"));
password.sendKeys("kaushik@123");
Thread.sleep(2000);
Select dateDropdown = new 
Select(driver.findElement(By.name("birthday_day")));
dateDropdown.selectByValue("02");
Thread.sleep(2000);
Select monthDropdown = new 
Select(driver.findElement(By.name("birthday_month")));
monthDropdown.selectByValue("04");
Thread.sleep(2000);
Select yearDropdown = new 
Select(driver.findElement(By.name("birthday_year")));
yearDropdown.selectByValue("2003");
Thread.sleep(2000);
WebElement femaleRadioBtn = driver.findElement(By.xpath("(//label[normalizespace()='Female'])[1]"));
femaleRadioBtn.click();
Thread.sleep(2000);
WebElement signUpBtn = driver.findElement(By.name("websubmit"));
signUpBtn.click();
Thread.sleep(2000);
System.out.println("Performed click action");
driver.quit();
}
}
