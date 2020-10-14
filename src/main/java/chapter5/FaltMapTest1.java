package chapter5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 测验5.2：给定列表[1,2,3]和[3,4]，返回[(1,3),(1,4),(2,3),(2,4),(3,3),(3,4)]
 * @author Qi.Zhang4
 * @title: FaltMapTest
 * @projectName Java8InAction
 * @description: TODO
 * @date 2020/10/14 17:32
 */
public class FaltMapTest1 {
    public static void main(String[] args) {
        List<Integer> number1 = Arrays.asList(1,2,3);
        List<Integer> number2 = Arrays.asList(3,4);
        List<int[]> pairs = number1.stream()
                .flatMap(i -> number2.stream()
                                     .map(j -> new int[]{i, j}))
                .collect(Collectors.toList());
    }
}
