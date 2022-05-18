import java.util.*;

public class stream_iterating {
    public static void main(String[] args) {

        List<Integer> list_int = Arrays.asList(9, 12, 25, 36, 42, 55, 73, 95); //by Collection

        //基于Iterating，查询是否有整除5发整数
        System.out.print("Output( 25 ? ):\t");
        boolean isExistNum1 = list_int.stream().anyMatch(number -> number == 25);
        if (isExistNum1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        //基于Iterating，查询是否有整数17
        System.out.print("Output( 17 ? ):\t");
        boolean isExistNum2 = list_int.stream().anyMatch(number -> number == 17);
        if (isExistNum2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}