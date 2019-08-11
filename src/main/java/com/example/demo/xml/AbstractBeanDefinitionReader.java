package com.example.demo.xml;
import com.example.demo.io.ResourceLoader;

import java.util.HashMap;
import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-08-03
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    /**
     *  注册bean 容器
     */
    private Map<String,BeanDefinition> registry;

    /**
     * 资源加载器
     */
    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(ResourceLoader resourceLoader){
        this.registry=new HashMap<>();
        this.resourceLoader=resourceLoader;
    }

    /**
     * 获取容器
     * @return
     */
    public Map<String,BeanDefinition> getRegistry() {
        return registry;
    }

    /**
     * 获取资源加载器
     * @return
     */
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
