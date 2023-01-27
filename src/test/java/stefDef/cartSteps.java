package stefDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Homepage;

public class cartSteps {
	Homepage pom = new Homepage();
	WebDriver driver = new EdgeDriver();
	
	
	
	
	


	@Given("I am on any page of swiggy website")
	public void i_am_on_any_page_of_swiggy_website() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("i_am_on_any_page_of_swiggy_website");
	}
	
	

	@When("I click cart option and delete items from the cart")
	public void i_click_cart_option_and_delete_items_from_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("i_click_cart_option_and_delete_items_from_the_cart");
		pom.home(driver);
		pom.location1(driver);
		pom.locationclick(driver);
		pom.search(driver);
		pom.searchitem(driver);
		pom.Add_to_cart(driver);
		pom.deleteCart(driver);
	}


//	@When("I click cart option")
//	public void i_click_cart_option() {
//	    // Write code here that turns the phrase above into concrete actions
////	    throw new io.cucumber.java.PendingException();
//		System.out.println("i_click_cart_option");
//	}
//	@When("delete items from the cart")
//	public void delete_items_from_the_cart() {
//	    // Write code here that turns the phrase above into concrete actions
////	    throw new io.cucumber.java.PendingException();
//		System.out.println("delete_items_from_the_cart");
//	}
	@Then("I able to delete the  items from cart")
	public void i_able_to_delete_the_items_from_cart() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("i_able_to_delete_the_items_from_cart");
		
	}
	
	
	

	@When("I click cart option and update items from the cart")
	public void i_click_cart_option_and_update_items_from_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("i_click_cart_option_and_update_items_from_the_cart");
		pom.home(driver);
		pom.location1(driver);
		pom.locationclick(driver);
		pom.search(driver);
		pom.searchitem(driver);
		pom.Add_to_cart(driver);
		pom.updateCart(driver);
	}

	

//
//	@When("update items from the cart")
//	public void update_items_from_the_cart() {
//	    // Write code here that turns the phrase above into concrete actions
////	    throw new io.cucumber.java.PendingException();
//		System.out.println("update_items_from_the_cart");
//		
//	}
	@Then("I able to update the  items from cart")
	public void i_able_to_update_the_items_from_cart() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("i_able_to_update_the_items_from_cart");
	}




	


}
