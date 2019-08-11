package com.example.demo.factory;

import com.example.demo.xml.BeanDefinition;

/**
 * 获取bean，注册bena
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-08-03
 */
public interface BeanFactory {
    /**
     * 根据bean的名称从容器中获取bean
     * @param name
     * @return
     * @throws Exception
     */
    Object getBean(String name) throws Exception;

    /**
     * 将bean注册到容器中
     * @param name
     * @param bean
     * @throws Exception
     */
    void registerBeanDefinition(String name, BeanDefinition bean) throws Exception;

}