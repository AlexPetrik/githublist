package ru.alexpetrik;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GithubService {
    @GET("users/{username}")
    Call<User> user(@Path("username") String username);
}
