package bai_10_Java_Colletion_Framework.bai_tap;

import java.util.Comparator;

public class SortByDown implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o2.getPrice() - o1.getPrice());
    }
}
