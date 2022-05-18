import java.util.*;
import java.util.stream.Collectors;

public class stream_collecting {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("Derek");
        list.add("Change");
        list.add("Italy");
        list.add("");
        list.add("Thursday");
        list.add("Apple");

        System.out.println("List: ");
        list.stream().forEach(System.out::println);

        System.out.println("\nresultList: ");
        List<String> resultList = list.stream().map(element -> element.toUpperCase()).collect(Collectors.toList());
        resultList.stream().forEach(System.out::println);
    }
}