package org.example;

/**
 * 负责实现现有实例并生成新实例
 */
public class UnderlinePen implements Product{
    private char ulchar;

    public UnderlinePen(char ulchar){
        this.ulchar = ulchar;
    }
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\"" + s + "\"");

        for(int i=0;i<length+4;i++){
            System.out.print(ulchar);
        }
        System.out.println();

    }

    @Override
    public Product createClone() {
        Product p = null;
        try{
            p = (Product) clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return p;
    }
}
