package com.cbcode.car_locator.constant;

public class Authority {

    public static final String[] USER_AUTHORITIES = { "user:read" };
    public static final String[] MANAGER_AUTHORITIES = { "user:read", "user:update", "user:create"};
    public static final String[] ADMIN_AUTHORITIES = { "user:read", "user:update", "user:create", "user:delete"};
}
