package com.example.demo.xml;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author 李娜
 * @version 0.0.1
 * @since 0.0.1  2019-08-03
 */
public class PropertyValues {
    /**
     * 属性list
     */
    private final List<PropertyValue> propertyValueList=new ArrayList<>();

    public PropertyValues(){

    }

    /**
     * 添加进属性集合
     * @param pv
     */
    public void addPropertyValue(PropertyValue pv){
        propertyValueList.add(pv);
    }

    /**
     * 获取属性集合
     * @return
     */
    public List<PropertyValue> getPropertyValues(){
        return propertyValueList;
    }
}
