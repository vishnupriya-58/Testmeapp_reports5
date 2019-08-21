package cucumber_reports_stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Mytest999_steps {

WebDriver driver;
@Given("TestMe is up and running")
public void testme_is_up_and_running() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_h2a.06.15\\Downloads\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	 driver.manage().window().maximize();
}

@Then("user enters valid credentials")
public void user_enters_valid_credentials() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	driver.findElement(By .name("userName")).sendKeys("lalitha");
	driver.findElement(By .name("password")).sendKeys("password123");
	driver.findElement(By .name("Login")).click();
}

@Then("verifies for the login status for his credentials")
public void verifies_for_the_login_status_for_his_credentials() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	boolean b=driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")).isDisplayed();
	Assert.assertTrue(b);
	driver.close();
}

}
