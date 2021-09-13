package chapter5.example21.streamiterate;

import java.util.stream.Stream;

/**
 * @author zhangqi
 * @date 2021/9/13 上午10:50
 */
public class StreamIterate {
    public static void main(String[] args) {
        Stream.iterate(0, n -> n + 2).limit(10).forEach(System.out::println);
    }
}
