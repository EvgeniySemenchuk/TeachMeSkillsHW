package lesson9.HW2;

public class Main {
    public static void main(String[] args) {
        String login = "userMain";
        String password = "1234567qwertyu";
        String confirmPassword = "1234567qwertyu";

        if (Authorization.validateUser(login, password, confirmPassword)) {
            System.out.println("User is valid");
        } else {
            System.out.println("User is not valid");
        }
    }

}
