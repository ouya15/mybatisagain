package com.bobo.mybatisagain.model;/**
 * Created by wuyangbo on 2018/11/29.
 */

/**
 * @program: mybatisagain
 * @description:
 * @author: wyb
 * @create: 2018-11-29 03:28
 **/
public class SysUserRole {
    private Long userId;
    private Long roleId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
