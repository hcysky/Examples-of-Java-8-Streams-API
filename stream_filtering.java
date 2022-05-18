import java.util.*;
import java.util.stream.Stream;

public class stream_filtering {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("Derek");
        list.add("Change");
        list.add("Italy");
        list.add("");
        list.add("Thursday");
        list.add("Apple");

        Stream<String> stream = list.stream().filter(element -> element.contains("a"));
        stream.forEach(System.out::println);
    }
}