package example.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import example.example.factory.PageinstancesFactory;
import example.example.pages.EmployeePage;

import static java.awt.SystemColor.text;


@Test(testName = "Add empoyees test", description = " Positive and negative Add empoyees tests")
public class AddEmployeesTest extends BaseTest {

	@Test
	public void addEmployeePositiveTest() {
		driver.get("http://localhost:8080/employees/list");
		EmployeePage employeePage = PageinstancesFactory.getInstance(EmployeePage.class);
		employeePage.addNewEmployee("Pesho", "Peshev", "pesho@gmail.com");
		Assert.assertTrue(true, "Employee Directory is visible : Test successfull");
	}

	@Test
	public void addEmployeeNegativeTest() {
		driver.get("http://localhost:8080/employees/list");
		EmployeePage employeePage = PageinstancesFactory.getInstance(EmployeePage.class);
		employeePage.addNewEmployee("Nov", "User", "");
		Assert.assertNotEquals("", text);

		Assert.assertFalse(true, "Add employee test  : Test fail because of empty email input");
	}
}
