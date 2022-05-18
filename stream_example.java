import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class stream_example {
    public static void main(String[] args) throws IOException {

        List<Fruit> fruits = new ArrayList<Fruit>();
        fruits.add(new Fruit("Apple", 9.9));
        fruits.add(new Fruit("Orange", 12.5));
        fruits.add(new Fruit("Banana", 15.9));

        //展示原始的水果列表
        System.out.println(">>>>>> Before filter: ");
        for (Fruit r : fruits) {
            System.out.println("Name: " + r.name + ", Price: " + r.price);
        }

        //filter-1: 筛选出水果价格大于10.0的
        List<Fruit> res1 = fruits.stream().filter(f -> f.getPrice() > 10.0).collect(Collectors.toList()); //Note: 此处的f可以设置为任意的变量名
        System.out.println(">>>>>> After filter-1: ");
        for (Fruit r : res1) {
            System.out.println("Name: " + r.name + ", Price: " + r.price);
        }

        //filter-2: 筛选出水果名称为"Apple"的
        List<Fruit> res2 = fruits.stream().filter(o -> "Apple".equals(o.getName())).collect(Collectors.toList()); //Note: 此处的o可以设置为任意的变量名
        System.out.println(">>>>>> After filter-2: ");
        for (Fruit r : res2) {
            System.out.println("Name: " + r.name + ", Price: " + r.price);
        }
    }

    public static class Fruit {
        String name;
        double price;

        public Fruit(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getPrice() {
            return this.price;
        }
    }
}
