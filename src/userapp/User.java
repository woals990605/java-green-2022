package userapp;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // Getter, Setter, toString
@AllArgsConstructor // User(int id, String username,....)
public class User {
    private int id;
    private String username;
    private String password;
    private String email;
    private String created;
    private String updated;
}
