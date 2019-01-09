package com.dxd.annotation;

import java.lang.annotation.*;

/**
 * 判断是否需要登录和是否拥有权限
 */
@Documented
@Target(ElementType.FIELD)
@Inherited
@Retention(RetentionPolicy.RUNTIME )
public @interface PassToken {

    /**
     * 是否需要登录
     * @return
     */
    boolean isLogin() default true;

    /**
     * 权限
     * @return
     */
    String roleValue() default "";

}