package org.example;

/**
 * 适配者类接口
 */
public interface TFCard {
    String readTF();

    void writeTF(String str);
}
