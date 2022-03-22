package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExportWebCoreVitalsPage {
	WebDriver driver;

	@FindBy(id = "identifierId")
	WebElement gmailEmailInputBox;

	@FindBy(xpath = "//*[@id=\"identifierNext\"]/div/button/span")
	WebElement nextButtonOnEmail;

	@FindBy(xpath = "//input[@type=\"password\"]")
	WebElement passwordInputBox;

	@FindBy(xpath = "//span[contains(text(), \"Next\")]")
	WebElement nextButtonOnpassword;

	@FindBy(xpath = "//span[contains(text(), \"EXPORT\")]")
	WebElement exportButton;

	@FindBy(xpath = "//div[contains(text(), \"Google Sheets\")]")
	WebElement googleSheets;

	public ExportWebCoreVitalsPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	public void setUserName(String strUserName) {
		gmailEmailInputBox.click();
		gmailEmailInputBox.sendKeys(strUserName);
	}

	public void clickNextButtonOnEmail() {
		nextButtonOnEmail.click();
	}

	public void setPassword(String strPassword) {
		passwordInputBox.click();
		passwordInputBox.sendKeys(strPassword);

	}

	public void clickNextButtonOnPassword() {
		nextButtonOnpassword.click();
	}
	
	public void clickExportButton() {
		exportButton.click();
	}
	
	public void clickGoogleSheets() {
		googleSheets.click();
	}

}
