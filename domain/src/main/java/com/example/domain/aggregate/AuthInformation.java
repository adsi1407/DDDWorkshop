package com.example.domain.aggregate;

import com.example.domain.entity.Role;

import java.util.ArrayList;
import java.util.List;

public class AuthInformation {

    private String userId;
    private String password;
    private List<Role> roles;

    public AuthInformation(Role role) {

        if (role != null) {
            roles = new ArrayList<>();
            roles.add(role);
        }
        else {
            // throws exception
        }
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
