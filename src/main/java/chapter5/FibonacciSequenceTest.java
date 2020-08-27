package chapter5;

import java.util.stream.Stream;

/**
 * 测验5.4 斐波那契数列元组序列
 * @author Qi.Zhang4
 * @title: FibonacciSequenceTest
 * @projectName Java8InAction
 * @description: TODO
 * @date 2020/8/27 8:56
 */
public class FibonacciSequenceTest {
    public static void main(String[] args) {
        Stream.iterate(new int[]{0,1}, t -> new int[]{t[1], t[0]+t[1]})
        .limit(20)
        .forEach(t -> System.out.println("(" + t[0] + "," + t[1] + ")"));
    }
}
