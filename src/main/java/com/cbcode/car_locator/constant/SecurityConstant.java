package com.cbcode.car_locator.constant;

/*
* Sites to access information about JWT security
*
* https://github.com/auth0/java-jwt
* https://auth0.com/
*/



public class SecurityConstant {

    public static final long EXPIRATION_TIME = 432_000_000; // Ex. 5 days expiration in milliseconds
    public static final String TOKEN_PREFIX = "Bearer "; // Verifying the token header
    public static final String JWT_TOKEN_HEADER = "Jwt-Token"; // custom header
    public static final String TOKEN_CANNOT_BE_VERIFIED = "Token cannot be verified"; // message response
    public static final String GET_ARRAYS_LLC = "Get Arrays, LLC"; // company given access
    public static final String GET_ARRAYS_ADMINISTRATION = "User Management Portal";
    public static final String AUTHORITIES = "authorities";
    public static final String FORBIDDEN_MESSAGE = "You need to log in to access this page";
    public static final String ACCESS_DENIED_MESSAGE = "You do not have permission to access this page";
    public static final String OPTIONS_HTTP_METHOD = "OPTIONS";
    //public static final String[] PUBLIC_URLS = { "/user/login", "/user/register", "/user/resetpassword/**", "/user/image/**" }; // Only the users access this
    public static final String[] PUBLIC_URLS = { "**" };

}
