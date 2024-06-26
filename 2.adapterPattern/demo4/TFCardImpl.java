package org.example;

/**
 * 适配者类
 */
public class TFCardImpl implements TFCard{
    @Override
    public String readTF() {
        String msg = "This is TF Card";
        return msg;
    }

    @Override
    public void writeTF(String str) {
        System.out.println("write: "+str+" to TF card");
    }
}
