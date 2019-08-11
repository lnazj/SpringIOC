package com.example.demo.xml;

import lombok.Data;

/**
 * 属性定义
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-08-03
 */
public class PropertyValue {
    /**
     * 属性名称
     */
    private final String name;

    /**
     * 属性对象
     */
    private final Object value;

    /**
     * 构造函数
     * @param name
     * @param value
     */
    public PropertyValue(String name,Object value){
        this.value=value;
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public Object getValue(){
        return this.value;
    }
}
