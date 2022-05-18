import java.util.*;

public class stream_reduction {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 3);
        intList.stream().forEach(System.out::println);

        Integer reduceSum = intList.stream().reduce(10, (a, b) -> a + b);
        System.out.println("result: " + reduceSum);
    }
}