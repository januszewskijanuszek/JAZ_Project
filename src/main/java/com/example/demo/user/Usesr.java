//package com.example.demo.database;
//
//import javax.persistence.*;
//
////@Entity(name = "users")
//public class User {
//
//    @Id
//    @SequenceGenerator(
//            name = "user_sequence",
//            sequenceName = "user_sequence",
//            allocationSize = 1
//    )
//    @GeneratedValue(
//            strategy = GenerationType.SEQUENCE,
//            generator = "user_sequence"
//    )
//    @Column(name = "id", updatable = false)
//    private Long id;
//    @Column(name = "login", nullable = false, columnDefinition = "TEXT")
//    private String login;
//    @Column(name = "password", nullable = false, columnDefinition = "TEXT")
//    private String password;
//    @Column(name = "email", nullable = false, columnDefinition = "TEXT")
//    private String email;
//
//    public User(String login,
//                String password,
//                String email) {
//        this.login = login;
//        this.password = password;
//        this.email = email;
//    }
//
//    public User() {
//
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getLogin() {
//        return login;
//    }
//
//    public void setLogin(String login) {
//        this.login = login;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", login='" + login + '\'' +
//                ", password='" + password + '\'' +
//                ", email='" + email + '\'' +
//                '}';
//    }
//}
