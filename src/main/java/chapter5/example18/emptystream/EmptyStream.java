package chapter5.example18.emptystream;

import java.util.stream.Stream;

/**
 * @author zhangqi
 * @date 2021/9/13 上午8:33
 */
public class EmptyStream {
    public static void main(String[] args) {
        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(System.out::println);
    }
}
