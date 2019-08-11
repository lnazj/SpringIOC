package com.example.demo.factory;

import com.example.demo.xml.BeanDefinition;
import com.example.demo.xml.BeanReference;
import com.example.demo.xml.PropertyValue;
import java.lang.reflect.Field;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-08-03
 */
public class AutowireBeanFactory extends AbstractBeanFactory {

    @Override
    public Object doCreate(BeanDefinition beanDefinition) throws Exception{
        Object bean=beanDefinition.getBeanClass().newInstance();
        addPropertyValue(bean,beanDefinition);
        return bean;
    }

    public void addPropertyValue(Object bean,BeanDefinition beanDefinition) throws Exception{
        for(PropertyValue pv:beanDefinition.getPropertyValues().getPropertyValues())
        {
            Field declaredField=bean.getClass().getDeclaredField(pv.getName());

            declaredField.setAccessible(true);

            Object value=pv.getValue();

            if(value instanceof BeanReference){
                BeanReference beanReference=(BeanReference) value;
                value=getBean(beanReference.getName());
            }
            declaredField.set(bean,value);
        }
    }
}
