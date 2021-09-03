package chapter1;

import java.util.Objects;

/**
 * @author zhangqi
 * @date 2020/8/30 5:10 下午
 */
public class Apple {
    private Integer weight;
    private String color;

    public Apple(Integer weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public static boolean isGreenApple(Apple apple){
        return "green".equals(apple.getColor());
    }

    public static boolean isHeavyApple(Apple apple){
        return apple.getWeight() > 150;
    }

    @Override
    public String toString() {
        return "apple {weight:" + this.getWeight() + ", color:" + this.getColor() + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Apple apple = (Apple)o;
        return Objects.equals(weight, apple.weight) &&
                Objects.equals(color, apple.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, color);
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
