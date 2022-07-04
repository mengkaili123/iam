package com.example.iam.domain;

public class ApiRequest {

    private String token;

    private String appId;

    private String originalUrl;

    private long timestamp;

    public ApiRequest(String baseUrl, String token, String appId, long timestamp) {
        this.originalUrl = baseUrl;
        this.token = token;
        this.appId = appId;
        this.timestamp = timestamp;
    }


    // TODO: 2022/7/5 解析token，appId，timeStamp, originalUrl
    public static ApiRequest buildFromUrl(String url) {

    }

    public String getToken() {
        return token;
    }

    public String getAppId() {
        return appId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }
}
