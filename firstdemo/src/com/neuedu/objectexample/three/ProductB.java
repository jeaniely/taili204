package com.neuedu.objectexample.three;

public class ProductB implements Product {
    @Override
    public void operation01() {
        System.out.println("输入B的原材料");
    }

    @Override
    public void operation02() {
        System.out.println("输出B的产品");
    }
}
