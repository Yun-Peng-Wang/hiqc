package com.example.demo.result;

public class Login {
    private Integer userId;
    private Integer roleId;

    public Login(Integer userId, Integer roleId){
        this.userId = userId;
        this.roleId = roleId;
    }
    //get必须写

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}
