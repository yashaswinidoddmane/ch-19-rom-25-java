package com.xworkz.amazonapp.user;

import com.xworkz.amazonapp.AmazonUser;
import com.xworkz.amazonapp.account.AmazonAccount;

public class AmazonUserRunner {
    public static void main(String args[]) {
        AmazonUser amazonUser = new AmazonUser();

        amazonUser.setFirstName("YASHU");
        amazonUser.setLastName("DODDMANI");
        amazonUser.setEmailId("yy4911505@gmail.com");
        amazonUser.setPhoneNumber(8123819984L);
        amazonUser.setPassword("Yashu@123");
        amazonUser.setConfirmPassword("Yashu@123");


        AmazonAccount amazonAccount = new AmazonAccount();
        amazonAccount.createAmazonUser(amazonUser);
        amazonAccount.getAccountDetails();

    }
}
