package MakeMyTrip.MakeMyTripProject.PageObject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {
	private WebDriver driver;
	public LoginPageObject(WebDriver driver) {
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
	driver= new ChromeDriver();
	this.driver=driver;
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	PageFactory.initElements(driver, this);
	
	}
	public void launchApplication() {
		driver.get("https://www.makemytrip.com/");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	@FindBy(xpath="//li[contains(@class,'makeRelative lhUser')]")
	private WebElement loginButton;
	public void clickOnLoginButton() {
		loginButton.click();
		
	}
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement email;
	public void enterEmail(String text) {
		email.sendKeys(text);
		WebElement continueButton = driver.findElement(By.xpath(".//span[contains(text(),'Continue')]"));
		continueButton.click();	
	}
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	public void enterPassword(String text) {
		password.sendKeys(text);
		
	}
	
	@FindBy(xpath="//span[contains(text(),'Login')]//parent::button ")
	private WebElement submitButton;
	public void clickOnSubmit() {
		submitButton.click();
		
	}
	
	public void enterFromDestination(String text, String fieldName) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String xPath = String.format("//span[contains(text(),'%s')]", fieldName);
		WebElement fromDest = driver.findElement(By.xpath(xPath));
		fromDest.click();

		String xPath1 = String.format("//input[@placeholder='%s']", fieldName);
		WebElement enterFromdest = driver.findElement(By.xpath(xPath1));
		enterFromdest.sendKeys(text);

	}

	public void clickOnDeparture(String text) {
		String xPath = String.format("//span[contains(text(),'%s')]", text);
		WebElement departure = driver.findElement(By.xpath(xPath));
		departure.click();

	}

	public void selectDateFromCalendarAfterToday(int days) {
		SimpleDateFormat date = new SimpleDateFormat("EEE MMM dd yyyy");
		Date dt = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dt);
		calendar.add(Calendar.DATE, days);
		String newDate = date.format(calendar.getTime());
		String xPath = String.format("//div[@class='DayPicker-Day' and @aria-label='%s']", newDate);
		WebElement selectDate = driver.findElement(By.xpath(xPath));
		selectDate.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void selectFromDropdown(String text) {
		String xPath = String.format("//div[contains(text(),'%s')]//parent::div", text);
		WebElement dropdownvalue = driver.findElement(By.xpath(xPath));
		dropdownvalue.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void selectTickets(String text) {
		String xPath = String.format("//li[@data-cy='%s']", text);
		WebElement selectTicket = driver.findElement(By.xpath(xPath));
		selectTicket.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@FindBy(xpath = "//button[contains(text(),'APPLY')]")
	private WebElement applyButton;

	public void clickonApplyButton() {
		applyButton.click();

	}

	@FindBy(xpath = "//a[contains(text(),'Search')]")
	public WebElement searchButton;
	
	public void clickOnsearchButton() throws InterruptedException {
		
		searchButton.click();
		Thread.sleep(8000);

	}

	public boolean verifyMessage(String text) {
		String xPath = String.format("//p[contains(text(),'%s')]", text);

		WebElement message = driver.findElement(By.xpath(xPath));
		String text1 = message.getText();

		if (text1.contains(text)) {
			return true;
		} else
			return false;

	}
	
	@FindBy(xpath="//div[contains(@class,' modal displayBlock modalLogin')]")
	private WebElement dashboardClick;
	public void clickOnDashboard() {
		dashboardClick.click();
		
	}

	
}