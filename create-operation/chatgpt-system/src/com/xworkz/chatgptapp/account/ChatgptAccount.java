package com.xworkz.chatgptapp.account;

import com.xworkz.chatgptapp.ChatgptUser;

public class ChatgptAccount {
 ChatgptUser chatgptUser;
    public void createChatgptUser(ChatgptUser chatgptUser) {
        boolean ChatgptUserCreated = false;

        boolean userNameValid = false;
        boolean emailValid = false;
        boolean prefferredLanguageValid = false;
        boolean passwordValid = false;
        boolean confirmPasswordValid = false;

        if(chatgptUser.getUserName() != null){
            userNameValid = true;
        }else{
            System.out.println("user name is not valid");
        }
        if(chatgptUser.getEmail() != null){
            emailValid = true;
        }else{
            System.out.println("email is not valid");
        }
        if(chatgptUser.getPassword() != null){
            passwordValid = true;
        }else{
            System.out.println("password is not valid");
        }
        if(chatgptUser.getConfirmPassword() != null){
            confirmPasswordValid = true;
        }else{
            System.out.println("confirm password is not valid");
        }
        if(userNameValid && emailValid && prefferredLanguageValid && passwordValid && confirmPasswordValid){
            ChatgptUserCreated = true;
            this.chatgptUser = chatgptUser;
        }
    }
    public void getAccountDetails(ChatgptUser chatgptUser){
        System.out.println("user name is: "+ chatgptUser.getUserName());
        System.out.println("email is: "+ chatgptUser.getEmail());
        System.out.println("preffered language is: "+ chatgptUser.getPreferredLanguage());
        System.out.println("password is: "+ chatgptUser.getPassword());
        System.out.println("confirm password is: "+ chatgptUser.getConfirmPassword());
    }
}
