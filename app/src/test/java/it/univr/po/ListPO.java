package it.univr.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ListPO extends PageObject{
    public ListPO(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/h1")
    private WebElement header;
    @FindBy(xpath = "/html/body/table/tbody/tr[1]/td[1]")
    private WebElement firstName1;
    @FindBy(xpath = "/html/body/table/tbody/tr[1]/td[2]")
    private WebElement lastName1;
    @FindBy(xpath = "/html/body/table/tbody/tr[1]/td[3]")
    private WebElement email1;
    @FindBy(xpath = "/html/body/table/tbody/tr[1]/td[4]")
    private WebElement age1;
    @FindBy(xpath = "/html/body/table/tbody/tr[1]/td[5]")
    private WebElement birthPlace1;
    @FindBy(xpath = "/html/body/table/tbody/tr[1]/td[6]")
    private WebElement nationality1;
    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td[1]")
    private WebElement firstName2;
    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td[2]")
    private WebElement lastName2;
    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td[3]")
    private WebElement email2;
    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td[4]")
    private WebElement age2;
    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td[5]")
    private WebElement birthPlace2;
    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td[6]")
    private WebElement nationality2;
    @FindBy(xpath = "/html/body/table/tbody/tr/td[7]/a")
    private WebElement buttonEdit;
    @FindBy(xpath = "/html/body/table/tbody/tr/td[8]/a")
    private WebElement buttonDelete;
    @FindBy(xpath = "/html/body/a")
    private WebElement buttonHome;
    public String confirmationHeader() {
        return header.getText();
    }
    public String confirmationFirstName1() { return firstName1.getText(); }
    public String confirmationLastName1() {
        return lastName1.getText();
    }
    public String confirmationEmail1() {
        return email1.getText();
    }
    public String confirmationAge1() { return age1.getText(); }
    public String confirmationBirthPlace1() {
        return birthPlace1.getText();
    }
    public String confirmationNationality1() {
        return nationality1.getText();
    }
    public String confirmationFirstName2() { return firstName2.getText(); }
    public String confirmationLastName2() { return lastName2.getText(); }
    public String confirmationEmail2() {
        return email2.getText();
    }
    public String confirmationAge2() { return age2.getText(); }
    public String confirmationBirthPlace2() {
        return birthPlace2.getText();
    }
    public String confirmationNationality2() {
        return nationality2.getText();
    }
    public void buttonEditPress() {
        buttonEdit.click();
    }
    public void buttonDeletePress() {
        buttonDelete.click();
    }
    public void buttonHomePress() {
        buttonHome.click();
    }
}
