package com.xworkz.passportapp.user;

public class PassportUser {
    //13 elements
    private String cpvLocation;
     private String dcbrLocation;
     private String givenName;
     private String surName;
     private String dob;
     private String mail;
     private boolean isEmailLoginSame;
     private String loginId;
     private String pwd;
     private String confirmPwd;
     private String hintQues;
     private String hintAns;
     private String captcha;

    public String getCpvLocation() {
        return cpvLocation;
    }

    public void setCpvLocation(String cpvLocation) {
        this.cpvLocation = cpvLocation;
    }

    public String  getDcbrLocation(){
        return dcbrLocation;
    }
    public void setDcbrLocation(String dcbrLocation) {
        this.dcbrLocation = dcbrLocation;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public boolean getEmailLoginSame() {
        return isEmailLoginSame;
    }

    public void setEmailLoginSame(boolean emailLoginSame) {
        isEmailLoginSame = emailLoginSame;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getHintQues() {
        return hintQues;
    }

    public String getConfirmPwd() {
        return confirmPwd;
    }

    public void setConfirmPwd(String confirmPwd) {
        this.confirmPwd = confirmPwd;
    }

    public void setHintQues(String hintQues) {
        this.hintQues = hintQues;
    }

    public String getHintAns() {
        return hintAns;
    }

    public void setHintAns(String hintAns) {
        this.hintAns = hintAns;
    }

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }
}
