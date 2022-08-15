package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public boolean firstName(String firstName) {

        String firstNamePattern = "^[A-Z]{1}[a-z]{2,}$";

        Pattern pattern = Pattern.compile(firstNamePattern);
        Matcher matcher = pattern.matcher(firstName);
        boolean result = matcher.matches();

        if(result == true){
            System.out.println("First Name is valid.");
        }
        else
            System.out.println("First Name is not valid.");

        return result;
    }

    public boolean lastName(String lastName) {

        String lastNamePattern = "^[A-Z]{1}[a-z]{2,}$";

        Pattern pattern = Pattern.compile(lastNamePattern);
        Matcher matcher = pattern.matcher(lastName);
        boolean result = matcher.matches();

        if(result == true)
            System.out.println("Last Name is valid.");
        else
            System.out.println("Last Name is not valid.");

        return result;
    }

    public boolean email(String email){
        String emailPattern= "^[a-zA-Z0-9]+[.+-]{0,1}[0-9a-zA-Z]*@[a-z0-9]+[.][a-z]{2,4}[.a-z]{0,4}$";

        Pattern pattern2=Pattern.compile(emailPattern);
        Matcher matcher2=pattern2.matcher(email);
        boolean result2=matcher2.matches();

        if(result2== true){
            System.out.println("Email is valid.");
        }else{
            System.out.println("Email is not valid.");
        }

        return result2;
    }

    public boolean mobileNumber(String mobileNumber) {

        String MobileNumberPattern = "^(91-)?[0-9]{10}$";

        Pattern pattern3 = Pattern.compile(MobileNumberPattern);
        Matcher matcher3 = pattern3.matcher(mobileNumber);
        Boolean result3 = matcher3.matches();

        if (result3 == true) {
            System.out.println("Mobile number is valid");
        } else {
            System.out.println("Mobile number is not valid");
        }

        return result3;
    }

    public boolean passwordRule(String password){

        String PasswordPattern="^(?=.*[a-z])(?=.*[A-Z])(?=.*[~!@#$%^&*()<>:{},.;'])[A-Za-z0-9~!@#$%^&*()<>:{},.;']{8,}$";

        Pattern pattern4=Pattern.compile(PasswordPattern);
        Matcher matcher4=pattern4.matcher(password);
        Boolean result4=matcher4.matches();

        if(result4==true){
            System.out.println("Password is valid");
        }else{
            System.out.println("Invaild password,minimum 8 characters required with atleast 1 of them being upper case and atleast 1 of them being a number and exactly 1 of them being a special character.");
        }

        return result4;
    }

    public void emailSampleValidation(String emailSample) {

        System.out.println("Checking for Email sample: "+emailSample);

        email(emailSample);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to User Registration Problem:");
        UserRegistration userRegistration = new UserRegistration();

        System.out.println("Enter First Name:");
        String firstName = scanner.next();
        userRegistration.firstName(firstName);

        System.out.println("Enter Last Name:");
        String lastName = scanner.next();
        userRegistration.lastName(lastName);

        System.out.println("Enter your Email:");
        String email = scanner.next();
        userRegistration.email(email);

        System.out.println("Enter your Mobile number:");
        String mobileNumber = scanner.next();
        userRegistration.mobileNumber(mobileNumber);

        System.out.println("Enter your Password:");
        String password=scanner.next();
        userRegistration.passwordRule(password);

        System.out.println("Email sample validation: ");
        userRegistration.emailSampleValidation("abc@yahoo.com");
        userRegistration.emailSampleValidation("abc-100@yahoo.com");
        userRegistration.emailSampleValidation("abc.100@yahoo.com");
        userRegistration.emailSampleValidation("abc111@abc.com");
        userRegistration.emailSampleValidation("abc-100@abc.net");
        userRegistration.emailSampleValidation("abc.100@abc.com.au");
        userRegistration.emailSampleValidation("abc@1.com");
        userRegistration.emailSampleValidation("abc@gmail.com.com");
        userRegistration.emailSampleValidation("abc+100@gmail.com");


    }


}