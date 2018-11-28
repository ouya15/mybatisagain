package com.bobo.mybatisagain.model;/**
 * Created by wuyangbo on 2018/11/29.
 */

/**
 * @program: mybatisagain
 * @description:
 * @author: wyb
 * @create: 2018-11-29 03:30
 **/
public class SysRolePrivilege {
    private Long roleId;
    private Long privilegeId;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Long privilegeId) {
        this.privilegeId = privilegeId;
    }
}
