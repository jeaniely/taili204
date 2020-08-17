package com.neuedu.objectexample.four;

public class ProductC implements Product {
    @Override
    public void operation01() {
        System.out.println("C的原材料");
    }

    @Override
    public void operation02() {
        System.out.println("C的产品");
    }
}
