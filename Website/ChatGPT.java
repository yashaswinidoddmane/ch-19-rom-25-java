class ChatGPT{

    static String userName;
    static String email;
    static String preferredLanguage;
    static String password;
    static String confirmPassword;

    public static boolean createAccount(String uname, String mail, String lang, String pwd, String cpwd) {
        boolean accountCreated = false;
        boolean userNameValid = false;
        boolean emailValid = false;
        boolean languageValid = false;
        boolean passwordValid = false;
        boolean confirmPasswordValid = false;

        if (uname != null ) {
            userName = uname;
            userNameValid = true;
        } else {
            System.out.println("Invalid username");
        }

        if (mail != null) {
            email = mail;
            emailValid = true;
        } else {
            System.out.println("Invalid email address");
        }

        if (lang != null) {
            preferredLanguage = lang;
            languageValid = true;
        } else {
            System.out.println("Preferred language cannot be empty");
        }

        if (pwd != null ) {
            password = pwd;
            passwordValid = true;
        } else {
            System.out.println("Password must be at least 6 characters");
        }

        if (cpwd != null ) {
            confirmPassword = cpwd;
            confirmPasswordValid = true;
        } else {
            System.out.println("Confirm password does not match");
        }

        if (userNameValid && emailValid && languageValid && passwordValid && confirmPasswordValid) {
            System.out.println("All details are valid. ChatGPT account created successfully.");
            accountCreated = true;
        }

        return accountCreated;
    }

    public static void readAccount() {
        System.out.println("Username: " + userName);
        System.out.println("Email: " + email);
        System.out.println("Preferred Language: " + preferredLanguage);
        System.out.println("Password: " + password);
        System.out.println("Confirm Password: " + confirmPassword);
    }

    
}
