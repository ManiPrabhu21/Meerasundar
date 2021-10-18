package org.sample;

import java.io.IOException;
import java.util.Date;

import org.base.Baseclass1;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import cucumber.api.java.Before;
import junit.framework.Assert;

public class Final extends Baseclass1 {
	@BeforeClass
	public static  void launchurl() {
		launch("https://adactinhotelapp.com/");
		}
@Before
private void test2() {
	String title = driver.getTitle();
	boolean contains = title.contains("Adactin");
    Assert.assertTrue(contains);
    System.out.println();
    Date d= new Date();
    System.out.println(d);
   }
@Test
private void test3() throws IOException, InterruptedException {
PojoLogin p = new PojoLogin();
WebElement username = p.getUsername();
String excelread = p.Excelread("C:\\Users\\prabhu\\Documents\\Book1.xlsx","Sheet1",0,0);
entertext(username, excelread);
WebElement password = p.getPassword();
String excelread2 = p.Excelread("C:\\Users\\prabhu\\Documents\\Book1.xlsx","Sheet1",0,1);
entertext(password, excelread2);
WebElement login = p.getLogin();
btn(login);
Thread.sleep(3000);
}
@Test	
private void test4() throws IOException {
Details d = new Details();
WebElement location = d.getLocation();
String excelread = d.Excelread("C:\\Users\\prabhu\\Documents\\Book1.xlsx","Sheet1",0,10);
entertext(location, excelread);
WebElement hotels = d.getHotels();
String excelread2 = d.Excelread("C:\\Users\\prabhu\\Documents\\Book1.xlsx","Sheet1",0,10);
entertext(hotels, excelread2);
WebElement roomtype = d.getRoomtype();
String excelread3 = d.Excelread("C:\\Users\\prabhu\\Documents\\Book1.xlsx","Sheet1",0,10);
entertext(roomtype,excelread3 );
WebElement roomno = d.getRoomno();
String excelread4 = d.Excelread("C:\\Users\\prabhu\\Documents\\Book1.xlsx","Sheet1",0,10);
entertext(roomno, excelread4);
WebElement checkindate = d.getCheckindate();
String excelread5 = d.Excelread("C:\\Users\\prabhu\\Documents\\Book1.xlsx","Sheet1",0,2);
entertext(checkindate, excelread5);
WebElement checkoutdate = d.getCheckoutdate();
String excelread6 = d.Excelread("C:\\Users\\prabhu\\Documents\\Book1.xlsx","Sheet1",0,3);
entertext(checkoutdate, excelread6);
WebElement adults = d.getAdults();
String excelread7 = d.Excelread("C:\\Users\\prabhu\\Documents\\Book1.xlsx","Sheet1",0,10);
entertext(adults, excelread7);
WebElement childrens = d.getChildrens();
String excelread8 = d.Excelread("C:\\Users\\prabhu\\Documents\\Book1.xlsx","Sheet1",0,10);
entertext(childrens, excelread8);
WebElement search = d.getSearch();
btn(search);
}
@Test
private void test5() {
Continue c = new Continue();
WebElement radio = c.getRadio();
btn(radio);
WebElement continuebtn = c.getContinuebtn();
btn(continuebtn);
}

private void test6() {
PersonalDetails p = new PersonalDetails();
WebElement firstname = p.getFirstname();
	
	
	
	
	
	
	
	
}

















}





