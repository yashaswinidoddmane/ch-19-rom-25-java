package com.xworkz.googleapp.user;

import com.xworkz.googleapp.GoogleUser;
import com.xworkz.googleapp.portal.GooglePortal;

class GoogleUserRunner {
  public static void main(String args[]){
      GoogleUser googleUser = new GoogleUser();

      googleUser.setFirstName("Yashu");
      googleUser.setLastName("DM");
      googleUser.setUsername("Yashaswini");
      googleUser.setPassword("Yashu@14");
      googleUser.setConfirmPassword("Yashu@14");
      googleUser.setPhoneNumber("8123819984");
      googleUser.setRecoveryEmail("yy4911505@gmail.com");
      googleUser.setBirthDate("14-01-2004");
      googleUser.setGender("Female");
      googleUser.setCountry("India");
      googleUser.setCaptcha("Y54Bve");
      googleUser.setVerificationCode("454536");

      GooglePortal googlePortal = new GooglePortal();
      boolean result=googlePortal.createGoogleUser(googleUser);
      if (result=true){
          googlePortal.getUserDetails();
      }


  /* String firstName = googleUser.getFirstName();
   String lastName = googleUser.getLastName();
   String userName = googleUser.getUsername();
   String  password = googleUser.getPassword();
   String confirmPassword = googleUser.getConfirmPassword();
   String phoneNumber = googleUser.getPhoneNumber();
   String recoveryEmail = googleUser.getRecoveryEmail();
   String birthDate = googleUser.getBirthDate();
   String gender = googleUser.getGender();
   String country = googleUser.getCountry();
   String captcha = googleUser.getCaptcha();
   String verificationCode = googleUser.getVerificationCode(); */

     /* System.out.println("first name is: "+ firstName);
      System.out.println("last name is: "+ lastName);
      System.out.println("user name is: "+ userName);
      System.out.println("password is: "+ password);
      System.out.println("confirm password is: "+ confirmPassword);
      System.out.println("phone number is: "+ phoneNumber);
      System.out.println("recovery email is: "+ recoveryEmail);
      System.out.println("birth date is: "+ birthDate);
      System.out.println("gender is: "+ gender);
      System.out.println("country is: "+ country);
      System.out.println("captcha is: "+ captcha);
      System.out.println("verification code is :"+ verificationCode);
      */

  }
}
