package com.xworkz.store.validator;

import com.xworkz.store.app.Application;

public class AppValidator {
   // Application application;
    public boolean validateApplicationInfo(Application application) {
        boolean appValidated = false;

        boolean versionValid = false;
        boolean updatedOnValid = false;
        boolean downloadsValid = false;
        boolean updateSizeValid = false;
        boolean requiredOsValid = false;
        boolean inappPurchaseValid = false;
        boolean offeredByValid = false;
        boolean releaseOnValid = false;

        if(application.getVersion() != null && !application.getVersion().isEmpty()){
            versionValid = true;
        }else{
            System.out.println("version is not valid");
        }
        if(application.getUpdatedOn() != null && !application.getUpdatedOn().isEmpty()){
            updatedOnValid = true;
        }else{
            System.out.println("updated on is not valid");
        }
        if(application.getDownloads() != null && !application.getDownloads().isEmpty()){
            downloadsValid = true;
        }else{
            System.out.println("downloads is not valid");
        }
        if(application.getUpdateSize() != null && !application.getUpdateSize().isEmpty()){
            updateSizeValid = true;
        }else{
            System.out.println("updated size is not valid");
        }
        if(application.getRequiredOs() != null && !application.getRequiredOs().isEmpty()){
            requiredOsValid = true;
        }else{
            System.out.println("required os is not valid");
        }
        if(application.getInappPurchase() != null && !application.getInappPurchase().isEmpty()){
            inappPurchaseValid = true;
        }else{
            System.out.println("in app purchase is not valid");
        }
        if(application.getOfferedBy() != null && !application.getOfferedBy().isEmpty()){
            offeredByValid = true;
        }else{
            System.out.println("offered by is not valid");
        }
        if(application.getReleaseOn() != null && !application.getReleaseOn().isEmpty()){
            releaseOnValid = true;
        }else{
            System.out.println("release on is not valid");
        }
            if(versionValid && updatedOnValid && downloadsValid && updateSizeValid && requiredOsValid && inappPurchaseValid && offeredByValid && releaseOnValid ){
                appValidated = true;
                //this.application = application;
            }
            return appValidated;
        }

    }
