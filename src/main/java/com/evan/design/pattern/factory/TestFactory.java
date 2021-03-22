package com.evan.design.pattern.factory;

/**
 * 里氏替换原则：返回实现接口的任意子类都可以满足该方法的要求，且不影响调用方
 */
public class TestFactory {
    public static void main(String[] args) {
        /*
        调用方可以完全忽略真正的工厂NumberFactoryImpl和实际的产品BigDecimal，
        这样做的好处是允许创建产品的代码独立地变换，而不会影响到调用方
         */
        NumberFactory factory = NumberFactory.getFactory();
//        Number result = factory.parse("123.456");
        // 总是引用接口而非实现类，能允许变换子类而不影响调用方，即尽可能面向抽象编程
        Number result = NumberFactory.parse("123.456");
        System.out.println(result);
    }
}
