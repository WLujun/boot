package com.dxd.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

/**
 * jwt工具类
 */
public class JwtTokenUtils {

    private static final String SECRET = "abc123";//密匙

    private static final String ISS = "com.dxd";//发布者的url地址

    // 过期时间是3600秒，既是1个小时
    private static final long EXPIRATION = 3600L;

    // 选择了记住我之后的过期时间为7天
    private static final long EXPIRATION_REMEMBER = 604800L;

    // 创建token
    public static String createToken(String username, boolean isRememberMe) {
        long expiration = isRememberMe ? EXPIRATION_REMEMBER : EXPIRATION;
        return Jwts.builder()
                .signWith(SignatureAlgorithm.HS512, SECRET)// 签名算法以及密匙
                .setIssuer(ISS) //发布者的url地址
                .setSubject(username) //该JWT所面向的用户，用于处理特定应用，不是常用的字段
                .setIssuedAt(new Date())//该jwt的发布时间；unix 时间戳
                .setExpiration(new Date(System.currentTimeMillis() + expiration * 1000))//该jwt销毁的时间；unix时间戳
                .compact();
    }

    // 从token中获取用户名
    public static String getUsername(String token){
        return getTokenBody(token).getSubject();
    }

    // 是否已过期
    public static boolean isExpiration(String token){
        return getTokenBody(token).getExpiration().before(new Date());
    }

    private static Claims getTokenBody(String token){
        return Jwts.parser()
                .setSigningKey(SECRET)
                .parseClaimsJws(token)
                .getBody();
    }



}
