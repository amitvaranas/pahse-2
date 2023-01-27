package pageObject;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Homepage {
	
	
//	WebDriver driver = new EdgeDriver();
//	Homepage same = new Homepage();
			
	
	
	public void home(WebDriver driver) {
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://www.swiggy.com/");
		
		
		
	}
	
	public void location1(WebDriver driver) {
//		same.home(WebDriver driver);
		driver.findElement(By.id("location")).click();
		driver.findElement(By.id("location")).sendKeys("Cessna Business Park Main Road");
		
	}
	
	public void locationclick(WebDriver driver) {
//		same.location1(WebDriver driver);
		driver.findElement(By.xpath("//span[contains(@class,'icon-location')]//parent::button")).click();
		
	}
	
	public void search(WebDriver driver) {
//		same.locationclick(WebDriver driver);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/div/div/ul/li[5]/div/a/span[2]")).click();
		
		
	}
	
	public void searchitem(WebDriver driver) {
//		same.search(WebDriver driver);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[1]/div/form/div/div[1]/input")).sendKeys("Biryani");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[2]/div/div/button[1]")).click();
		
		
	}
	
	public String[] ItemName(WebDriver driver) {
//		same.searchitem(WebDriver driver);
		List<WebElement> ListOfProduct = driver.findElements(By.xpath("//div[contains(@class,'styles_containerInner')]//h3[contains(@class,'styles_itemNameText')]"));
		System.out.println(ListOfProduct.size());
//		for(WebElement LOP : ListOfProduct) {
//			String name = LOP.getText();
//			System.out.println(name);
//		}
		
		String name[] = new String[ListOfProduct.size()];
		int cnt = 0;
		for(WebElement x : ListOfProduct) {

			
			
			String strname = x.getText();
			System.out.println(strname);
//			String strname1 = strname.substring(0,10);
			name[cnt] = strname;
			cnt++;
	}
		for (int indx = 0; indx < 7; indx++) {
			System.out.println(name[indx]);
		}
		
		return name;
		
	}
	
	public String[] ItemPrice(WebDriver driver) {
//		same.searchitem(WebDriver driver);
		List<WebElement> PriceOfProduct = driver.findElements(By.xpath("//div[contains(@class,'styles_containerInner')]//span[contains(@class,'styles_price')]//span[contains(@class,'rup')]"));
		System.out.println(PriceOfProduct.size());
		for(WebElement POP :PriceOfProduct) {
			String price = POP.getText();
			System.out.println(price);
		}
		
		String price[] = new String[PriceOfProduct.size()];
		int cont=0;
		for(WebElement rb : PriceOfProduct) {
			String strname = rb.getText();
			price[cont] = strname;
			cont++;
	}	System.out.println("priting price ");
		for (int indx = 0; indx < 7; indx++) {
		System.out.println(price[indx]);
	}
		return price;
		
	}
	
	public void Add_to_cart(WebDriver driver) {
//		same.searchitem(WebDriver driver);
		driver.findElement(By.xpath("//div[@class=\"_1RPOp\"]")).click();
		try {
			driver.findElement(By.xpath("//span[@class=\"_1W_TH\"]"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<WebElement> RadioButton = driver.findElements(By.xpath("//label[@class=\"b5XpK\"]//span[@class=\"_1X1xw\"]"));
//		RadioButton.get(0).click();
//		RadioButton.get(4).click();
		driver.findElement(By.xpath("//div[@class=\"_3coNr\"]")).click();
		driver.findElement(By.xpath("//a[@class=\"_1T-E4\"]")).click();
		
	}
	
	public void addingComments(WebDriver driver) {
//		same.Add_to_cart(WebDriver driver);
		driver.findElement(By.xpath("//textarea[@class=\"aeGJF\"]")).sendKeys("Ooo Woow");
		
	}
	
	public void UpdateLocation(WebDriver driver) {
//		same.Add_to_cart(WebDriver driver);
		
		driver.findElement(By.xpath("//span[@class=\"_3odgy\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"_381fS _1oTLG _1H_62\"]")).sendKeys("delhi");
		driver.findElement(By.xpath("//div[@class=\"J80xC\"]")).click();
		
		
	}
	public void deleteCart(WebDriver driver) {
		driver.findElement(By.xpath("//div[@class=\"_29Y5Z\"]")).click();
		
	}
	
	public void updateCart(WebDriver driver) {
		driver.findElement(By.xpath("//div[@class=\"_1ds9T\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"_3G9po\"]//button[@class=\"b0G1m\"]")).click();

		
	}
	
	
	
	
	
	
		

}
