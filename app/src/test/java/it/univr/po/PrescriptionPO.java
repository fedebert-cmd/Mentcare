package it.univr.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrescriptionPO extends PageObject{
    public PrescriptionPO(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/div/h1")
    private WebElement header;
    @FindBy(xpath = "/html/body/div/a")
    private WebElement buttonHome;
    public String confirmationHeader() {
        return header.getText();
    }
    public void buttonHomePress() {
        buttonHome.click();
    }
}
