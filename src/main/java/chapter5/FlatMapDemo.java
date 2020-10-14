package chapter5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 5.2.2 示例：给定单词列表["Hello","World"]，将其转换为["H","e","l","o","w","r","d",]。
 *
 * @author Qi.Zhang4
 * @title: FlatMapDemo
 * @projectName Java8InAction
 * @description: TODO
 * @date 2020/10/14 16:26
 */
public class FlatMapDemo {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("World");
        List<String> uniqueCharacters = words.stream()
                        .map(w -> w.split(""))//将每个单词转换为由其字母构成的数组
                        .flatMap(Arrays::stream)//将各个生成流扁平化为单个流
                        .distinct()
                        .collect(Collectors.toList());
        uniqueCharacters.stream().forEach(System.out::println);
    }
}
