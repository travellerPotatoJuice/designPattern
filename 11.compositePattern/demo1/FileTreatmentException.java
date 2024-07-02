package org.example;

/**
 * 自定义异常类
 */
public class FileTreatmentException extends RuntimeException{

    public FileTreatmentException(){}
    public FileTreatmentException(String msg){
        super(msg);
    }
}
