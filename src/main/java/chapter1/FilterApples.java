package chapter1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author zhangqi
 * @date 2020/8/30 5:07 下午
 */
public class FilterApples {
    static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

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

        // 方法引用
        List<Apple> greenAppleList = filterApples(inventory, Apple::isGreenApple);
        greenAppleList.stream().forEach(System.out::println);

        System.out.println("------------------------------------");

        List<Apple> heavyAppleList = filterApples(inventory, Apple::isHeavyApple);
        heavyAppleList.stream().forEach(System.out::println);

        System.out.println("------------------------------------");

        // Lambda表达式
        filterApples(inventory, (Apple e) -> "green".equals(e.getColor())).stream().forEach(System.out::println);

        System.out.println("------------------------------------");

        filterApples(inventory, (Apple e) -> e.getWeight() > 150).stream().forEach(System.out::println);

        System.out.println("------------------------------------");

        filterApples(inventory, (Apple e) -> e.getWeight() < 80 || "brown".equals(e.getColor())).stream().forEach(System.out::println);
    }
}
