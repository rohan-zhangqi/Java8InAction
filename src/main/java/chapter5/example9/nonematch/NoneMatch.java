package chapter5.example9.nonematch;

import chapter1.Apple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangqi
 * @date 2021/9/8 上午8:31
 */
public class NoneMatch {
    public static void main(String[] args) {
        List<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple(150, "green"));
        appleList.add(new Apple(100, "red"));
        appleList.add(new Apple(250, "light red"));
        appleList.add(new Apple(400, "deep red"));

        Boolean b = appleList.stream()
                .noneMatch(a -> a.getWeight() > 100);

        System.out.println(b);
    }
}
