package com.evan.design.pattern.factory;

import java.math.BigDecimal;

public class NumberFactoryImpl implements NumberFactory{

    // 产品接口是Number
    public Number parse(String s) {
        // 返回的实际产品
        return new BigDecimal(s);
    }
}
