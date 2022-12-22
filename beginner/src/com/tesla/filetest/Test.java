package com.tesla.filetest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        File f1 = new File("/Users/qiliu/IdeaProjects/study_java/log", "project.log");
        // 大小
        // System.out.println(f1.length());

        // 文件名
        // System.out.println(f1.getName());

        // 传递路径
        // System.out.println(f1.getPath());

        // 绝对路径
        // System.out.println(f1.getAbsolutePath());

        // 文件夹
        // System.out.println(f1.isDirectory());

        // 文件
        // System.out.println(f1.isFile());

        // 删除文件
        // boolean result1 = f1.delete();
        // System.out.println(result1);

        // 创建文件
        // boolean result2 = f1.createNewFile();
        // System.out.println(result2);

        // System.out.println(Arrays.toString(f1.list()));
        // System.out.println(Arrays.toString(f1.listFiles()));
        FileInputStream fis = new FileInputStream(f1);
        int len = 0;
        int num = 40;
        while ((len = fis.read()) != -1) {
            System.out.println(len);
            System.out.println((char) num);
        }
    }
}
