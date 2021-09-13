package chapter5.example17.valuestream;

import java.util.stream.Stream;

/**
 * @author zhangqi
 * @date 2021/9/13 上午8:27
 */
public class StreamOf {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Hello", "World");
        stringStream.forEach(System.out::println);
    }
}
