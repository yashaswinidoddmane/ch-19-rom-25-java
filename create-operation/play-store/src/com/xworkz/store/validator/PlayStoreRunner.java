package com.xworkz.store.validator;

import com.xworkz.store.app.Application;
import com.xworkz.store.playstore.PlayStore;

public class PlayStoreRunner {
    public static void main(String args[]){
        Application application = new Application();
        application.setVersion("393.1.0.50.76");
        application.setUpdatedOn("11-aug-2025");
        application.setDownloads("5,00,00,00,000+");
        application.setUpdateSize("99.91MB");
        application.setRequiredOs("android 9");
        application.setInappPurchase("3,29,900.00");
        application.setOfferedBy("instagram");
        application.setReleaseOn("3-apr-2012");


        PlayStore appValidator = new PlayStore();
        appValidator.addApplication(application);
        appValidator.getApplicationDetails();
    }
}
