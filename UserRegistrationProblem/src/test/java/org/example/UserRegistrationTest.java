package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    public void givenUserFirstName_whenProper_shouldReturnYourEnteredFirstNameIsValid(){
        UserRegistration userRegistration = new UserRegistration();
        String result=userRegistration.firstNameValid("Sachin");
        System.out.println(result);
        Assertions.assertEquals("Your entered First Name is valid",result);
    }
    @Test
    public void givenUserLastName_whenProper_shouldReturnYourEnteredLastNameIsValid(){
        UserRegistration userRegistration = new UserRegistration();
        String result = userRegistration.lastNameValid("Sah");
        System.out.println(result);
        Assertions.assertEquals("Your entered Last Name is valid",result);
    }
    @Test
    public void givenEmail_whenProper_shouldReturnYourEnteredEmailIsValid(){
        UserRegistration userRegistration = new UserRegistration();
        String result = userRegistration.emailValid("sachin.bar@gmail.com");
        System.out.println(result);
        Assertions.assertEquals("Your entered email is valid",result);
    }
    @Test
    public void givenMobileNumber_whenProper_shouldReturnYourEnteredMobileNumberIsValid(){
        UserRegistration userRegistration = new UserRegistration();
        String result = userRegistration.mobileValid("9832898989");
        System.out.println(result);
        Assertions.assertEquals("Your entered mobile number is valid",result);
    }
    @Test
    public void givenPassword_whenProper_shouldReturnYourEnteredPasswordIsValid(){
        UserRegistration userRegistration = new UserRegistration();
        String result = userRegistration.passwordValid("AbcD@123");
        System.out.println(result);
        Assertions.assertEquals("Your entered password is valid",result);
    }

}
