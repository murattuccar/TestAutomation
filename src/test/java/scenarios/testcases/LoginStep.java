package scenarios.testcases;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import pageobjects.LoginPageObjects;
import scenarios.base.StepManager;

public class LoginStep extends StepManager {
	private LoginPageObjects loginPage;
	public LoginStep() {
		super("application");
		loginPage = PageFactory.initElements(this.driver, LoginPageObjects.class);
		set_timeOutValue(10);

	}
	@Given("^user is at landing page for the login process$")
	public void userIsAtLandingPageForTheLoginProcess() {
		getUrl();
	}
//login
	@When("^user clicks sign button and after clicks sign item$")
	public void userClicksSignButtonAndAfterClicksSignItem() {

		getElement(loginPage.Username).sendKeys(user.getUserName());
		getElement(loginPage.Password).sendKeys(user.getUserPassword());
		elementClick(loginPage.SignInButton);

	}

	@And("^user fills username and password$")
	public void userFillsUserNameAndPassword() {

		getElement(loginPage.Username).sendKeys(user.getUserName());
		getElement(loginPage.Password).sendKeys(user.getUserPassword());

	}


	@Then("^user receives notification of successful login$")
	public void userReceivesNotificationOfSuccessfulLogin() {
		elementClick(loginPage.SignInButton);

	}
//WrongPassword
	@When("^user clicks test login area and choose to test login item$")
	public void userClicksTestLoginAreaAndChooseToTestLoginItem() {

		getElement(loginPage.Username).sendKeys(user.getUserName());
		getElement(loginPage.Password).sendKeys(user.getUserPassword());
		elementClick(loginPage.SignInButton);
	}

	@And("^user fills correct username and wrong password$")
	public void userFillsCorrectUsernameAndWrongPassword() {
		elementClick(loginPage.SignInButton);
	}

	@Then("^user receives notification of failed login$")
	public void userReceivesNotificationOfFailedLogin() {

	}
//WrongShortPassword
	@When("^user clicks test login area and choose to test login item$")
	public void userClicksTestLoginAreaAndChooseToTestLoginItem1() {

	
	}
	@And("^user fills correct username and short password$")
	public void userFillsCorrectUsernameAndShortPassword() {
		
	}
	@Then("^user receives notification of failed login$")
	public void userReceivesNotificationOfFailedLogin1() {

	}
//WrongLongPassword	
	@When("^user clicks test login area and choose to test login item$")
	public void userClicksTestLoginAreaAndChooseToTestLoginItem2() {

		
	}
	@And("^user fills correct username and short password$")
	public void userFillsCorrectUsernameAndLongPassword() {
		
	}
	@Then("^user receives notification of failed login$")
	public void userReceivesNotificationOfFailedLogin2() {

	}
//WrongUsername
	@When("^user clicks test login area and choose to test login item$")
	public void userClicksTestLoginAreaAndChooseToTestLoginItem3() {

		
	}
	@And("^user fills wrong username and correct password$")
	public void userFillsWrongUsernameAndCorrectPassword() {
		
	}
	@Then("^user receives notification of failed login$")
	public void userReceivesNotificationOfFailedLogin3() {
		
	}
//WrongShortUsername	
	@When("^user clicks test login area and choose to test login item$")
	public void userClicksTestLoginAreaAndChooseToTestLoginItem4() {

		
	}
	@And("^user fills short username and correct password$")
	public void userFillsShortUsernameAndCorrectPassword() {
	
	
	}
	@Then("^user receives notification of failed login$")
	public void userReceivesNotificationOfFailedLogin4() {
		
	}
//WrongLongUsername	
	@When("^user clicks test login area and choose to test login item$")
	public void userClicksTestLoginAreaAndChooseToTestLoginItem5() {

		
	}
	@And("^user fills long username and correct password$")
	public void userFillsLongUsernameAndCorrectPassword() {
		
	}
	@Then("^user receives notification of failed login$")
	public void userReceivesNotificationOfFailedLogin5() {
		
	}
}
