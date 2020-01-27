package al.microservices.users;

import java.util.Date;

public class AccessToken {
    private String id;
    private Date created;
    private boolean rememberMe;
    private String userId;
    private User user;

    public AccessToken(String id, Date created, boolean rememberMe, String userId, User user) {
        this.id = id;
        this.created = created;
        this.rememberMe = rememberMe;
        this.userId = userId;
        this.user = user;
    }

}