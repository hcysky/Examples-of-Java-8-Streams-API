import java.util.*;
import java.util.stream.Stream;

public class stream_creation {
    public static void main(String[] args) {
        //Integer
        List<Integer> list_int = Arrays.asList(9, 12, 25, 36, 42, 55, 73, 95); //by Collection
        System.out.println("Output(x > 10 && x < 30):");
        list_int.stream().filter(number -> (number > 10 && number < 30)).forEach(System.out::println);//使用stream().filter获取大于10且小于30的数，并打印出来

        Integer[] array_int = new Integer[] { 9, 12, 25, 36, 42, 55, 73, 95 };//by Array
        Stream<Integer> stream_int1 = Arrays.stream(array_int);//using stream() method
        System.out.println("Output(x % 2 == 0):");
        stream_int1.filter(number -> (number % 2 == 0)).forEach(System.out::println);

        Stream<Integer> stream_int2 = Stream.of(9, 12, 25, 36, 42, 55, 73, 95);//using of() method
        System.out.println("Output(x % 5 == 0):");
        stream_int2.filter(number -> (number % 5 == 0)).forEach(System.out::println);

        //String
        List<String> list_str = Arrays.asList("Beijing", "Tianjin", "Shanghai"); //by Collection
        System.out.println("Output(location != Shanghai):");
        list_str.stream().filter(location -> location != "Shanghai").forEach(System.out::println);

        String[] array_str = new String[] { "Beijing", "Tianjin", "Shanghai" };
        Stream<String> stream1 = Arrays.stream(array_str);
        System.out.println("Output(location != Beijing):");
        stream1.filter(location -> location != "Beijing").forEach(System.out::println);

        Stream<String> stream2 = Stream.of("Beijing", "Tianjin", "Shanghai");
        System.out.println("Output(location != Tianjin):");
        stream2.filter(location -> location != "Tianjin").forEach(System.out::println);
    }
}