class Pinterest {

    static String userName;
    static String fullName;
    static String password;
    static String confirmPassword;

    public static boolean createAccount(String uname, String fname, String pwd, String cpwd) {
        boolean accountCreated = false;
        boolean userNameValid = false;
        boolean fullNameValid = false;
        boolean passwordValid = false;
        boolean confirmPasswordValid = false;

        if (uname != null) {
            userName = uname;
            userNameValid = true;
        } else {
            System.out.println("Invalid username");
        }

        if (fname != null) {
            fullName = fname;
            fullNameValid = true;
        } else {
            System.out.println("Invalid full name");
        }

        if (pwd != null ) {
            password = pwd;
            passwordValid = true;
        } else {
            System.out.println("Password must be at least 6 characters");
        }

        if (cpwd != null && cpwd == pwd) {
            confirmPassword = cpwd;
            confirmPasswordValid = true;
        } else {
            System.out.println("Confirm password does not match");
        }

        if (userNameValid && fullNameValid && passwordValid && confirmPasswordValid) {
            System.out.println("All the references are valid. Pinterest account created.");
            accountCreated = true;
        }

        return accountCreated;
    }

    public static void readAccount() {
        System.out.println("Pinterest Account Details:");
        System.out.println("User Name: " + userName);
        System.out.println("Full Name: " + fullName);
        System.out.println("Password: " + password);
        System.out.println("Confirm Password: " + confirmPassword);
    }
}