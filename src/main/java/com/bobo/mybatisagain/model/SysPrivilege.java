package com.bobo.mybatisagain.model;/**
 * Created by wuyangbo on 2018/11/29.
 */

/**
 * @program: mybatisagain
 * @description:
 * @author: wyb
 * @create: 2018-11-29 03:29
 **/
public class SysPrivilege {
    private Long id;
    private String  privilegeName;
    private String privilegeUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrivilegeName() {
        return privilegeName;
    }

    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName;
    }

    public String getPrivilegeUrl() {
        return privilegeUrl;
    }

    public void setPrivilegeUrl(String privilegeUrl) {
        this.privilegeUrl = privilegeUrl;
    }
}
