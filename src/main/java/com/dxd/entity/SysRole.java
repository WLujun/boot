package com.dxd.entity;

//角色表（sys_role表）
public class SysRole {
    //主键id
    private Integer id;
    //角色名称
    private String name;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
