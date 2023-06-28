package org.example;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RefactorUserRegistrationToThrowCustomException {
    public String lastNameValid(String str) {
        try{
            Pattern p = Pattern.compile("[A-Z]{1}[a-z]{1,}");
            Matcher m = p.matcher(str);
            boolean b = m.matches();
            if (b)
                return ("Your entered Last Name is valid");
            else
                throw new MyException("Invalid Last Name");
        }catch (MyException e) {
            return e.getMessage();
        }
    }

    public String emailValid(String mail) {
        try{
            Pattern p=Pattern.compile( "^[a-zA-Z0-9_+&*-]+(?:\\."+
                    "[a-zA-Z0-9_+&*-]+)*@" +
                    "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                    "A-Z]{2,7}$");
            Matcher m = p.matcher(mail);
            boolean b = m.matches();
            if (b)
                return ("Your entered Email Address is valid");
            else
                throw new MyException("Invalid Email Address");
        }catch (MyException e) {
            return e.getMessage();
        }
    }

    public String mobileNumberValid(String mob) {
        try{
            Pattern p=Pattern.compile( "(91){0,1}[6-9]{1}[0-9]{9}");
            Matcher m = p.matcher(mob);
            boolean b = m.matches();
            if (b)
                return ("Your entered Mobile Number is valid");
            else
                throw new MyException("Invalid Mobile Number");
        }catch (MyException e) {
            return e.getMessage();
        }
    }

    public String passwordValid(String pass) {
        try{
            Pattern p=Pattern.compile( "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$");
            Matcher m = p.matcher(pass);
            boolean b = m.matches();
            if (b)
                return ("Your entered Password is valid");
            else
                throw new MyException("Invalid Password");
        }catch (MyException e) {
            return e.getMessage();
        }
    }

    public class MyException extends Exception {
        MyException(String msg) {
            super(msg);
        }
    }

    public String firstNameValid(String str) {
        try {
            Pattern p = Pattern.compile("[A-Z]{1}[a-z]{2,}");
            Matcher m = p.matcher(str);
            boolean b = m.matches();
            if (b)
                return ("Your entered First Name is valid");
            else
                throw new MyException("Invalid First Name");
        } catch (MyException e) {
            return e.getMessage();
        }
        }
}