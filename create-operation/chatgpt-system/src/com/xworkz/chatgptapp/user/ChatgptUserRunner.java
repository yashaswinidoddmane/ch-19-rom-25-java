package com.xworkz.chatgptapp.user;

import com.xworkz.chatgptapp.ChatgptUser;
import com.xworkz.chatgptapp.account.ChatgptAccount;

public class ChatgptUserRunner {
    public static void main(String args[]){
        ChatgptUser chatgptUser = new ChatgptUser();

        chatgptUser.setUserName("Vaishu");
        chatgptUser.setEmail("Vaishu@gmail.com");
        chatgptUser.setPreferredLanguage("Kannada");
        chatgptUser.setPassword("Y@1234");
        chatgptUser.setConfirmPassword("Y@1234");

        ChatgptAccount chatgptAccount = new ChatgptAccount();
        chatgptAccount.createChatgptUser(chatgptUser);
        chatgptAccount.getAccountDetails(chatgptUser);


    }
}
