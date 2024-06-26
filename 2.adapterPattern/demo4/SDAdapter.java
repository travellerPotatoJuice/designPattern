package org.example;

public class SDAdapter implements SDCard{

    /**
     * 组合代替继承，降低适配器类和被适配类的耦合度
     */
    private TFCard tfCard;

    public SDAdapter(TFCard tfCard){
        this.tfCard = tfCard;
    }

    /**
     * SD卡的接口，调用TF卡的方法
     * @return
     */
    @Override
    public String readSD() {
        return tfCard.readTF();
    }

    /**
     * SD卡的接口，调用TF卡的方法
     * @return
     */
    @Override
    public void writeSD(String str) {
        tfCard.writeTF(str);
    }
}
