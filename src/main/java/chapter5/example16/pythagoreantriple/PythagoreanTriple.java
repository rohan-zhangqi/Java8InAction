package chapter5.example16.pythagoreantriple;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 勾股数
 * @author zhangqi
 * @date 2021/9/12 上午10:19
 */
public class PythagoreanTriple {
    public static void main(String[] args) {
        Stream<int[]> pythagoreanTriple =
                IntStream.rangeClosed(1, 100)
                        .boxed()
                        .flatMap(a -> IntStream.rangeClosed(a, 100)
                                .filter(b -> Math.sqrt(a*a + b*b) % 1 == 0)
                                .mapToObj(b -> new int[]{a, b, (int)Math.sqrt(a*a + b*b)}));
        pythagoreanTriple.forEach(arr -> System.out.println("[" + arr[0]+ " ," + arr[1] + ", " + arr[2] +"]"));

        System.out.println();

        Stream<double[]> pythagoreanTriple2 =
                IntStream.rangeClosed(1, 100)
                        .boxed()
                        .flatMap(a -> IntStream.rangeClosed(a, 100).mapToObj(b -> new double[]{a, b, Math.sqrt(a*a + b*b)}))
                        .filter(t -> t[2] % 1 ==0);
        pythagoreanTriple2.forEach(arr -> System.out.println("[" + arr[0]+ " ," + arr[1] + ", " + arr[2] +"]"));
    }
}
