package com.example.demo.xml;
import lombok.Data;

/**
 * bean的定义
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-08-03
 */
@Data
public class BeanDefinition {
    /**
     * bean
     */
    private Object bean;

    /**
     * bean的Class对象
     */
    private Class beanClass;

    /**
     * bean的类全限定名称
     */
    private String className;

    /**
     * 通过设置类名称反射生成class对象
     * @param className
     */
    public void setClassName(String className) {
        this.className = className;
        try{
            this.beanClass=Class.forName(className);
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    /**
     * 类的属性集合
     */
    private PropertyValues propertyValues = new PropertyValues();

    /**
     * 获取bean的属性集合
     */
    public PropertyValues getPropertyValues() {
        return this.propertyValues;
    }
}
