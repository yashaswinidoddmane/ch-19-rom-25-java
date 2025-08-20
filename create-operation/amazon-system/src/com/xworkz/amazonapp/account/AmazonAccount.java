package com.xworkz.amazonapp.account;

import com.xworkz.amazonapp.AmazonUser;

public class AmazonAccount {
    AmazonUser amazonUser;
    public boolean createAmazonUser(AmazonUser amazonUser) {
        boolean AmazonUserCreated = false;

        boolean firstNameValid = false;
        boolean lastNameValid = false;
        boolean emailIdValid = false;
        boolean phoneNumberValid = false;
        boolean passwordValid = false;
        boolean confirmPasswordValid = false;

        if(amazonUser.getFirstName() != null){
    firstNameValid = true;
        }else{
            System.out.println("first name is not valid");
        }
        if(amazonUser.getLastName() != null){
            lastNameValid = true;
        }else{
            System.out.println("last name is not valid");
        }
        if(amazonUser.getEmailId() != null){
            emailIdValid = true;
        }else{
            System.out.println("email id is not valid");
        }
        if(amazonUser.getPhoneNumber() != null){
            phoneNumberValid = true;
        }else{
            System.out.println("phone number is not valid");
        }
        if(amazonUser.getPassword() != null){
            passwordValid = true;
        }else{
            System.out.println("password is not valid");
        }
        if(amazonUser.getConfirmPassword() != null){
            confirmPasswordValid = true;
        }else{
            System.out.println("confirm password is not valid");
        }
    if(firstNameValid && lastNameValid && emailIdValid && phoneNumberValid && passwordValid && confirmPasswordValid){
        AmazonUserCreated = true;
        this.amazonUser = amazonUser;
    }
    return AmazonUserCreated;
    }

    public void getAccountDetails(){
        System.out.println("first name is: "+ amazonUser.getFirstName());
        System.out.println("last name is: "+ amazonUser.getLastName());
        System.out.println("email Id is: "+ amazonUser.getEmailId());
        System.out.println("phone number is: "+ amazonUser.getPhoneNumber());
        System.out.println("password is:"+ amazonUser.getPassword());
        System.out.println("confirm password is: "+ amazonUser.getConfirmPassword());
    }
}
