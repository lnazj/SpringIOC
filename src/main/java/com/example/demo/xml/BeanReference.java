package com.example.demo.xml;

import lombok.Data;

/**
 *bean 的引用
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-08-03
 */
@Data
public class BeanReference {
    /**
     * bean 名称
     */
    private String name;

    /**
     * bean 对象
     */
    private Object bean;
    public BeanReference(String name){
        this.name=name;
    }
}
