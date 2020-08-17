package com.neuedu.objectexample.three;

public class ProductA  implements Product{
    @Override
    public void operation01() {
        System.out.println("输入A原材料");
    }

    @Override
    public void operation02() {
        System.out.println("输出A的产品");
    }
}
