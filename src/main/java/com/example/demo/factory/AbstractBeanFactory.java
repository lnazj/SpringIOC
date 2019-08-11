package com.example.demo.factory;
import com.example.demo.xml.BeanDefinition;
import java.util.HashMap;

/**
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-08-03
 */
public abstract class AbstractBeanFactory implements BeanFactory {
    /**
     * 容器
     */
    private HashMap<String,BeanDefinition> map =new HashMap<>();


    /**
     * 根据bean的名称获取bean， 如果没有，则抛出异常 如果有， 则从bean定义对象获取bean实例
     * @param name
     * @return
     * @throws Exception
     */
    @Override
    public Object getBean(String name) throws Exception {
        BeanDefinition beanDefinition=map.get(name);
        if(beanDefinition==null){
            throw new IllegalArgumentException("No bean named"+name+"is defined");
        }
        Object bean=beanDefinition.getBean();
        if(bean==null){
            bean=doCreate(beanDefinition);
        }
        return bean;
    }

    @Override
    public void registerBeanDefinition(String name, BeanDefinition beandefinition) throws Exception {
        Object bean= doCreate(beandefinition);
        beandefinition.setBean(bean);
        map.put(name,beandefinition);
    }


    abstract Object doCreate(BeanDefinition beanDefinition) throws Exception;
}
