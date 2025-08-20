package com.xworkz.passportapp;

import com.xworkz.passportapp.seva.PassportSeva;
import com.xworkz.passportapp.user.PassportUser;

public class PassportUserRunner {
   public static void main(String args[]){
      PassportUser passportUser = new PassportUser();
      passportUser.setCpvLocation("PO");
      passportUser.setDcbrLocation("Hyderabad");
      passportUser.setGivenName("Yashaswini");
      passportUser.setSurName("DM");
      passportUser.setDob("14-01-2004");
      passportUser.setMail("yy4911505@gmail.com");
      passportUser.setEmailLoginSame(true);
      passportUser.setLoginId("yash");
      passportUser.setPwd("yash@14");
      passportUser.setConfirmPwd("yashu@14");
      passportUser.setHintQues("favourite food");
      passportUser.setHintAns("non veg");
      passportUser.setCaptcha("Y45bTn");



      PassportSeva passportSeva = new PassportSeva();
      passportSeva.createPassportUser(passportUser);


      String cpvLocation = passportUser.getCpvLocation();
      String  dcbrLocation = passportUser.getDcbrLocation();
      String givenName  = passportUser.getGivenName();
      String surName = passportUser.getSurName();
      String dob = passportUser.getDob();
      String mail = passportUser.getMail();
      boolean isEmailLoginSame = passportUser.getEmailLoginSame();
      String loginId = passportUser.getLoginId();
      String pwd = passportUser.getPwd();
      String confirmPwd = passportUser.getConfirmPwd();
      String hintQues = passportUser.getHintQues();
      String hintAns = passportUser.getHintAns();
      String captcha = passportUser.getCaptcha();

      System.out.println("CPV Location is: "+ cpvLocation);
      System.out.println("DCBR Location is: "+ dcbrLocation);
      System.out.println("Given Name is: "+ givenName);
      System.out.println("Sur name is: "+ surName);
      System.out.println("Dob is: "+ dob);
      System.out.println("mail: "+ mail);
      System.out.println("is mail login same: "+ isEmailLoginSame);
      System.out.println("loginId: "+ loginId);
      System.out.println("pwd: "+ pwd);
      System.out.println("confirm pass :"+ confirmPwd);
      System.out.println("hint question: "+ hintQues);
      System.out.println("hint ans: "+ hintAns);
      System.out.println("captcha: "+ captcha);
   }
}
