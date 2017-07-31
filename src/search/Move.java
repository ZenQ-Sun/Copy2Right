package search;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by Garfield on 2017/5/24.
 *
 * 复制到指定文件夹
 * moveFileToDirectory(File srcFile, File destDir, boolean createDestDir)
 */
public class Move {


    public static void moveSub(File srcFolder, File endFolder,String key) throws IOException {

        if (srcFolder.isDirectory()) {

            File[] files = srcFolder.listFiles();

            for (File file: files
                    ) {
                moveSub(file,endFolder,key);
            }

        }else {
            if (srcFolder.getName().contains(key)){
                FileUtils.copyFileToDirectory(srcFolder,endFolder);
            }

        }
    }
}
