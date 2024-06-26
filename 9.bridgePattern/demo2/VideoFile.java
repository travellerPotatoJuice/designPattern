package org.example;

public interface VideoFile {

    /**
     * 不同格式文件有不同的解码方法，留到子类实现
     * @param fileName
     */
    void decode(String fileName);
}
