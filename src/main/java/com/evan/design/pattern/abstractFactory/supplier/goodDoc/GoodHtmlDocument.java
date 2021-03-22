package com.evan.design.pattern.abstractFactory.supplier.goodDoc;

import com.evan.design.pattern.abstractFactory.HtmlDocument;

import java.io.IOException;
import java.nio.file.Path;

public class GoodHtmlDocument implements HtmlDocument {
    @Override
    public String toHtml() {
        return null;
    }

    @Override
    public void save(Path path) throws IOException {

    }
}
