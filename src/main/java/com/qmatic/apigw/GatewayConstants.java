package com.qmatic.apigw;

import java.nio.charset.Charset;

public class GatewayConstants {

    private GatewayConstants() {}

    public static final Charset UTF8_CHARSET = Charset.forName("UTF-8");
    public static final String AUTH_TOKEN = "auth-token";
    public static final String SSOCOOKIE = "SSOcookie";
    public static final String JSESSIONID = "JSESSIONID";

    public static final String VISITS_ON_BRANCH_CACHE = "visitsOnBranchCache";
}
