package org.sample;

import org.base.Baseclass1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Continue extends Baseclass1 {




public Continue() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="radiobutton_0")
public WebElement radio;
@FindBy(id="continue")
public WebElement continuebtn;


public WebElement getRadio() {
	return radio;
}
public WebElement getContinuebtn() {
	return continuebtn;
}





















}
