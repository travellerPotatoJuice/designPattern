package org.example;

public class Computer {
    public String readSD(SDCard sdCard){
        if(sdCard==null){
            throw new NullPointerException("sd card should not be null");
        }
        return sdCard.readSD();
    }

    public void write(SDCard sdCard, String msg){
        if(sdCard==null){
            throw new NullPointerException("sd card should not be null");
        }
        sdCard.writeSD(msg);
    }
}
