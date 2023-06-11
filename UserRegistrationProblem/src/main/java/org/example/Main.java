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
                userregistration.firstNameValid();
                break;
            case "lastname":
                userregistration.lastNameValid();
                break;
            case "email":
                userregistration.emailValid();
                break;
            case "mobile":
                userregistration.mobileValid();
                break;
            case "password":
                userregistration.passwordValid();
                break;
        }
    }
}