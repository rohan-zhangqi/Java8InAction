package chapter10;

import java.util.Optional;

/**
 * @author Qi.Zhang4
 * @title: OptionalUtility
 * @projectName Java8InAction
 * @description: TODO
 * @date 2020/9/9 13:33
 */
public class OptionalUtility {
    public static Optional<Integer> stringToInt(String s){
        try {
            return Optional.of(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }
}
