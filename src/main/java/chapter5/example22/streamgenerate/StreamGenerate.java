package chapter5.example22.streamgenerate;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author zhangqi
 * @date 2021/9/13 上午10:56
 */
public class StreamGenerate {
    public static void main(String[] args) {
        Stream.generate(Math::random).limit(10).forEach(System.out::println);

        Stream.generate(() -> 1).limit(5).forEach(System.out::println);

        IntStream.generate(() -> 5).limit(3).forEach(System.out::println);
    }
}
