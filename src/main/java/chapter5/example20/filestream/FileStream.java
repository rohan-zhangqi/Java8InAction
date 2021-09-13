package chapter5.example20.filestream;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author zhangqi
 * @date 2021/9/13 上午8:40
 */
public class FileStream {
    public static void main(String[] args) {
        long uniqueWords = 0;
        try(Stream<String> lines = Files.lines(Paths.get("src/main/resources/data.txt"), Charset.defaultCharset())) {
            uniqueWords = lines.flatMap(line -> Arrays.stream(line.split(" "))).distinct().count();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(uniqueWords);
    }
}
