package example.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * The Class represents EmployeePage.
 *
 * @author Diyan Georgiev
 */
public class EmployeePage extends BasePage {

	@FindBy(id = "add-employ-button")
	WebElement addEmployeeButton;

	@FindBy(id = "firstName")
	WebElement firstNameInput;

	@FindBy(id = "lastName")
	WebElement lastNameInput;

	@FindBy(id = "email")
	WebElement emailInput;

	@FindBy(css = "button[type=’submit’]")
	WebElement save;


	public void addNewEmployee(String firstName, String lastName, String email) {

		addEmployeeButton.click();
		firstNameInput.sendKeys(firstName);
		lastNameInput.sendKeys(lastName);
		emailInput.sendKeys(email);
		save.click();

	}

	public void goToEmployeesPage() {
		driver.get("http://localhost:8080/employees/list");
	}






	/**
	 * Instantiates a new base page.
	 *
	 * @param driver the driver
	 */
	public EmployeePage(WebDriver driver) {
		super(driver);
	}
}

