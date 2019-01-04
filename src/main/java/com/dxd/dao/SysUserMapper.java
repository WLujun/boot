package com.dxd.dao;

import com.dxd.entity.SysUser;

public interface SysUserMapper {
    SysUser findByUsername(String username);
}
