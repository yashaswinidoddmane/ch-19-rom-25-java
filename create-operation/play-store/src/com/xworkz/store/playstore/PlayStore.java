package com.xworkz.store.playstore;

import com.xworkz.store.app.Application;
import com.xworkz.store.validator.AppValidator;

public class PlayStore {

    Application application;
    //create application
    public boolean addApplication(Application application){

        boolean isApplicationAdded = false;
        boolean isApplicationInfoValid = false;

        AppValidator appValidator = new AppValidator();

        isApplicationInfoValid = appValidator.validateApplicationInfo(application);

        if(isApplicationInfoValid){
            this.application = application;
            isApplicationAdded = true;
        }
        return isApplicationAdded;
    }
    public void getApplicationDetails(){
        System.out.println("version :"+ application.getVersion());
        System.out.println("updated on :"+ application.getUpdatedOn());
        System.out.println("downloads : "+ application.getDownloads());
        System.out.println("updated size: "+ application.getUpdateSize());
        System.out.println("required os: "+ application.getRequiredOs());
        System.out.println("in app purchase: "+application.getInappPurchase());
        System.out.println("offered by: "+ application.getOfferedBy());
        System.out.println("release on:" + application.getReleaseOn());
    }
}
