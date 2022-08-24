package Endtoendscenerio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.tyss.genericUtility.BaseClass;
import org.tyss.genericUtility.ExcelUtility;
import org.tyss.genericUtility.FileUtility;
import org.tyss.genericUtility.JavaUtility;
import org.tyss.genericUtility.MobileDriverUtility;

import POM.Allowlocaccess;
import POM.Bigbaskethmepage;
import POM.Choosedeliveryaddress;
import POM.Loginsignuppage;
import POM.Uselocationpage;
import POM.Welcomepage;


public class Bigbasketscenerio1 extends BaseClass{
	
	private WebDriver appiumDriver;

	@Test
	public void bigbasketscenerio1() throws InterruptedException {
//		FileUtility fileutiliti=new FileUtility();
//		ExcelUtility excelutiliti=new ExcelUtility();
//		MobileDriverUtility mobileDriverutiliti=new MobileDriverUtility();
//		JavaUtility javautility=new JavaUtility();
		
		driver.launchApp();
		
		
		//pom
		Welcomepage Welcomepagee=new Welcomepage(driver);
		Welcomepagee.welcomepagebtn();
		Bigbaskethmepage Bigbaskethmepageee=new Bigbaskethmepage(driver);
		Bigbaskethmepageee.threepbtn();
		Loginsignuppage Loginsigee=new Loginsignuppage(driver);
		Loginsigee.addressedit();
	
		Choosedeliveryaddress  Choosedeliveryaddress=new Choosedeliveryaddress(driver);
		Choosedeliveryaddress.searchtxtfield();
		
Allowlocaccess  Allowlocacce=new Allowlocaccess(driver);
//		Allowlocacce.allowacess();
//		
//		Uselocationpage Uselocationpagee=new Uselocationpage(driver);
//		Uselocationpagee.floatingbtn();
//		
//		Thread.sleep(300);
//		String Expectedprice = driver.findElement(By.id("com.bigbasket.mobileapp:id/tvDeliveryAddress")).getText();
////		String ActualPrice="LOCATION";
////		SoftAssert soft = new SoftAssert();
////		soft.assertEquals(ActualPrice, Expectedprice);
//		soft.assertAll();
//		driver.findElement(By.id("com.bigbasket.mobileapp:id/tvDeliveryAddress")).click();

		
		
		
		
		
		//	1st Stage, BTM Layout, Bangalore
		//com.bigbasket.mobileapp:id/tvDeliveryAddress
	}

}
