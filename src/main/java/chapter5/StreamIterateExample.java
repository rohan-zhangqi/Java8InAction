package chapter5;

import java.util.stream.Stream;

/**
 * 5.7.4 由函数生成流：创建无限流 1.迭代
 * @author Qi.Zhang4
 * @title: StreamIterateExample
 * @projectName Java8InAction
 * @description: TODO
 * @date 2020/8/27 8:41
 */
public class StreamIterateExample {
    public static void main(String[] args) {
        Stream.iterate(0, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);
    }
}
