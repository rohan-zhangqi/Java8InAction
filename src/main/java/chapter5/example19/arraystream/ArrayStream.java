package chapter5.example19.arraystream;

import java.util.Arrays;

/**
 * @author zhangqi
 * @date 2021/9/13 上午8:37
 */
public class ArrayStream {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};
        System.out.println(Arrays.stream(nums).sum());
    }
}
