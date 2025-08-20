package com.xworkz.passportapp.seva;

import com.xworkz.passportapp.user.PassportUser;

public class PassportSeva {
    PassportUser passportUser ;
    public boolean createPassportUser(PassportUser passportUser) {
        boolean passportUserCreated = false;

        boolean cpvLocationValid = false;
        boolean dcbrLocationValid = false;
        boolean givenNameValid = false;
        boolean surNameValid = false;
        boolean dobValid = false;
        boolean mailValid = false;
        boolean isEmailLoginSameValid = false;
        boolean loginIdValid = false;
        boolean pwdValid = false;
        boolean confirmPwdValid = false;
        boolean hintQuesValid = false;
        boolean hintAnsValid = false;
        boolean captchaValid = false;

        //validation
        //user is saved
        if (passportUser.getCpvLocation() != null) {
            cpvLocationValid = true;
        } else {
            System.out.println("CPV Location is not valid");
        }

        if (passportUser.getDcbrLocation() != null) {
            dcbrLocationValid = true;
        } else {
            System.out.println("DCBR Location in not valid");
        }

        if (passportUser.getGivenName() != null) {
            givenNameValid = true;
        } else {
            System.out.println("Given Name is not vald");
        }

        if (passportUser.getSurName() != null) {
            surNameValid = true;
        } else {
            System.out.println("Sur Name is not valid");
        }

        if (passportUser.getDob() != null) {
            dobValid = true;
        } else {
            System.out.println("Dob is not valid");
        }

        if (passportUser.getMail() != null){
            mailValid = true;
      }else {
            System.out.println("mail is not valid");
        }
        if(passportUser.getLoginId() != null){
            loginIdValid = true;
        }else{
            System.out.println("login Id in not valid");
        }

        if(passportUser.getPwd() != null){
            pwdValid = true;
        }else{
            System.out.println("pwd is not valid");
        }

        if(passportUser.getConfirmPwd() != null){
            confirmPwdValid = true;
        }else{
            System.out.println("confirm pwd is not valid");
        }

        if(passportUser.getHintQues() != null){
            hintQuesValid = true;
        }else{
            System.out.println("hint ques is not valid");
        }

        if(passportUser.getHintAns() != null){
            hintAnsValid = true;
        }else{
            System.out.println("hint ans is not valid");
        }

        if(passportUser.getCaptcha() != null){
            captchaValid = true;
        }else{
            System.out.println("captcha is not valid");
        }

        if(cpvLocationValid && dcbrLocationValid && givenNameValid && surNameValid && dobValid && mailValid && isEmailLoginSameValid && loginIdValid && pwdValid && confirmPwdValid && hintQuesValid && hintAnsValid && captchaValid){
            passportUserCreated = true;
            this.passportUser = passportUser;
        }
        return passportUserCreated ;
    }
}
