package org.example;

/**
 * 适配器，通过继承来调用方法。
 */
public class PrintBanner extends Banner implements Print{


    public PrintBanner(String string){
        super(string);
    }
    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
