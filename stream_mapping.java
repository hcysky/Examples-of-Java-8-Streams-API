import java.util.*;
import java.util.stream.Collectors;
// import java.util.stream.Stream;

public class stream_mapping {
    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("numList:");
        numList.stream().forEach(System.out::println);

        List<Integer> numSquareList = numList.stream().map(number -> number * number).distinct()
                .collect(Collectors.toList()); // 获取对应的平方数

        System.out.println("\nnumSquareList:");
        numSquareList.stream().forEach(System.out::println);

    }
}