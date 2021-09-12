package chapter5.example11.findfirst;

import chapter1.Apple;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author zhangqi
 * @date 2021/9/8 上午8:31
 */
public class FindFirst {
    public static void main(String[] args) {
        List<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple(150, "green"));
        appleList.add(new Apple(100, "red"));
        appleList.add(new Apple(250, "light red"));
        appleList.add(new Apple(400, "deep red"));

        Optional<Apple> optionalApple = appleList.stream()
                .filter(a -> a.getWeight() > 100)
                .findFirst();

        System.out.println(optionalApple.get());
    }
}
