package com.ctrip.car.osd.framework.dal.query;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * SQL语句参数注解 , 标识参数名称
 * 
 * @author xiayx@Ctrip.com
 *
 */
@Target({ ElementType.METHOD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SqlParam {

	String value() default "";

}
