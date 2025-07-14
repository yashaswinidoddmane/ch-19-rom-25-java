class GitHub {

    static String userName;
    static String email;
    static String password;
    static String confirmPassword;
    static String repoName;

    public static boolean createAccount(String uname, String mail, String pwd, String cpwd, String repo) {
        boolean accountCreated = false;

        boolean userNameValid = false;
        boolean emailValid = false;
        boolean passwordValid = false;
        boolean confirmPasswordValid = false;
        boolean repoNameValid = false;

        if (uname != null) {
            userName = uname;
            userNameValid = true;
        } else {
            System.out.println("Invalid GitHub username");
        }

        if (mail != null ) {
            email = mail;
            emailValid = true;
        } else {
            System.out.println("Invalid email address");
        }

        if (pwd != null ) {
            password = pwd;
            passwordValid = true;
        } else {
            System.out.println("Password must be at least 8 characters");
        }

        if (cpwd != null && cpwd == pwd) {
            confirmPassword = cpwd;
            confirmPasswordValid = true;
        } else {
            System.out.println("Confirm password does not match");
        }

        if (repo != null ) {
            repoName = repo;
            repoNameValid = true;
        } else {
            System.out.println("Repository name cannot be empty");
        }

        if (userNameValid && emailValid && passwordValid && confirmPasswordValid && repoNameValid) {
            System.out.println("All fields are valid. GitHub account created successfully!");
            accountCreated = true;
        }

        return accountCreated;
    }

    public static void readAccount() {
        System.out.println("GitHub Username: " + userName);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Confirm Password: " + confirmPassword);
        System.out.println("Repository Name: " + repoName);
    }
}
