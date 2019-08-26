package Teoria2;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

//    @Override
//    public int compareTo(Product o) {
//        if (this.price > o.price){
//            return 1;
//        }else if (this.price == o.price){
//            return this.name.compareTo(o.name);
//        }else{
//            return  -1;
//        }
//    }


//    @Override
//    public int compareTo(Product o) {
//        return this.name.compareTo(o.name);
////        if (this.name.compareTo(o.name) > 0){
////            return 1;
////        }else if (this.name.compareTo(o.name) == 0){
////            return 0;
////        }else
////            return -1;
//    }
}
