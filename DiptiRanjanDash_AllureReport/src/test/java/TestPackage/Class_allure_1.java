package TestPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class Class_allure_1 {
	@Listeners({AllureListener.class})
	public class Tests extends Baseclass{

		public WebDriver driver;
	@BeforeClass
	public void openbrowser()
	{
		
	Baseclass bs= new Baseclass();
	driver = bs.initialize_driver();
    driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	//test method 1
    @Test(priority = 2)
    @Description("Test execution test case-1")
    @Epic("epicId-1")
    @Feature("Perform login scenario")
    @Story("perform the use execution login sceanrio")
    @Step("verify the login scenario")
    @Severity(SeverityLevel.CRITICAL)
    public void Loginscenario() throws InterruptedException 
    {
    Thread.sleep(4000);
    WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
    username.sendKeys("Admin");
    Thread.sleep(4000);
    WebElement password= driver.findElement(By.xpath("//input[@placeholder='Password']"));
    Thread.sleep(4000);
    password.sendKeys("admin123");
    WebElement loginbutton= driver.findElement(By.xpath("//button[normalize-space()='Login']"));
    loginbutton.click();
    Thread.sleep(4000);
    }
    
    //test method 2
    @Test(priority = 1)
    @Description("Test execution test case-1")
    @Epic("epicId-2")
    @Feature("Perform login scenario")
    @Story("perform the use execution login sceanrio")
    @Step("verify the login scenario")
    @Severity(SeverityLevel.BLOCKER)
    public void Adminscenario() throws InterruptedException 
    {
    Thread.sleep(4000);
    WebElement username=driver.findElement(By.xpath("//input[@placeholder='username']"));
    username.sendKeys("Admin");
    Assert.fail();
    Thread.sleep(4000);
    WebElement password= driver.findElement(By.xpath("//input[@placeholder='Password']"));
    Thread.sleep(4000);
    password.sendKeys("admin123");
    WebElement loginbutton= driver.findElement(By.xpath("//button[normalize-space()='Login']"));
    loginbutton.click();
    Thread.sleep(4000);
    }
    
    //test method 3
    @Test(priority = 3)
    @Description("Test execution test case-1")
    @Epic("epicId-3")
    @Feature("Perform login scenario")
    @Story("perform the use execution login sceanrio")
    @Step("verify the login scenario")
    @Severity(SeverityLevel.MINOR)
    public void Bothsceanrio() throws InterruptedException 
    {
    Thread.sleep(4000);
    WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
    username.sendKeys("Admin");
    Thread.sleep(4000);
    WebElement password= driver.findElement(By.xpath("//input[@placeholder='Password']"));
    Thread.sleep(4000);
    password.sendKeys("admin123");
    WebElement loginbutton= driver.findElement(By.xpath("//button[normalize-space()='Login']"));
    loginbutton.click();
    Assert.fail();
    Thread.sleep(4000);
    }
    
    @AfterClass
    public void closebrowser()
    {
    	System.out.println("closing the browser");
    	driver.close();
    }
	}
}