package org.sample;

import org.base.Baseclass1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class PojoLogin extends Baseclass1 {

public PojoLogin() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="username")
public WebElement username;
@FindBy(id="password")
public WebElement password;
@FindBy(id= "login")
public WebElement login;
public WebElement getUsername() {
	return username;
}
public WebElement getPassword() {
	return password;
}
public WebElement getLogin() {
	return login;
}






















}
