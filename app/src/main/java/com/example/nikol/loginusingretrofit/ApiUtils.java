package com.example.nikol.loginusingretrofit;

public class ApiUtils {

    public static final String BASE_URL = ""; //REQUIRED - base URL of the web service

    public static UserService getUserService(){
        return RetrofitClient.getClient(BASE_URL).create(UserService.class);
    }
}
