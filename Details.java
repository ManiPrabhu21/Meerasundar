package org.sample;

import org.base.Baseclass1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Details extends Baseclass1 {


public Details() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="location")
public WebElement location;
@FindBy(id="hotels")
public WebElement hotels;
@FindBy(id="room_type")
public WebElement roomtype;
@FindBy(id="room_nos")
public WebElement roomno;
@FindBy(id="datepick_in")
public WebElement checkindate;
@FindBy(id="datepick_out")
public WebElement checkoutdate;
@FindBy(id="adult_room")
public WebElement adults;
@FindBy(id="child_room")
public WebElement childrens;
@FindBy(id="Submit")
public WebElement search;

public WebDriver getDriver() {
	return driver;
}
public WebElement getLocation() {
	return location;
}
public WebElement getHotels() {
	return hotels;
}
public WebElement getRoomtype() {
	return roomtype;
}
public WebElement getRoomno() {
	return roomno;
}
public WebElement getCheckindate() {
	return checkindate;
}
public WebElement getCheckoutdate() {
	return checkoutdate;
}
public WebElement getAdults() {
	return adults;
}
public WebElement getChildrens() {
	return childrens;
}
public WebElement getSearch() {
	return search;
}
















}
