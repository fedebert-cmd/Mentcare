package it.univr.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndexPO extends PageObject{
    public IndexPO(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/h1")
    private WebElement header;
    @FindBy(xpath = "/html/body/a[1]")
    private WebElement buttonShowPatientList;
    @FindBy(xpath = "/html/body/a[2]")
    private WebElement buttonCreateNewPatient;
    @FindBy(xpath = "/html/body/a[3]")
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
