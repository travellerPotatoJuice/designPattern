package org.example;

public class SDCardImpl implements SDCard{
    @Override
    public String readSD() {
        String msg = "This is SD card";
        return msg;
    }

    @Override
    public void writeSD(String str) {
        System.out.println("write: "+str+" to SD card");
    }
}
