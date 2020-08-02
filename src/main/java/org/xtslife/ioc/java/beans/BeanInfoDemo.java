package org.xtslife.ioc.java.beans;

import java.beans.*;
import java.util.stream.Stream;

/**
 * @创建人：关涛
 * @创建时间: 2020/8/2
 * @描述：
 */
public class BeanInfoDemo {
    // Introspector.getBeanInfo
    public static void main(String[] args) throws IntrospectionException {
        BeanInfo beanInfo = Introspector.getBeanInfo(Person.class);
        BeanDescriptor beanDescriptor = beanInfo.getBeanDescriptor();
        System.out.println("类描述"+beanDescriptor);
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();


        Stream.of(propertyDescriptors).forEach(propertyDescriptor -> System.out.println("类属性描述"+propertyDescriptor));

    }
}
