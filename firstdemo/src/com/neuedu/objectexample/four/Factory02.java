package com.neuedu.objectexample.four;

public class Factory02 implements FactoryMethod {

    @Override
    public Product create() {
        return new ProductB();
    }
}
