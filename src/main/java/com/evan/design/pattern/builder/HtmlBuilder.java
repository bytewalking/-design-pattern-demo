package com.evan.design.pattern.builder;

public class HtmlBuilder {
    private HeadingBuilder headingBuilder = new HeadingBuilder();
    private HrBuilder hrBuilder = new HrBuilder();
    private ParagraphBuilder paragraphBuilder = new ParagraphBuilder();
    private QuoteBuilder quoteBuilder = new QuoteBuilder();

    public String toHtml(String markdown) {
        StringBuilder buffer = new StringBuilder();
        String[] line = markdown.split(" ");
        for(String l:line){
            if (l.startsWith("#")) {
                buffer.append(headingBuilder.buildHeading(l)).append('\n');
            } else if (l.startsWith(">")) {
                buffer.append(quoteBuilder.buildQuote(l)).append('\n');
            } else if (l.startsWith("---")) {
                buffer.append(hrBuilder.buildHr(l)).append('\n');
            } else {
                buffer.append(paragraphBuilder.buildParagraph(l)).append('\n');
            }
        }

        return buffer.toString();
    }
}
