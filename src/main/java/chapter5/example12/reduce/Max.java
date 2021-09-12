package chapter5.example12.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author zhangqi
 * @date 2021/9/8 下午12:25
 */
public class Max {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3,4,5);
        Optional<Integer> optionalMax = intList.stream().reduce(Integer::max);
        System.out.println(optionalMax.get());
    }
}
