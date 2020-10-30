package com.yu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;

import org.junit.Test;

public class Test1 {
    public static void main(String[] args) {
        //System.out.println("test");

        String str1 = UUID.randomUUID().toString().replace("-", "").toUpperCase();
        System.out.println(str1);
        String str2 = UUID.randomUUID().toString().replace("-", "").toUpperCase();
        System.out.println(str2);


        //String str = "http://ctg-stg1.hrx.pingan.com.cn/gzw-api/gzwapp/wx/suite/receive?echostr=BDxzkr73c3S0RBI8KgHRfsVJSJJApAoYKkGUT6U288MC%2BLwNOBHp7D9zW0l7KOdJv7Orpukb2g%2BGG9A4at4tSw%3D%3D&msg_signature=af8eb49e0e0b3948fa93abbe6e2ea33066cd7c1e&timestamp=1597983707&nonce=OGDGP8HsPaDG4H2Y";

        String s = "1";
        String a[] = s.split("!");
        System.out.println("a.length=" + a.length);
        System.out.println(a[a.length - 1]);
    }


    @Test
    public void test001() {
        File file = new File("/Users/hongluyu/work/local/docker.txt");
        // 1.创建流对象
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            // 2.创建一个缓存字节的容器数组
            byte[] buf = new byte[1024];
            // 3.定义一个变量，保存实际读取的字节数
            int hasRead = 0;
            // 4.循环读取数据
            while ((hasRead = fis.read(buf)) != -1) {
                String str = new String(buf, 0, hasRead);
                System.out.print(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 6.关闭流
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
