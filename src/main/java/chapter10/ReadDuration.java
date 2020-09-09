package chapter10;

import org.junit.Test;

import java.util.Optional;
import java.util.Properties;
import static org.junit.Assert.assertEquals;

/**
 * @author Qi.Zhang4
 * @title: ReadDuration
 * @projectName Java8InAction
 * @description: TODO
 * @date 2020/9/9 12:45
 */
public class ReadDuration {

    @Test
    public void test(){
        Properties props = new Properties();
        props.setProperty("a","5");
        props.setProperty("b","true");
        props.setProperty("c","-3");

        assertEquals(5, readDuration(props, "a"));
        assertEquals(0, readDuration(props, "b"));
        assertEquals(0, readDuration(props, "c"));
        assertEquals(0, readDuration(props, "d"));
    }

    public int readDuration(Properties props, String name){
        return Optional.ofNullable(props.getProperty(name))
                .flatMap(OptionalUtility::stringToInt)
                .filter(i -> i > 0)
                .orElse(0);
    }
}
