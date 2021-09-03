package chapter5.example3.filterlimit;

import chapter1.Apple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangqi
 * @date 2021/9/3 下午5:26
 */
public class FilterLimit {
    public static void main(String[] args) {
        List<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple(150, "green"));
        appleList.add(new Apple(100, "red"));
        appleList.add(new Apple(250, "light red"));
        appleList.add(new Apple(400, "deep red"));

        appleList.stream()
                .filter(a -> a.getWeight() > 100)
                .limit(2)
                .forEach(System.out::println);
    }
}
