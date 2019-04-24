package com.yogie.utils;

import com.yogie.domain.Essay;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @program: JsoupDemo
 * @Date: 2019/4/11 10:02
 * @Author: Chenyogie
 * @Description: 工具类，将文本内容写入本地文件
 */
public class FileUtils {

    static int num = 0001;

    /**
     * @param e 将文章对象写入本地文件
     * @throws IOException
     */
    public void writeToFile(Essay e) throws IOException {
        String filename = num + e.getTitle();
        File file = new File("D:/targetFolder/"+filename+".txt");
        //File file = new File("C:\\Users\\HS\\Desktop\\新建文件夹\\"+filename+".txt");
        if(file.exists()){
            System.out.println("文件已存在。");
        }else{
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            fw.write(e.getText());
            fw.flush();
            fw.close();
            System.out.println("写入文件成功。");
        }
        num++;
    }
}