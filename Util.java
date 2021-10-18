package org.sample;

import java.io.IOException;

import org.base.Baseclass1;
import org.openqa.selenium.WebElement;

public class Util extends Baseclass1 {
public static void main(String[] args) throws IOException {
launch("https://adactinhotelapp.com/");	
PojoLogin p= new PojoLogin();

WebElement username = p.getUsername();
String excelread = p.Excelread("C:\\Users\\prabhu\\Documents\\Book1.xlsx","Sheet1",0,0);
entertext(username, excelread);

WebElement password = p.getPassword();
String excelread2 = p.Excelread("C:\\Users\\prabhu\\Documents\\Book1.xlsx","Sheet1",0,1);
entertext(password,excelread2);

WebElement login = p.getLogin();
btn(login);

Details d = new Details();
WebElement location = d.getLocation();
entertext(location,Excelread("C:\\Users\\prabhu\\Documents\\Book1.xlsx","Sheet1",0,10));
int parseInt = Integer.parseInt(excelread2);

WebElement hotels = d.getHotels();
entertext(hotels,Excelread("C:\\Users\\prabhu\\Documents\\Book1.xlsx","Sheet1",0,10));

WebElement roomtype = d.getRoomtype();
entertext(roomtype,Excelread("C:\\Users\\prabhu\\Documents\\Book1.xlsx","Sheet1",0,10));
WebElement roomno = d.getRoomno();

entertext(roomno,Excelread("C:\\Users\\prabhu\\Documents\\Book1.xlsx","Sheet1",0,10));
WebElement checkindate = d.getCheckindate();
entertext(checkindate,Excelread("C:\\Users\\prabhu\\Documents\\Book1.xlsx","Sheet1",0,2));
WebElement checkoutdate = d.getCheckoutdate();
entertext(checkoutdate,Excelread("C:\\Users\\prabhu\\Documents\\Book1.xlsx","Sheet1",0,3));
WebElement adults = d.getAdults();
entertext(adults,Excelread("C:\\Users\\prabhu\\Documents\\Book1.xlsx","Sheet1",0,10));
WebElement childrens = d.getChildrens();
entertext(childrens,Excelread("C:\\Users\\prabhu\\Documents\\Book1.xlsx","Sheet1",0,10));
WebElement search = d.getSearch();
btn(search);



}

}

	





















