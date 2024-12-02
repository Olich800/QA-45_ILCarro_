package tests;

import dto.UserDto;
import manager.ApplicationManager;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import java.util.Random;

public class RegistrationTests extends ApplicationManager {

    @Test
    public void registrationPositiveTest(){
       int i = new Random().nextInt(1000);
        new HomePage(getDriver()).clickBtnLoginHeader();
        new LoginPage(getDriver()).typeRegistrationForm("Olga","Raz","raz_ol"+i+"@gmail.com","Password2220!");

        UserDto user = new UserDto("Olga", "Raz", "raz_ol"+i+"@gmail.com", "Password2220!");
        new HomePage(getDriver()).clickBtnLoginHeader();
        new LoginPage(getDriver()).typeRegistrationForm(user);





    }

}
