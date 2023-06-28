package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RefactorUserRegistrationToThrowCustomExceptionTest {
    @Test
    public void givenUserFirstName_whenNotProper_shouldThrowCustomException(){
        RefactorUserRegistrationToThrowCustomException refactorUser = new RefactorUserRegistrationToThrowCustomException();
        String result=refactorUser.firstNameValid("a@chin");
        System.out.println(result);
        Assertions.assertEquals("Invalid First Name",result);
    }
    @Test
    public void givenUserLastName_whenNotProper_shouldThrowCustomException(){
        RefactorUserRegistrationToThrowCustomException refactorUser = new RefactorUserRegistrationToThrowCustomException();
        String result=refactorUser.lastNameValid("a@ch");
        System.out.println(result);
        Assertions.assertEquals("Invalid Last Name",result);
    }
    @Test
    public void givenUserEmail_whenNotProper_shouldThrowCustomException(){
        RefactorUserRegistrationToThrowCustomException refactorUser = new RefactorUserRegistrationToThrowCustomException();
        String result=refactorUser.emailValid("#.a@ch.bom@.bop");
        System.out.println(result);
        Assertions.assertEquals("Invalid Email Address",result);
    }
    @Test
    public void givenUserMobile_whenNotProper_shouldThrowCustomException(){
        RefactorUserRegistrationToThrowCustomException refactorUser = new RefactorUserRegistrationToThrowCustomException();
        String result=refactorUser.mobileNumberValid("12345678912345");
        System.out.println(result);
        Assertions.assertEquals("Invalid Mobile Number",result);
    }
    @Test
    public void givenUserPassword_whenNotProper_shouldThrowCustomException(){
        RefactorUserRegistrationToThrowCustomException refactorUser = new RefactorUserRegistrationToThrowCustomException();
        String result=refactorUser.passwordValid("abcd");
        System.out.println(result);
        Assertions.assertEquals("Invalid Password",result);
    }
}
