package it.univr.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndexPO extends PageObject{
    public IndexPO(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/div/h1")
    private WebElement header;
    @FindBy(xpath = "/html/body/div/div/div[1]/a")
    private WebElement buttonShowPatientList;
    @FindBy(xpath = "/html/body/div/div/div[2]/a")
    private WebElement buttonCreateNewPatient;
    @FindBy(xpath = "/html/body/div/div/div[3]/a")
    private WebElement buttonShowPrescriptionList;

    public String confirmationHeader() {
        return header.getText();
    }
    public void buttonShowPatientListPress() {
        buttonShowPatientList.click();
    }
    public void buttonCreateNewPatientPress() {
        buttonCreateNewPatient.click();
    }
    public void buttonShowPrescriptionListPress() { buttonShowPrescriptionList.click(); }
}
