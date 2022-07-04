package com.example.iam.service;

import com.example.iam.domain.ApiRequest;

public interface ApiAuthenticator {

    void auth(String url);

    void auth(ApiRequest apiRequest);

}
