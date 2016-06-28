package me.qinchao.service;

/**
 * Created by sulvto on 16-6-28.
 */
public interface OAuthService {
    public void addAuthCode(String authCode, int userId);

    public void addAccessToken(String accessToken, int userId);

    boolean checkAuthCode(String authCode);

    boolean checkAccessToken(String accessToken);

    String getUserIdByAuthCode(String authCode);

    String getUserIdByAccessToken(String accessToken);

    long getExpireIn();

    public boolean checkClientId(String clientId);

    public boolean checkClientSecret(String clientSecret);
}
