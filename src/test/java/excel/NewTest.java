package excel;

import org.testng.annotations.Test;

import pageObject.Homepage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;

@Listeners(Listener2.class)
public class NewTest {
	WebDriver driver = new EdgeDriver();
	
	Homepage pom = new Homepage();
	ReadFromResultExcel excel = new ReadFromResultExcel();
//	pom.home(driver);
//	pom.location1(driver);
//	pom.locationclick(driver);
//	pom.search(driver);
//	pom.searchitem(driver);
//	pom.ItemName(driver);
//	pom.ItemPrice(driver);
	
	
	
  @Test
  public void test1() {
	  pom.home(driver);
		pom.location1(driver);
		pom.locationclick(driver);
		pom.search(driver);
		pom.searchitem(driver);
		pom.ItemName(driver);
		pom.ItemPrice(driver);
		
	  String[] swiggy = pom.ItemName(driver);
	  String[] readname = excel.Readname();
	  int cnt=0;
	  int cnt1=0;
//	  int cnt2=0;
//	  Boolean res = true;
	  for (int indx = 0; indx < 7; indx++) {
		  System.out.println(readname[indx]+" "+swiggy[cnt]);
		  if (readname[indx].equals(swiggy[cnt])) {
			  cnt1++;
			  
			  cnt++;
//			  continue;
		  }else {
			  cnt++;
//			res = false;
//			break;
		}}
	  System.out.println(cnt+" "+cnt1);
//	  driver.close();
	  assertEquals(cnt, cnt1);
	  
  }
  @Test
  public void test2() {
	  
//	  pom.home(driver);
//		pom.location1(driver);
//		pom.locationclick(driver);
//		pom.search(driver);
//		pom.searchitem(driver);
//		pom.ItemName(driver);
//		pom.ItemPrice(driver);
	  String[] swiggy = pom.ItemPrice(driver);
	  String[] readprice = excel.Readprice();
	  int cnt=0;
	  int cnt1=0;
//	  int cnt2=0;
//	  Boolean res = true;
	  for (int indx = 0; indx < 7; indx++) {
		  System.out.println(readprice[indx]+" "+swiggy[cnt]);
		  if (readprice[indx].equals(swiggy[cnt])) {
			  cnt1++;
			  
			  cnt++;
//			  continue;
		  }else {
			  cnt++;
//			res = false;
//			break;
		}}
	  System.out.println(cnt+" "+cnt1);
	  assertEquals(cnt, cnt1);
	  
	  
	  assertEquals(cnt, cnt1);
  }
  

  
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
