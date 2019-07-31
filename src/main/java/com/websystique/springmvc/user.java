package com.websystique.springmvc;

public class user {
     String userName;

    public user() {

    }

    public user(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "user{" +
                "userName='" + userName + '\'' +
                '}';
    }
}
