package pages;

import dto.UserDto;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 7), this);
    }
    @FindBy(xpath = "//input[@autocomplete='name']")
    WebElement inputName;

    @FindBy(xpath = "//input[@autocomplete='family-name']")
    WebElement inputLastName;

    @FindBy(xpath = "//input[@autocomplete='email']")
    WebElement inputEmail;

    @FindBy(xpath = "//input[@autocomplete='new-password']")
    WebElement inputPassword;

    @FindBy(xpath = "//label[@for='terms-of-use']")
    WebElement btnCheckBox;

    @FindBy(xpath = "//button[@type = 'submit']")
    WebElement btnYalla;

    public void typeRegistrationForm(String name, String lastName, String email, String password) {
        inputName.sendKeys(name);
        inputLastName.sendKeys(lastName);
        inputEmail.sendKeys(email);
        inputPassword.sendKeys(password);
        btnCheckBox.click();
        btnYalla.click();
    }

        public void typeRegistrationForm(UserDto user){
            inputName.sendKeys(user.getName());
            inputLastName.sendKeys(user.getLastName());
            inputEmail.sendKeys(user.getEmail());
            inputPassword.sendKeys(user.getPassword());
            btnCheckBox.click();
            btnYalla.click();




        }




}
