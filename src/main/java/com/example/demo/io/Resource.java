package com.example.demo.io;

import java.io.InputStream;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-08-03
 */

public interface Resource {
    /**
     * 获取输入流
     * @return
     * @throws Exception
     */
    InputStream getInputStream() throws Exception;
}
