package com.xworkz.googleapp.portal;

import com.xworkz.googleapp.GoogleUser;

public class GooglePortal {
    GoogleUser googleUser;
    public boolean createGoogleUser(GoogleUser googleUser) {
        boolean GoogleUserCreated = false;

        boolean firstNameValid = false;
        boolean lastNameValid = false;
        boolean userNameValid = false;
        boolean passwordValid = false;
        boolean confirmPasswordValid = false;
        boolean phoneNumberValid = false;
        boolean recoveryEmailValid = false;
        boolean birthDateValid = false;
        boolean genderValid = false;
        boolean countryValid = false;
        boolean captchaValid = false;
        boolean verificationCodeValid = false;

        if(googleUser.getFirstName() != null){
            firstNameValid =true;
        }else{
            System.out.println("first name is not valid");
        }

        if(googleUser.getLastName() != null){
            lastNameValid = true;
        }else{
            System.out.println("last name is not valid");
        }

        if(googleUser.getUsername() != null){
            userNameValid = true;
        }else{
            System.out.println("user name is not valid");
        }

        if(googleUser.getPassword() != null){
            passwordValid = true;
        }else{
            System.out.println("password is not valid");
        }

        if(googleUser.getConfirmPassword() != null){
            confirmPasswordValid = true;
        }else{
            System.out.println("confirm password is not valid");
        }

        if(googleUser.getPhoneNumber() != null){
            phoneNumberValid = true;
        }else{
            System.out.println("phone number is not valid");
        }

        if(googleUser.getRecoveryEmail() != null){
            recoveryEmailValid = true;
        }else{
            System.out.println("mail is not valid");
        }

        if(googleUser.getBirthDate() != null){
            birthDateValid = true;
        }else{
            System.out.println("birth date is not valid");
        }

        if(googleUser.getGender() != null){
            genderValid = true;
        }else{
            System.out.println("gender is not valid");
        }

        if(googleUser.getCountry() != null){
            countryValid = true;
        }else{
            System.out.println("country is not invalid");
        }

        if(googleUser.getCaptcha() != null){
            captchaValid = true;
        }else{
            System.out.println("captcha is not valid");
        }

        if(googleUser.getVerificationCode() != null){
            verificationCodeValid = true;
        }else{
            System.out.println("verification code is not valid");
        }
    if(firstNameValid && lastNameValid && userNameValid && passwordValid && confirmPasswordValid && phoneNumberValid && recoveryEmailValid && birthDateValid && genderValid && countryValid && captchaValid && verificationCodeValid){
        GoogleUserCreated = true;
    this.googleUser = googleUser;
    }
    return GoogleUserCreated;
    }
    public void getUserDetails(){
        System.out.println("first name is: "+ googleUser.getFirstName());
        System.out.println("last name is: "+ googleUser.getLastName());
        System.out.println("user name is: "+ googleUser.getUsername());
        System.out.println("passowrd is: "+ googleUser.getPassword());
        System.out.println("confirm password is: "+ googleUser.getConfirmPassword());
        System.out.println("phone number is: "+ googleUser.getPhoneNumber());
        System.out.println("mail id is: "+ googleUser.getRecoveryEmail());
        System.out.println("birth date is:"+ googleUser.getBirthDate());
        System.out.println("gender is: "+ googleUser.getGender());
        System.out.println("country is: "+ googleUser.getCountry());
        System.out.println("captcha is: "+ googleUser.getCaptcha());
        System.out.println("verification code is: "+ googleUser.getVerificationCode());
    }
}
