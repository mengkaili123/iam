package com.example.iam.service;

public interface ApiAuthenticator {

    void auth(String url);

    void auth(ApiRequest apiRequest);

}
