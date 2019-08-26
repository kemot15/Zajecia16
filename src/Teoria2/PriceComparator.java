package Teoria2;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {
    public int compareTo(Product o1, Product o2) {
        if (o1 == null && o2 == null)
            return 0;
        if (o1 == null && o2 !=null)
            return  -1;
        if (o1 != null && o2 ==null)
            return 1;
        if (o1.getPrice() > o2.getPrice()){
            return 1;
        }else if (o1.getPrice() == o2.getPrice()){
            return 0;
        }else
            return -1;
    }
//
//    @Override
//    public int compareTo(Product o) {
//        return 0;
//    }
}
