package com.evan.design.pattern.factory;

import java.math.BigDecimal;

public interface NumberFactory {

    // 创建方法:
    // Number parse(String s);

    // 获取工厂实例:
    static NumberFactory getFactory() {
        return impl;
    }

    static NumberFactory impl = new NumberFactoryImpl();

    public static Number parse(String s) {
        return new BigDecimal(s);
    }
}
