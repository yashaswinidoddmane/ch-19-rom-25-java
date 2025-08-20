package com.xworkz.githubapp.user;

import com.xworkz.githubapp.GithubUser;
import com.xworkz.githubapp.account.GithubAccount;

public class GithubUserRunner {
    public static void main(String args[]){

        GithubUser githubUser = new GithubUser();

        githubUser.setUsername("Supreeth");
        githubUser.setEmail("Yashu@gmail.com");
        githubUser.setPassword("Sri@14");
        githubUser.setConfirmPassword("Sri@14");
        githubUser.setTwoFactorCode("812381");
        githubUser.setCaptchaText("YT10s14");

        GithubAccount githubAccount = new GithubAccount();
        githubAccount.createGithubUser(githubUser);
        githubAccount.getUserDetails();
    }

}
