package com.neuedu.objectexample.four;

public class Factory01 implements FactoryMethod {
    @Override
    public Product create() {
        return new ProductA();
    }
}
