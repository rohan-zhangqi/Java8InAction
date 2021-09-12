package chapter5.example14.streamtransition;

import chapter1.Apple;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author zhangqi
 * @date 2021/9/10 上午8:16
 */
public class StreamTransition {
    public static void main(String[] args) {
        List<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple(150, "green"));
        appleList.add(new Apple(100, "red"));
        appleList.add(new Apple(250, "light red"));
        appleList.add(new Apple(400, "deep red"));

        // 原始类型特化
        IntStream intStream = appleList.stream()
                .mapToInt(Apple::getWeight);
        // 转换为对象流
        Stream<Integer> integerStream = intStream.boxed();
    }
}
