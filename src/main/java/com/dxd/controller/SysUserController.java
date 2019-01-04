package com.dxd.controller;

import com.dxd.entity.SysUser;
import com.dxd.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by  lpw'ASUS on 2018/7/20.
 */
@RestController
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/test")
    public SysUser test(@RequestParam String username){
        /*System.out.println(1);
        return null;*/
        return sysUserService.findByUsername(username);
    }
}
