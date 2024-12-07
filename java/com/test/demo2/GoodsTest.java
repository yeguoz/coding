package com.test.demo2;

public class GoodsTest {
    public static void main(String[] args) {
        Goods g1 = new Goods("001","华为手机",4999.9,200);
        Goods g2 = new Goods("002","水杯",199.89,500);
        Goods g3 = new Goods("003","洗发水",99.98,50);
        Goods[] g = {g1,g2,g3};
        for (int i = 0; i < g.length; i++) {

            System.out.println("商品id ："+g[i].getId());
            System.out.println("商品名  ："+g[i].getName());
            System.out.println("商品价格："+g[i].getPrice());
            System.out.println("商品数量："+g[i].getCount());
            System.out.println();
        }
    }
}
