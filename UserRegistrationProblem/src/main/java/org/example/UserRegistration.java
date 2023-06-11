package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    Scanner scan =new Scanner(System.in);
    public void firstNameValid(){
        System.out.println("Enter your First Name");
        String name = scan.next();
        Pattern p = Pattern.compile("[A-Z]{1}[a-z]{2,}");
        Matcher m =p.matcher(name);
        boolean b =m.matches();
        System.out.println("Your entered First Name is "+(b?"valid":"invalid"));
    }

    public void lastNameValid(){
        System.out.println("Enter your Last Name");
        String name = scan.next();
        Pattern p = Pattern.compile("[A-Z]{1}[a-z]{2,}");
        Matcher m =p.matcher(name);
        boolean b =m.matches();
        System.out.println("Your entered Last Name is "+(b?"valid":"invalid"));
    }

    public void emailValid(){
        System.out.println("Enter your email");
        String email= scan.next();
        Pattern p=Pattern.compile( "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$");
        Matcher m = p.matcher(email);
        boolean b = m.matches();
        System.out.println("Your entered email is "+(b?"valid":"invalid"));
    }

    public void mobileValid(){
        System.out.println("Enter your mobile number");
        String mob= scan.next();
        Pattern p=Pattern.compile( "(91){0,1}[6-9]{1}[0-9]{9}");
        Matcher m = p.matcher(mob);
        boolean b = m.matches();
        System.out.println("Your entered mobile number is "+(b?"valid":"invalid"));
    }

    public void passwordValid(){
        System.out.println("Enter your password");
        String pass= scan.next();
        Pattern p=Pattern.compile( "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$");
        Matcher m = p.matcher(pass);
        boolean b = m.matches();
        System.out.println("Your entered password is "+(b?"valid":"invalid"));
    }

}
