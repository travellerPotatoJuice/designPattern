package org.example;

public class SDAdapter extends TFCardImpl implements SDCard{

    /**
     * SD卡的接口，调用TF卡的方法
     * @return
     */
    @Override
    public String readSD() {
        return readTF();
    }

    /**
     * SD卡的接口，调用TF卡的方法
     * @return
     */
    @Override
    public void writeSD(String str) {
        writeTF(str);
    }
}
