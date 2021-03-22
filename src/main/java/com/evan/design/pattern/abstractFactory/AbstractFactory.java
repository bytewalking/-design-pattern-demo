package com.evan.design.pattern.abstractFactory;

import com.evan.design.pattern.abstractFactory.supplier.fastDoc.FastFactory;
import com.evan.design.pattern.abstractFactory.supplier.goodDoc.GoodFactory;

public interface AbstractFactory {

    public static AbstractFactory createFactory(String name) {
        if (name.equalsIgnoreCase("fast")) {
            return new FastFactory();
        } else if (name.equalsIgnoreCase("good")) {
            return new GoodFactory();
        } else {
            throw new IllegalArgumentException("Invalid factory name");
        }
    }
    // 创建Html文档:
    HtmlDocument createHtml(String md);
    // 创建Word文档:
    WordDocument createWord(String md);
}
