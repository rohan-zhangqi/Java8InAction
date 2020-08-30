package chapter1;

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
