package it.univr.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InputPO extends PageObject{
    public InputPO(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/h1")
    private WebElement header;
    @FindBy(xpath = "/html/body/form/input[1]")
    private WebElement firstName;
    @FindBy(xpath = "/html/body/form/input[2]")
    private WebElement lastName;
    @FindBy(xpath = "/html/body/form/input[3]")
    private WebElement email;
    @FindBy(xpath = "/html/body/form/input[4]")
    private WebElement age;
    @FindBy(xpath = "/html/body/form/input[5]")
    private WebElement birthPlace;
    @FindBy(xpath = "/html/body/form/input[6]")
    private WebElement nationality;
    @FindBy(xpath = "/html/body/form/input[7]")
    private WebElement submitButton;
    
    public String confirmationHeader() {
        return header.getText();
    }
    public void enterPatient(String firstName, String lastName, String email, int age, String birthPlace, String nationality) {
        this.firstName.clear();
        this.firstName.sendKeys(firstName);
        this.lastName.clear();
        this.lastName.sendKeys(lastName);
        this.email.clear();
        this.email.sendKeys(email);
        this.age.clear();
        this.age.sendKeys(String.valueOf(age));
        this.birthPlace.clear();
        this.birthPlace.sendKeys(birthPlace);
        this.nationality.clear();
        this.nationality.sendKeys(nationality);
    }
    public void submitButtonPress() {
        submitButton.click();
    }
}
