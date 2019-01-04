package com.dxd.service.Impl;


import com.dxd.dao.SysUserMapper;
import com.dxd.entity.SysUser;
import com.dxd.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by  lpw'ASUS on 2018/7/20.
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser findByUsername(String username) {
        return sysUserMapper.findByUsername(username);
    }
}
