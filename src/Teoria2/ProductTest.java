package Teoria2;

import java.util.*;

public class ProductTest {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Czekolada", 4.5));
        list.add(new Product("Mleko", 2.5));
        list.add(new Product("Maslo", 2.5));

        PriceComparator comparator = new PriceComparator() {

        Collections.sort(list, comparator);


        Collections.sort(list);
        System.out.println(list);
        Set<Product> set = new TreeSet<>(comparator);

    }
}
