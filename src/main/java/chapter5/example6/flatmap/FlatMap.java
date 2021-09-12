package chapter5.example6.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定单词列表["Hello","World"]，将其转换为["H","e","l","o","w","r","d",]。
 * @author zhangqi
 * @date 2021/9/6 上午8:36
 */
public class FlatMap {
    public static void main(String[] args) {
        List<String> helloWorld = new ArrayList<>();
        helloWorld.add("Hello");
        helloWorld.add("World");

        // 以下代码无法达到预期
        helloWorld.stream()
                // 将每个单词转换为由其字母构成的数组
                .map(word -> word.split(""))
                // 让每个数组变成一个单独的流
                .map(Arrays::stream)
                .distinct()
                .forEach(System.out::println);

        // 正解
        helloWorld.stream()
                // 将每个单词转换为由其字母构成的数组
                .map(w -> w.split(""))
                // Arrays::stream将数组转换为流
                // flatMap将各个生成流扁平化为单个流
                .flatMap(Arrays::stream)
                .distinct()
                .forEach(System.out::println);
    }
}
