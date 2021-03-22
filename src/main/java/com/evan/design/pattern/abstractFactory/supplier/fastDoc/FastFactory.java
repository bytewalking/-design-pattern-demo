package com.evan.design.pattern.abstractFactory.supplier.fastDoc;

import com.evan.design.pattern.abstractFactory.AbstractFactory;
import com.evan.design.pattern.abstractFactory.HtmlDocument;
import com.evan.design.pattern.abstractFactory.WordDocument;

public class FastFactory implements AbstractFactory {
    @Override
    public HtmlDocument createHtml(String md) {
        return new FastHtmlDocument();
    }

    @Override
    public WordDocument createWord(String md) {
        return new FastWordDocument();
    }
}
