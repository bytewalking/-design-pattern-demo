package com.evan.design.pattern.abstractFactory.supplier.fastDoc;

import com.evan.design.pattern.abstractFactory.WordDocument;

import java.io.IOException;
import java.nio.file.Path;

public class FastWordDocument implements WordDocument {

    @Override
    public void save(Path path) throws IOException {

    }
}
