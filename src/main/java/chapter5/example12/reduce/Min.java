package chapter5.example12.reduce;

import chapter1.Apple;

import java.util.*;

/**
 * @author zhangqi
 * @date 2021/9/8 下午12:25
 */
public class Min {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3,4,5);

        // 写法1
        Optional<Integer> optionalMin = intList.stream().reduce(Integer::min);
        System.out.println(optionalMin.get());

        // 写法2
        optionalMin = intList.stream().min(Integer::compareTo);
        System.out.println(optionalMin.get());


        List<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple(150, "green"));
        appleList.add(new Apple(100, "red"));
        appleList.add(new Apple(250, "light red"));
        appleList.add(new Apple(400, "deep red"));

        // 写法3
        Optional<Apple> optionalMinApple = appleList.stream().min(Comparator.comparing(Apple::getWeight));
        optionalMinApple.ifPresent(o -> System.out.println(optionalMinApple.get()));
    }
}
