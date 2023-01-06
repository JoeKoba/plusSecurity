package com.example.demo.model;

public enum Permission {
    USERS_READ("developers:read"),
    USERS_WRITE("developers:write");

    private final String permission;

    Permission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
