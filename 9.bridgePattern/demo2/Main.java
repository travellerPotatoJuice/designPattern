package org.example;


public class Main {
    public static void main(String[] args) throws Exception {
        //创建操作系统对象
        OperatingSystem system1 = new Linux(new AviFile());
        OperatingSystem system2 = new Windows(new AviFile());
        OperatingSystem system3 = new Linux(new RmvbFile());
        OperatingSystem system4 = new Windows(new RmvbFile());
        //播放文件
        system1.play("file1");
        system2.play("file2");
        system3.play("file3");
        system4.play("file4");




    }



}


