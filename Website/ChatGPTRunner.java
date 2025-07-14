class ChatGPTRunner{
public static void main(String chat[]) {
        boolean accountCreated = ChatGPT.createAccount("chat_user01","chatuser@gmail.com","English","chat123","chat123");
		System.out.println("is account created "+ accountCreated);
        
        if (accountCreated) 
            ChatGPT.readAccount();
        }
    }