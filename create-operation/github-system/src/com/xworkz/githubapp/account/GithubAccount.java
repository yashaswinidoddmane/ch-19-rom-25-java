package com.xworkz.githubapp.account;

import com.xworkz.githubapp.GithubUser;

public class GithubAccount {
  GithubUser githubUser;
  public boolean createGithubUser(GithubUser githubUser) {
    boolean GithubUserCreated = false;

    boolean userNameValid = false;
    boolean emailValid = false;
    boolean passwordValid = false;
    boolean confirmPasswordValid = false;
    boolean twoFactorCodeValid = false;
    boolean captchaTextValid = false;

    if(githubUser.getUsername() != null){
      userNameValid = true;
    }else{
      System.out.println("user name is not valid");
    }

    if(githubUser.getEmail() != null){
      emailValid = true;
    }else{
      System.out.println("email is not valid");
    }
    if(githubUser.getPassword() != null){
      passwordValid = true;
    }else{
      System.out.println("password is not valid");
    }
    if(githubUser.getConfirmPassword() != null){
      confirmPasswordValid = true;
    }else{
      System.out.println("confirm password is not valid");
    }
    if(githubUser.getTwoFactorCode() != null){
      twoFactorCodeValid = true;
    }else{
      System.out.println("two factor code is not valid");
    }
    if(githubUser.getCaptchaText() != null){
      captchaTextValid = true;
    }else{
      System.out.println("captcha text is not valid");
    }
    if(userNameValid && emailValid && passwordValid && confirmPasswordValid && twoFactorCodeValid && captchaTextValid){
      GithubUserCreated = true;
this.githubUser = githubUser;
    }
    return GithubUserCreated;
  }
  public void getUserDetails(){
    System.out.println("user name is: "+ githubUser.getUsername());
    System.out.println("mail id is: "+ githubUser.getEmail());
    System.out.println("password is: "+ githubUser.getPassword());
    System.out.println("confirm password is: "+ githubUser.getConfirmPassword());
    System.out.println("two factor code is: "+ githubUser.getTwoFactorCode());
    System.out.println("captcha text is : "+ githubUser.getCaptchaText());
  }
}
