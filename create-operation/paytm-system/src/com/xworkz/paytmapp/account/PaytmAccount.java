package com.xworkz.paytmapp.account;

import com.xworkz.paytmapp.PaytmUser;

public class PaytmAccount {
    PaytmUser paytmUser;
    public boolean createPaytmUser(PaytmUser paytmUser) {
        boolean PaytmUserCreated = false;

        boolean phoneValid = false;
        boolean nameValid = false;
        boolean aadharValid = false;
        boolean passwordValid = false;
        boolean confirmPasswordValid = false;

        if (paytmUser.getName() != null) {
            phoneValid = true;
        } else {
            System.out.println("phone number is not valid");
        }
        if (paytmUser.getName() != null) {
         nameValid = true;
        }else{
            System.out.println("name is not valid");
        }
        if(paytmUser.getAadhaar() != null){
            aadharValid = true;
        }else{
            System.out.println("aadhar is not valid");
        }
        if(paytmUser.getPassword() != null){
            passwordValid = true;
        }else{
            System.out.println("password is not valid");
        }
        if(paytmUser.getConfirmPassword() != null){
            confirmPasswordValid = true;
        }else{
            System.out.println("confirm password is not valid");
        }
        if(phoneValid && nameValid && aadharValid && passwordValid && confirmPasswordValid){
            PaytmUserCreated = true;
            this.paytmUser = paytmUser;
        }
        return PaytmUserCreated;
    }
    public void getUserDetails(){
        System.out.println("phone number is: "+ paytmUser.getPhone());
        System.out.println("name is: "+ paytmUser.getName());
        System.out.println("aadhar is: "+ paytmUser.getAadhaar());
        System.out.println("password is: "+ paytmUser.getPassword());
        System.out.println("confirm password is: "+ paytmUser.getConfirmPassword());
    }
}
