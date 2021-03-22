package com.evan.design.pattern.abstractFactory.supplier.fastDoc;

import com.evan.design.pattern.abstractFactory.HtmlDocument;

import java.io.IOException;
import java.nio.file.Path;

public class FastHtmlDocument implements HtmlDocument {

    @Override
    public String toHtml() {
        return "toHtml";
    }

    @Override
    public void save(Path path) throws IOException {

    }
}
