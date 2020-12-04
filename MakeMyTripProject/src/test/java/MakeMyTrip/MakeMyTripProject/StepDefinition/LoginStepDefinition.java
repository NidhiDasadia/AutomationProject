package MakeMyTrip.MakeMyTripProject.StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import MakeMyTrip.MakeMyTripProject.PageObject.LoginPageObject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStepDefinition{
	public WebDriver driver;
	
	LoginPageObject login= new LoginPageObject(driver);
	
	@Given("^Launch the application$")
	public void launchApplication() {
		login.launchApplication();
	}

	@And("^I click on login button$")
	public void clickOnLoginButton()
	{
		login.clickOnLoginButton();
	}
	
	@And("^I enter email \"([^\"]*)\" in login textbox$")
	public void enterEmail(String text) {
		login.enterEmail(text);
	}
	
	@And("^I enter password \"([^\"]*)\" in login textbox$")
	public void enterPassword(String text)
	{
		login.enterPassword(text);
	}
	
	@And("^I click on submit button$")
	public void clickOnSubmit() {
		login.clickOnSubmit();
	}
	
	@And("I enter \"([^\"]*)\" in \"([^\"]*)\" destination")
	public void enterFromDestination(String text, String fieldName) {
		login.enterFromDestination(text, fieldName);
	}

	@Then("^I select \"([^\"]*)\" from dropdown$")
	public void selectFromDropdown(String text) {
		login.selectFromDropdown(text);
	}

	@And("^I click on \"([^\"]*)\"$")
	public void clickOnDeparture(String text) {
		login.clickOnDeparture(text);
	}

	@And("^I select (-?\\d+) days after today in calender$")
	public void selectDateFromCalendarAfterToday(int days) {
		login.selectDateFromCalendarAfterToday(days);
	}

	@Then("^I select tickets \"([^\"]*)\"$")
	public void selectTickets(String text) {
		login.selectTickets(text);
	}
	
	@And("^I click on Apply button$")
	public void clickonApplyButton() {
		login.clickonApplyButton();
	}

	@Then("^I click on Search Button$")
	public void clickOnsearchButton() throws InterruptedException {
		login.clickOnsearchButton();
	}

	@And("^I should see message \"([^\"]*)\" in search page$")
	public void verifyMessage(String text) {
		Assert.assertTrue("text is not visible", login.verifyMessage(text));
	}
	
	@And("^I click on dashboard$")
	public void clickOnDashboard() {
		login.clickOnDashboard();
	}
}
	
