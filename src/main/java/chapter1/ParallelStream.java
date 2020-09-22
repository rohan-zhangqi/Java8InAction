package chapter1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * @author Qi.Zhang4
 * @title: ParallelStream
 * @projectName Java8InAction
 * @description: TODO
 * @date 2020/9/22 8:46
 */
public class ParallelStream {

    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();
        Apple a = new Apple(100, "green");
        Apple b = new Apple(170, "red");
        Apple c = new Apple(160, "green");
        Apple d = new Apple(70, "red");

        inventory.add(a);
        inventory.add(b);
        inventory.add(c);
        inventory.add(d);

        //顺序执行
        List<Apple> heavyApples1 = inventory.stream()
                .filter((Apple apple) -> apple.getWeight() > 150)
                .collect(toList());

        //并行执行
        List<Apple> heavyApples2 = inventory.parallelStream()
                .filter((Apple apple) -> apple.getWeight() > 150)
                .collect(toList());
    }
}
