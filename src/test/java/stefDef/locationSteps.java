package stefDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Homepage;

public class locationSteps {
	
	
	WebDriver driver = new EdgeDriver();
	Homepage pom = new Homepage();
	
	
	

	
	
	
	
	
	


	@Given("I am on swiggy homepage website")
	public void i_am_on_swiggy_homepage_website() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("i_am_on_swiggy_homepage_website");
//		driver.get("https://www.swiggy.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		pom.home(driver);
//		driver.close();
	
	}
	@When("I click on Enter your delivery location")
	public void i_click_on_enter_your_delivery_location() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("i_click_on_enter_your_delivery_location");
//		driver.findElement(By.id("location")).click();
		pom.home(driver);
		pom.location1(driver);
//		driver.close();
		
	}
//	@When("give my location")
//	public void give_my_location() {
//	    // Write code here that turns the phrase above into concrete actions
////	    throw new io.cucumber.java.PendingException();
//		System.out.println("give_my_location");
////		driver.findElement(By.id("location")).sendKeys("Cessna Business Park Main Road");
//		
//	}
	@Then("I press enter to select location")
	public void i_press_enter_to_select_location() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		
//		driver.findElement(By.xpath("//span[contains(@class,'icon-location')]//parent::button")).click();
		System.out.println("i_press_enter_to_select_location");
		pom.home(driver);
		pom.location1(driver);
		pom.locationclick(driver);
//		driver.close();
	}
	
	
	
	


	@Given("I am not on homepage")
	public void i_am_not_on_homepage() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//		locationSteps obj = new locationSteps();
//		obj.i_am_on_swiggy_homepage_website();
		System.out.println("i'm on any page of swiggy");
//		pom.Add_to_cart();
	}
	@When("I click on other location")
	public void i_click_on_other_location() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("i_click_on_other_location");
//		driver.findElement(By.xpath("//span[@class=\"_3odgy\"]")).click();
		pom.home(driver);
		pom.location1(driver);
		pom.locationclick(driver);
		pom.UpdateLocation(driver);
//		driver.close();
	}
//	@When("click on search for area ,street name")
//	public void click_on_search_for_area_street_name() {
//	    // Write code here that turns the phrase above into concrete actions
////	    throw new io.cucumber.java.PendingException();
////		driver.findElement(By.xpath("//input[@class=\"_381fS _1oTLG _1H_62\"]")).sendKeys("delhi");
//		System.out.println("click_on_search_for_area_street_name");
//		
//	}
	@Then("I click on that location")
	public void i_click_on_that_location() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//		driver.findElement(By.xpath("//div[@class=\"J80xC\"]")).click();
		System.out.println("i_click_on_that_location \n\n");
	}


	
	

		

}
