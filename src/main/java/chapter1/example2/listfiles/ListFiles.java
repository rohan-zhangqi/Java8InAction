package chapter1.example2.listfiles;

import java.io.File;
import java.io.FileFilter;

/**
 * @author Qi.Zhang4
 * @title: ListFiles
 * @projectName Java8InAction
 * @description: TODO
 * @date 2020/9/22 8:27
 */
public class ListFiles {

    public static void main(String[] args) {

        //before Java8
        File[] hiddenFiles1 = new File(".").listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.isHidden();
            }
        });

        //Java8
        File[] hiddenFiles2 = new File(".").listFiles(File::isHidden);
    }
}
