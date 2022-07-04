package com.example.iam.domain;

import java.util.Date;
import java.util.Map;

public class AuthToken {

    private static final long DEFAULT_EXPIRED_TIME_INTERVAL = 1*60*1000;

    private String token;
    private long createTime;
    private long expiredTimeInterval = DEFAULT_EXPIRED_TIME_INTERVAL;

    public AuthToken(String token, long createTime) {
        this.token = token;
        this.createTime = createTime;
    }

    public AuthToken(String token, long createTime, long expiredTimeInterval) {
        this.token = token;
        this.createTime = createTime;
        this.expiredTimeInterval = expiredTimeInterval;
    }

    public static AuthToken generate(String originalUrl, String appId, String password, long timestamp) {
        return null;
    }

    public String getToken() {
        return token;
    }

    public boolean isExpired() {
        return createTime + expiredTimeInterval > new Date().getTime();
    }

    public boolean match(AuthToken authToken) {
        return authToken.getToken().equals(token);
    }

}
