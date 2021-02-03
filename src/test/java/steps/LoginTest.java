package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginTest {
	
	public static ChromeDriver driver;

	@Given("Launch chrome browser and load url") // "C:\\Users\\mamun\\Selenium\\Selenium\\Drivers\\chromedriver.exe"
	public void launchChromeBrowserAndLoadUrl() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver(); // For Chrome
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Given("enter username as (.*)")
	public void enterUsernameAsDemosalesmanager(String uname) {
		driver.findElementById("username").sendKeys(uname);
	}
	@Given("enter password as (.*)")
	public void enterPasswordAsCrmsfa(String pwd) {
		driver.findElementById("password").sendKeys(pwd);
	}
	@When("click the login button")
	public void clickTheLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@Then("its navigated Homepage")
	public void itsNavigatedHomepage() {
		System.out.println(driver.getTitle());
	}
	@Given("click CRMSFA")
	public void clickCRMSFA() {
		driver.findElementByLinkText("CRM/SFA").click();
	}
	@Given("click leads")
	public void clickLeads() {
		driver.findElementByLinkText("Leads").click();
	}
	@Given("click createLead")
	public void clickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
	}
	@When("enter the company as TCS")
	public void enterTheCompanyAsTCS() {
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("TCS");
	}
	@When("enter the first name as Gopi")
	public void enterTheFirstNameAsGopi() {
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Gopi");
	}
	@When("enter the last name as J")
	public void enterTheLastNameAsJ() {
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("J");
	}
	@When("click the create lead button")
	public void clickTheCreateLeadButton() {
		driver.findElementByXPath("//input[@value='Create Lead']").click();
	}
	@Then("its navigated ViewLeadPage")
	public void itsNavigatedViewLeadPage() {
		System.out.println(driver.getTitle());
	}
	@When("click the logout button")
	public void clickTheLogoutButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@Then("verify error msg")
	public void verifyErrMsg(){
		String text = driver.findElementById("errorDiv").getText();
	
		if(text.contains("The Following Errors Occurred")) {
			System.out.println("The given Credentials is wrong");
		}
		
	}
	
	@Then("its navigate same Page")
	public void samePage() {
		System.out.println(driver.getTitle());
	}

@Then("verify the firstname")
public void verify_the_firstname() {
    System.out.println("firstname");
}

@Then("close browser")
public void close_browser() {
   driver.quit();
}

	
}