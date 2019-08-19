package com.highgreat.sven.myapplication.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//自定义注解，RUNTIME代表运行时，生命周期最长 METHOD代表适用于方法还有FIELD,TYPE等类型
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface BehaviorTrace {
    String value();
}
