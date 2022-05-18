import java.util.*;
import java.util.stream.Stream;

public class stream_matching {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("Derek");
        list.add("Change");
        list.add("Italy");
        list.add("");
        list.add("Thursday");
        list.add("Apple");

        list.stream().forEach(System.out::println);

        boolean isAnyValid = list.stream().anyMatch(element -> element.contains("k")); //anyMatch
        if (isAnyValid) {
            System.out.println("anyMatch(k) is true");
        } else {
            System.out.println("anyMatch(k) is false");
        }

        boolean isAllValid = list.stream().allMatch(element -> element.contains("a")); //allMatch
        if (isAllValid) {
            System.out.println("allMatch(a) is true");
        } else {
            System.out.println("allMatch(a) is false");
        }

        boolean isNoneValid = list.stream().noneMatch(element -> element.contains("x")); //noneMatch
        if (isNoneValid) {
            System.out.println("noneMatch(x) is true");
        } else {
            System.out.println("noneMatch(x) is false");
        }

    }
}