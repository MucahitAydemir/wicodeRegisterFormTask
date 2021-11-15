package com.wicodeTask.wicodeTask.Model;


import javax.annotation.processing.Generated;
import javax.persistence.*;

@Entity
public class userInfo {

    @Id
    @Column(name = "customerId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    private String emailId;
    private String username;
    private String password;

    public userInfo() {

    }

    public userInfo(Long id, String emailId, String username, String password ,String firstName, String lastName) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public  String getEmailId() {
        return emailId;
    }
    public  String getFirstName() {
        return firstName;
    }
    public  String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword(){
        return password;
    }



}
