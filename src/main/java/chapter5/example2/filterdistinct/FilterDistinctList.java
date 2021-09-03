package chapter5.example2.filterdistinct;

import chapter1.Apple;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @author zhangqi
 * @date 2021/9/3 下午4:07
 */
public class FilterDistinctList {
    public static void main(String[] args) {
        List<Apple> appleList = new ArrayList<>();

        // 模拟质量和颜色相同的苹果
        appleList.add(new Apple(150, "green"));
        appleList.add(new Apple(150, "green"));

        // 加入其它苹果
        appleList.add(new Apple(100, "red"));
        appleList.add(new Apple(250, "light red"));
        appleList.add(new Apple(400, "deep red"));

        // 使用distinct时，需要覆盖实体类的equals()方法
        appleList.stream()
                .filter(Apple::isGreenApple)
                .distinct()
                .forEach(System.out::println);
    }
}
