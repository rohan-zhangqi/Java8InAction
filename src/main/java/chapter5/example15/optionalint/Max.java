package chapter5.example15.optionalint;

import chapter1.Apple;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

/**
 * @author zhangqi
 * @date 2021/9/10 上午8:41
 */
public class Max {
    public static void main(String[] args) {
        List<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple(150, "green"));
        appleList.add(new Apple(100, "red"));
        appleList.add(new Apple(250, "light red"));
        appleList.add(new Apple(400, "deep red"));

        OptionalInt optionalMax = appleList.stream().mapToInt(Apple::getWeight).max();

        System.out.println(optionalMax.getAsInt());
        System.out.println(optionalMax.orElse(1));
    }
}
