package com.example.demo;

import javax.persistence.*;
import java.util.ArrayList;
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//
//@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private String login;
    private String following;
    private String followers;

//    private ArrayList<String> following_url;
//    private ArrayList<String> followers_url;

//   @ManyToMany
//    private ArrayList<Repos> repos_url;


    public User() {
    }

    public User(String login, String following, String followers /*, ArrayList<Repos> repos_url*/) {
        this.login = login;
        this.following = following;
        this.followers = followers;
        //this.repos_url = repos_url;
    }


    @Override
    public String toString(){
        return "User{id =  "+id+
                ",   Username  = "+login+
                ",   following  = "+following+
                ",   followers  = " +followers+
                /*"following:" +following_url+
                "pulls_url" +repos_url+*/"}\n";
//
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFollowing() {
        return following;
    }

    public void setFollowing(String following) {
        this.following = following;
    }

    public String getFollowers() {
        return followers;
    }

    public void setFollowers(String followers) {
        this.followers = followers;
    }
}
