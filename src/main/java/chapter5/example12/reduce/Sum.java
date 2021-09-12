package chapter5.example12.reduce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author zhangqi
 * @date 2021/9/8 下午12:25
 */
public class Sum {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3,4,5);

        // 写法1
        // 当无元素时，确保有求和后的值
        Integer sum = intList.stream().reduce(0, (a, b) -> a+b);
        System.out.println(sum);

        // 写法2
        sum = intList.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        List<Integer> intList1 = new ArrayList<>();
        // 当无元素时，无法确保有求和后的值
        Optional<Integer> sum1 = intList1.stream().reduce((a, b) -> a+b);
        System.out.println(sum1.isPresent()? sum1.get(): "null");
    }
}
