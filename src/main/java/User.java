public class User {

    private String login;
    private String email;


    public User(String login, String email) {
        this.login = login;
        this.email = email;
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public boolean noEqualityLoginAndEmail(String login, String email) {
        if (login.equals(email)) {
            System.out.println("Login и Email не должны быть равны");
            return false;
        }
        return true;
    }

    public boolean validEmail(String email) {
        return email.contains("@") && email.contains(".");
    }
}
