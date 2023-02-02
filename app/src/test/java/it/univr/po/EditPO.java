package it.univr.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditPO extends PageObject{
    public EditPO(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/div/h1")
    private WebElement header;
    @FindBy(xpath = "/html/body/div/div/form/input[2]")
    private WebElement firstName;
    @FindBy(xpath = "/html/body/div/div/form/input[3]")
    private WebElement lastName;
    @FindBy(xpath = "/html/body/div/div/form/input[4]")
    private WebElement email;
    @FindBy(xpath = "/html/body/div/div/form/input[5]")
    private WebElement age;
    @FindBy(xpath = "/html/body/div/div/form/input[6]")
    private WebElement birthPlace;
    @FindBy(xpath = "/html/body/div/div/form/input[7]")
    private WebElement nationality;
    @FindBy(xpath = "/html/body/div/div/form/input[8]")
    private WebElement submitButton;

    public String confirmationHeader() {
        return header.getText();
    }
    public void editPatient(String firstName, String lastName, String email, int age, String birthPlace, String nationality) {
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
