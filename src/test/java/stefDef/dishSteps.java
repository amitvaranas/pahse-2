package stefDef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Homepage;

public class dishSteps {
	WebDriver driver = new EdgeDriver();

	Homepage pom = new Homepage();
	
	
	
	
	


	@Given("I am on list of product name and price page")
	public void i_am_on_list_of_product_name_and_price_page() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//		driver.get("https://www.swiggy.com/search?query=biryani");
		
		System.out.println("i_am_on_list_of_product_name_and_price_page");
//		obj.i_press_enter_to_select_location();
		
	}
	@When("I run algorithm to find list of product name")
	public void i_run_algorithm_to_find_list_of_product_name() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("i_run_algorithm_to_find_list_of_product_name");
		pom.home(driver);
		pom.location1(driver);
		pom.locationclick(driver);
		pom.search(driver);
		pom.searchitem(driver);
		pom.ItemName(driver);
//		driver.findElement(By.xpath("//div[@class=\"J80xC\"]")).click();
//		List<WebElement> ListOfProduct = driver.findElements(By.xpath("//div[contains(@class,'styles_containerInner')]//h3[contains(@class,'styles_itemNameText')]"));
//		System.out.println(ListOfProduct.size());
//		for(WebElement LOP : ListOfProduct) {
//			String name = LOP.getText();
//			System.out.println(name);
//		}
		
	}
	@Then("i can see list of product name on the console")
	public void i_can_see_list_of_product_name_on_the_console() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("i_can_see_list_of_product_name_on_the_console");
	}
	
	


	@When("I run algorithm to find list of product price")
	public void i_run_algorithm_to_find_list_of_product_price() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("i_run_algorithm_to_find_list_of_product_price");
//		List<WebElement> PriceOfProduct = driver.findElements(By.xpath("//div[contains(@class,'styles_containerInner')]//span[contains(@class,'styles_price')]//span[contains(@class,'rup')]"));
//		System.out.println(PriceOfProduct.size());
//		for(WebElement POP :PriceOfProduct) {
//			String price = POP.getText();
//			System.out.println(price);
//		}
		pom.home(driver);
		pom.location1(driver);
		pom.locationclick(driver);
		pom.search(driver);
		pom.searchitem(driver);
		pom.ItemPrice(driver);
	}
	@Then("i can see list of product price on the console")
	public void i_can_see_list_of_product_price_on_the_console() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("i_can_see_list_of_product_price_on_the_console");
	}

	
	
	

	@When("i click in add button on any of the the given product")
	public void i_click_in_add_button_on_any_of_the_the_given_product() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("i_click_in_add_button_on_any_of_the_the_given_product");
		pom.home(driver);
		pom.location1(driver);
		pom.locationclick(driver);
		pom.search(driver);
		pom.searchitem(driver);
		pom.Add_to_cart(driver);
//		driver.findElement(By.xpath("//div[@class=\"_1RPOp\"]")).click();
	}
	@When("i click on any one of the radio button to customize")
	public void i_click_on_any_one_of_the_radio_button_to_customize() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("i_click_on_any_one_of_the_radio_button_to_customize");
//		List<WebElement> RadioButton = driver.findElements(By.xpath("//label[@class=\"b5XpK\"]//span[@class=\"_1X1xw\"]"));
//		RadioButton.get(0).click();
	}
	@When("i click on add items")
	public void i_click_on_add_items() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("i_click_on_add_items");
	}
	@Then("item will be added to cart")
	public void item_will_be_added_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("item_will_be_added_to_cart");
	}


	


	@Given("I am on homepage of swiggy")
	public void i_am_on_homepage_of_swiggy() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("i_am_on_homepage_of_swiggy");
		pom.home(driver);
	}
	@When("I click search button")
	public void i_click_search_button() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("i_click_search_button");
		pom.home(driver);
		pom.location1(driver);
		pom.locationclick(driver);
		pom.search(driver);
		
	}
	@When("click on search for retaurants and food and enter product name")
	public void click_on_search_for_retaurants_and_food_and_enter_product_name() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("click_on_search_for_retaurants_and_food_and_enter_product_name");
	}
	@Then("I see the list of product name with prices also")
	public void i_see_the_list_of_product_name_with_prices_also() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("i_see_the_list_of_product_name_with_prices_also");
	}










}
