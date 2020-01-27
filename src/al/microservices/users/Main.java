package al.microservices.users;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        User user = new User("id", "Julian", "Cuni", "juliancuni@gmail.com", "root");
//        boolean isLoggedIn = user.login(user.getUsername().toLowerCase().toString(), null);
        System.out.println("Enter Username:");
        String username = scanner.nextLine();
        System.out.println("Enter Password:");
        String password = scanner.nextLine();
        boolean isLoggedIn = user.login(username, password);
        System.out.println(isLoggedIn);
    }
}
