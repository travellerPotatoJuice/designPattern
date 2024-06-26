package org.example;

/**
 * 外观类
 */
public class SmartAppliancesFacade {

    private Light light;
    private TV tv;
    private AirCondition airCondition;


    public SmartAppliancesFacade(){
        light = new Light();
        tv = new TV();
        airCondition = new AirCondition();
    }

    public void say(String msg){
        if(msg.contains("开启")){
            on();
        }else if(msg.contains("关闭")){
            off();
        }else{
            System.out.println("未识别有效信息");
        }
    }

    private void on(){
        light.on();
        tv.on();
        airCondition.on();
    }

    private void off(){
        light.off();
        tv.off();
        airCondition.off();
    }
}
