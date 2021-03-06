package com.dxd.entity;

import java.util.List;

//用户表（sys_user表）
public class SysUser {
    //主键id
    private Integer id;

    public SysUser(String username) {
        this.username = username;
    }

    //用户名
    private String username;
    //登录密码
    private String password;

    private List<SysRole> roles;

    public SysUser() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<SysRole> getRoles() {
        return roles;
    }

    public void setRoles(List<SysRole> roles) {
        this.roles = roles;
    }
}
