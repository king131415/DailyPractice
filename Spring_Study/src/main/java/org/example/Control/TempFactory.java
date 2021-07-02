package org.example.Control;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * 装配Bean的另一种方式，通过实现工厂Bean接口，来装配其他的Bean对象
 */
@Component
public class TempFactory implements FactoryBean<LonginControl.Temp> {
    @Override
    public LonginControl.Temp getObject() throws Exception {
        return new LonginControl.Temp();
    }

    @Override
    public Class<?> getObjectType() {
        return LonginControl.Temp.class;
    }
}
