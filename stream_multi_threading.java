import java.util.*;

public class stream_multi_threading {
    public static void main(String[] args) {
        //Integer
        List<Integer> list_int = Arrays.asList(9, 12, 25, 36, 42, 55, 73, 95); //by Collection
        System.out.println("Output(x > 10 && x < 30):");
        list_int.stream().filter(number -> (number > 10 && number < 30)).forEach(System.out::println);//使用stream().filter获取大于10且小于30的数，并打印出来

        long count = list_int.parallelStream().filter(number -> (number > 10 && number < 30)).count();//打印满足上述条件整数的数量
        System.out.println("Output number(x > 10 && x < 30):\t" + count);
    }
}