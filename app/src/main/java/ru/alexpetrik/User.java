package ru.alexpetrik;

import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("login")
    private String login;
    @SerializedName("public_repos")
    private int public_repos;
    @SerializedName("followers")
    private int followers;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getPublic_repos() {
        return public_repos;
    }

    public void setPublic_repos(int public_repos) {
        this.public_repos = public_repos;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followerCount) {
        this.followers = followerCount;
    }
}
