package dk.hurasser.runtimer.model;

import javax.persistence.*;
import java.util.Objects;
import java.util.StringJoiner;

@Entity
@Table(name = "User", catalog = "RunTimerTest")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String passwordSalt;

    @Column(nullable = false)
    private String passwordDigest;

    @Column(nullable = false)
    private String userType;

    @Column(nullable = false)
    private String userRole;

    public long getId() {
        return id;
    }

    private void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordSalt() {
        return passwordSalt;
    }

    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt;
    }

    public String getPasswordDigest() {
        return passwordDigest;
    }

    public void setPasswordDigest(String passwordDigest) {
        this.passwordDigest = passwordDigest;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                username.equals(user.username) &&
                email.equals(user.email) &&
                passwordSalt.equals(user.passwordSalt) &&
                passwordDigest.equals(user.passwordDigest) &&
                userType.equals(user.userType) &&
                userRole.equals(user.userRole);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, email, passwordSalt, passwordDigest, userType, userRole);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", User.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("username='" + username + "'")
                .add("email='" + email + "'")
                .add("passwordSalt='" + passwordSalt + "'")
                .add("passwordDigest='" + passwordDigest + "'")
                .add("userType='" + userType + "'")
                .add("userRole='" + userRole + "'")
                .toString();
    }
}
