package com.evan.design.pattern.abstractFactory.supplier.goodDoc;

import com.evan.design.pattern.abstractFactory.HtmlDocument;
import com.evan.design.pattern.abstractFactory.WordDocument;

import java.io.IOException;
import java.nio.file.Path;

public class GoodWordDocument implements WordDocument {
    @Override
    public void save(Path path) throws IOException {

    }
}
