package com.example.demo.io;

import com.example.demo.io.Resource;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * 资源URL
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-08-03
 */
public class ResourceUrl implements Resource {
    private final URL url;

    public ResourceUrl(URL url){
        this.url=url;
    }

    @Override
    public InputStream getInputStream() throws Exception{
        URLConnection urlConnection=url.openConnection();
        urlConnection.connect();
        return urlConnection.getInputStream();
    }
}
