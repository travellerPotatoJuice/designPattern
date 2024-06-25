package org.example;

public class Product {

    private String part1;
    private String part2;

    private Product(Builder builder){
        part1 = builder.part1;
        part2 = builder.part2;
    }

    @Override
    public String toString() {
        return "Product{" +
                "part1='" + part1 + '\'' +
                ", part2='" + part2 + '\'' +
                '}';
    }

    public static final class Builder {

        private String part1;
        private String part2;

        public Builder setPart1(String part1){
            this.part1 = part1;
            //返回的是this对象，支持链式编程
            return this;
        }

        public Builder setPart2(String part2){
            this.part2 = part2;
            //返回的是this对象，支持链式编程
            return this;
        }

        public Product build(){
            return new Product(this);
        }


    }
}
