package al.microservices.users;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class User {
    private String id;
    private String name;
    private String surname;
    //    private String phone;
//    private String address;
    private String email;
    private String username;
//    private String password;
//    private boolean enabled;

    public User(
            String id,
            String name,
            String surname,
//            String phone,
//            String address,
            String email,
            String username //,
//            String password,
//            boolean enabled
    ) {
        this.id = id;
        this.name = name;
        this.surname = surname;
//        this.phone = phone;
//        this.address = address;
        this.email = email;
        this.username = username;
//        this.password = password;
//        this.enabled = enabled;
    }

    public static boolean login(String username, String password) {
        if (username != null && password != null) {
            if (username.length() <= 3) {
                System.out.println("Username is too short");
                return false;
            } else if (password.length() <= 3) {
                System.out.println("Password is too short");
                return false;
            }
//            httpOldGetRequest();
            httpNewGetRequest();
//            System.out.println("Username " + username + " and Password " + password);
            return true;
        }
        System.out.println("Username or password should not be empty");
        return false;
    }

    public static void logout(String accessToken) {
        System.out.println("AccessToken = " + accessToken);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private static void httpNewGetRequest() {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://microservices.al/api"))
                .build();
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();
    }

    private static void parser(String response) {
    }
}
