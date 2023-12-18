package StepDefinitions;




import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class VerifyPage {
	WebDriver driver;
	@Given("Launch a below URL and verify the title of the Page")
	public void launch_a_below_url_and_verify_the_title_of_the_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "The Internet";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
	}

	@When("Click on A\\/B Testing link")
	public void click_on_a_b_testing_link() {
		driver.findElement(By.cssSelector("a[href='/abtest']")).click();
	   
	}

	@Then("verify the text on the page as “A\\/B Test Variation {int}”")
	public void verify_the_text_on_the_page_as_a_b_test_variation(Integer int1) {
	   String actualString = driver.findElement(By.xpath("//div[@id='content']/div/ h3")).getText();
	   Assert.assertEquals(actualString, "A/B Test Variation 1");
	
	}
	
	@Then("Navigate back to Home page and click on dropdown link")
	public void navigate_back_to_home_page_and_click_on_dropdown_link() {
	driver.navigate().back();
	driver.findElement(By.cssSelector("a[href='/dropdown']")).click();
	   
	}

	@Then("Select Option1 value form drop down and confirm if its selected or not")
	public void select_option1_value_form_drop_down_and_confirm_if_its_selected_or_not() {
		Select drpOption= new Select(driver.findElement(By.id("dropdown")));
		drpOption.selectByVisibleText("Option 1");
		WebElement selectedoption = drpOption.getFirstSelectedOption();
		Assert.assertEquals("Option 1", selectedoption.getText());
	
	}

	@Then("Navigate back to Home Page and Click on Frames")
	public void navigate_back_to_home_page_and_click_on_frames() {
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[href='/frames']")).click();
	
	}

	@Then("Verify the below hyperlinks are presented on the Frames Page")
	public void verify_the_below_hyperlinks_are_presented_on_the_frames_page() {
		String frames1 = driver.findElement(By.cssSelector("a[href='/nested_frames']")).getText();
		String frames2 = driver.findElement(By.cssSelector("a[href='/iframe']")).getText();
		Assert.assertEquals("Nested Frames", frames1);
		Assert.assertEquals("iFrame", frames2);
	
	}
	


}
