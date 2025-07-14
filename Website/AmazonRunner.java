class AmazonRunner{
public static void main(String amazon[]) {
        boolean accountCreated = Amazon.createAccount("yashu@amazon.com", "Yashaswini", "9998877665", "amazon@123", "amazon@123");
        System.out.println("Amazon Account Created: "+ accountCreated);
        if (accountCreated)
            Amazon.readAccount();
        }
    }