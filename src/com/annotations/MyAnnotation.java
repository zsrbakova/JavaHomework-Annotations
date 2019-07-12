package com.annotations;


import java.lang.annotation.Inherited;

@Inherited
public @interface MyAnnotation {
    String name() ;
    int count() default 111;
}
