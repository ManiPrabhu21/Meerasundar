package org.sample;

import org.base.Baseclass1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class PersonalDetails extends Baseclass1 {


public PersonalDetails() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="first_name")
public WebElement firstname;
@FindBy(id="last_name")
public WebElement lastname;
@FindBy(id="address")
public WebElement address;
@FindBy(id="cc_num")
public WebElement number;
@FindBy(id="cc_type")
public WebElement type;
@FindBy(id="cc_exp_month")
public WebElement months;
@FindBy(id="cc_exp_year")
public WebElement years;
@FindBy(id= "cc_cvv")
public WebElement cc;
@FindBy(id="book_now")
public WebElement book;

public WebDriver getDriver() {
	return driver;
}
public WebElement getFirstname() {
	return firstname;
}
public WebElement getLastname() {
	return lastname;
}
public WebElement getAddress() {
	return address;
}
public WebElement getNumber() {
	return number;
}
public WebElement getType() {
	return type;
}
public WebElement getMonths() {
	return months;
}
public WebElement getYears() {
	return years;
}
public WebElement getCc() {
	return cc;
}
public WebElement getBook() {
	return book;
}





















}
