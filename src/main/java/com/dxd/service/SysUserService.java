package com.dxd.service;

import com.dxd.entity.SysUser;

public interface SysUserService {

    SysUser findByUsername(String username);
}
