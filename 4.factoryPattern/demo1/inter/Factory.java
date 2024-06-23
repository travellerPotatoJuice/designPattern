package org.example.inter;

public abstract class Factory {
    public Product create(String owner){
        Product p = createProduct(owner);
        registerProdcut(p);
        return p;
    }

    /**
     * 创建并返回一个产品。具体由子类实现
     * @return
     */
    public abstract Product createProduct(String owner);

    /**
     * 注册产品。具体由子类实现
     */
    public abstract void registerProdcut(Product product);
}
