package com.xworkz.paytmapp.user;

import com.xworkz.paytmapp.PaytmUser;
import com.xworkz.paytmapp.account.PaytmAccount;

public class PaytmRunner {
 public static void main(String args[]){
     PaytmUser paytmUser = new PaytmUser();
paytmUser.setPhone("812381994");
paytmUser.setName("Yashaswini");
paytmUser.setAadhaar("416806106007");
paytmUser.setPassword("Yashu@14");
paytmUser.setConfirmPassword("Yashu@14");

     PaytmAccount paytmAccount = new PaytmAccount();
     paytmAccount.createPaytmUser(paytmUser);
     paytmAccount.getUserDetails();

 }
}
