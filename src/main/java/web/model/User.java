package web.model;


import javax.persistence.*;

@Entity
@Table (name = "users_data")

public class User {
    @Id
    @Column (name = "id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name = "userName")
    private String userName;
    @Column (name = "userSurname")
    private String userSurname;

    public User() {
    }

    public User(String userName, String userSurname) {
        this.userName = userName;
        this.userSurname = userSurname;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userSurname='" + userSurname + '\'' +
                '}';
    }
}
