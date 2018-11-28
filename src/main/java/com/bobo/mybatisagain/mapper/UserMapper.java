package com.bobo.mybatisagain.mapper;/**
 * Created by wuyangbo on 2018/11/29.
 */

import com.bobo.mybatisagain.model.SysUser;

import java.util.List;

/**
 * @program: mybatisagain
 * @description:
 * @author: wyb
 * @create: 2018-11-29 03:36
 **/
public interface UserMapper {

    SysUser selectById(Long id);

    List<SysUser> selectAll();
}
