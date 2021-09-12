package chapter5.example6.flatmap;

import java.util.Arrays;
import java.util.List;

/**
 * @author zhangqi
 * @date 2021/9/6 下午12:48
 */
public class FlatMap2 {
    public static void main(String[] args) {
        List<Integer> number1 = Arrays.asList(1,2,3);
        List<Integer> number2 = Arrays.asList(3,4);
        number1.stream()
                .flatMap(i -> number2.stream().map(j -> new int[]{i, j}))
                .forEach(arr -> System.out.println("[" + arr[0] + ", " + arr[1] + "]"));
    }
}
