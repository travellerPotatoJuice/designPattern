package org.example;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        //创建原对象
        Citation citation = new Citation();
        Student student = new Student();
        student.setName("zhangsan");
        citation.setStudent(student);

        //克隆对象
        Citation clone = citation.clone();

        //查看原对象中student的name是否被更改，若被更改说明是浅拷贝
        clone.getStudent().setName("lisi");
        System.out.println("origin name:" + citation.getStudent().getName()+"\n"+"clone name:" + clone.getStudent().getName());
        System.out.println("=====================");

        //通过序列化和反序列化深克隆
        //初建对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("output.txt"));
        oos.writeObject(citation);
        oos.close();

        //创建对象输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("output.txt"));
        Citation clone2 = (Citation) ois.readObject();
        ois.close();

        //查看原对象中student的name是否被更改，若没被更改说明是深拷贝
        clone2.getStudent().setName("wangwu");
        System.out.println("origin name:" + citation.getStudent().getName()+"\n"+"clone name:" + clone2.getStudent().getName());





    }

}

