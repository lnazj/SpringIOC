package com.example.demo.io;

import java.net.URL;

/**
 * 资源加载器
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-08-03
 */
public class ResourceLoader {
    /**
     * 给定一个位置， 使用累加器的资源加载URL，并创建一个“资源URL”对象，便于获取输入流
     */
    public ResourceUrl getResource(String location){
        URL url=this.getClass().getClassLoader().getResource(location);
        return new ResourceUrl(url);
    }
}
