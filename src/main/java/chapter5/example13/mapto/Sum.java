package chapter5.example13.mapto;

import chapter1.Apple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangqi
 * @date 2021/9/10 上午8:16
 */
public class Sum {
    public static void main(String[] args) {
        List<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple(150, "green"));
        appleList.add(new Apple(100, "red"));
        appleList.add(new Apple(250, "light red"));
        appleList.add(new Apple(400, "deep red"));

        // 原始类型特化
        int sum = appleList.stream()
                .mapToInt(Apple::getWeight)
                // 如果流是空的，sum默认返回0。
                .sum();
        System.out.println(sum);
    }
}
