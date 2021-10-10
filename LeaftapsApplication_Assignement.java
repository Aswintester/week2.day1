package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeaftapsApplication_Assignement {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// 1. Launch URL
		driver.get("http://leaftaps.com/opentaps/control/login");

		// 2. Enter UserName and Password

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// 3. Click on Login Button

		driver.findElement(By.className("decorativeSubmit")).click();

		// 4. Click on CRM/SFA Link

		driver.findElement(By.linkText("CRM/SFA")).click();

		// 5. Click on Leads Button

		driver.findElement(By.linkText("Leads")).click();

		// 6. Click on create Lead Button

		driver.findElement(By.linkText("Create Lead")).click();

		// 7. Enter all the text fields in CreateLead page

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys");

		// Getting First name and Printing

		WebElement fName = (driver.findElement(By.id("createLeadForm_firstName")));

		fName.sendKeys("Aswin");

		String text = fName.getAttribute("value");

		System.out.println("The first name is :" + text);

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");

		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");

		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("04/22/1994");

		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Test Analyst");

		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");

		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("100000");

		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("1000");

		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("12345qwert");

		// Contact information

		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("+91");

		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9677779469");

		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("0");

		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Aswin");

		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("aswinravi5@gmail.com");

		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://www.aswin.com");

		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("12345qwert");

		// Primary Address

		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Aswin");

		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("17 Viv streen");

		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Near HDFC bank");

		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Dharmapuri");

		// Selecting State from DropDown

		Select stateDrop = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));

		stateDrop.selectByVisibleText("California");

		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("701");

		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("636");

		//getting title
		
		System.out.println(driver.getTitle());

		String titleName = driver.getTitle();
	
		//comparing title
		if (titleName == "Leaftaps") {
			System.out.println("The tile  Matches");

		} else {
			System.out.println("The title not Matches");
		}

		// Click Create Lead Button

		driver.findElement(By.name("submitButton")).click();

		// System.out.println(driver.findElement(By.id("viewLead_firstName_sp")).getText());

		Thread.sleep(3000);

		driver.close();
	}

}
