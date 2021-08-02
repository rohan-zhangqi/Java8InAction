package chapter1.example4.sortapples;

import chapter1.Apple;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

/**
 * @author Qi.Zhang4
 * @title: SortApples
 * @projectName Java8InAction
 * @description: TODO
 * @date 2020/9/22 8:24
 */
public class SortApples {
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

        inventory.sort(comparing(Apple::getWeight));

        inventory.stream().forEach(System.out::println);
    }
}
