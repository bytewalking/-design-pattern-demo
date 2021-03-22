package com.evan.design.pattern.abstractFactory.supplier.goodDoc;

import com.evan.design.pattern.abstractFactory.AbstractFactory;
import com.evan.design.pattern.abstractFactory.HtmlDocument;
import com.evan.design.pattern.abstractFactory.WordDocument;

public class GoodFactory implements AbstractFactory {
    @Override
    public HtmlDocument createHtml(String md) {
        return null;
    }

    @Override
    public WordDocument createWord(String md) {
        return null;
    }
}
