package chapter5.example7.anymatch;

import chapter1.Apple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangqi
 * @date 2021/9/8 上午8:31
 */
public class AnyMatch {
    public static void main(String[] args) {
        List<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple(150, "green"));
        appleList.add(new Apple(100, "red"));
        appleList.add(new Apple(250, "light red"));
        appleList.add(new Apple(400, "deep red"));

        Boolean b = appleList.stream()
                .anyMatch(a -> a.getWeight() > 100);

        System.out.println(b);
    }
}
