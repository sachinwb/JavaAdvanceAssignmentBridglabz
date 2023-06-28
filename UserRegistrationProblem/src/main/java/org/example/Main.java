package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserRegistration userregistration = new UserRegistration();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your operation:[firstname,lastname,email,mobile,password]");
        String operation=scan.next();
        switch(operation){
            case "firstname":
                System.out.println(userregistration.firstNameValid("Sachin"));
                break;
            case "lastname":
                System.out.println(userregistration.lastNameValid("Sah"));
                break;
            case "email":
                System.out.println(userregistration.emailValid("sachin.bar@gmail.com"));
                break;
            case "mobile":
                System.out.println(userregistration.mobileValid("9832878787"));
                break;
            case "password":
                System.out.println(userregistration.passwordValid("Abcd@123"));
                break;
        }
    }
}