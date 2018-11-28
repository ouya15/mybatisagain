package com.bobo.mybatisagain.model;/**
 * Created by wuyangbo on 2018/11/29.
 */

/**
 * @program: mybatisagain
 * @description:
 * @author: wyb
 * @create: 2018-11-29 01:35
 **/
public class Country {
    private Long id;
    private String countryname;
    private String countrycode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }
}
