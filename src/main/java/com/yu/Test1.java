package com.yu;

import java.io.*;
import java.util.*;

import org.junit.Assert;
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
    public void testInputStream() {
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


    @Test
    public void testOutputStream() {
        // 1.选择流：创建流对象
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(new File("/Users/hongluyu/work/local/test.txt"), true);
            // 2.准备数据源，把数据源转换成字节数组类型
            String msg = "\n野径云俱黑，江船火独明。\n晓看红湿处，花丛锦官城。";
            byte[] data = msg.getBytes();
            // 3.通过流向文件当中写入数据
            fos.write(data, 0, data.length);
            // 4.刷新流
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                // 5.关闭流
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void testSystemIn() {
        int b;
        try {
            System.out.println("please Input:");
            while ((b = System.in.read()) != -1) {
                System.out.print((char) b);
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    @Test
    public void test01(){
        List<String> a = null;//new ArrayList();
        for (String str: a){
            System.out.printf("str");
        }
    }


    @Test
    public void test00(){
        List<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(5);
        al.add(2);
        al.add(3);
        al.add(100);
        System.out.println(al.toString());

        Collections.sort(al, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int i = o1-o2;
                if (i>0){
                    return 1;
                }else if(i<0){
                    return -1;
                }
                return 0;
            }
        });
        System.out.println(al.toString());

        al = al.subList(0,3);
        System.out.println(al.toString());
    }


    @Test
    public void test02(){
        Date d1 = new Date();
        Date d2 = new Date();
        d2.setTime(d1.getTime() + 1000000);
        System.out.println(d1.before(d2));
    }



    @Test
    public void test03(){
        String a = "1!2!3";
        a = a.substring(0,a.lastIndexOf("!"));
        System.out.println(a);
    }

    @Test
    public void test04(){
        List<Object> a = new ArrayList<>();
        a.add(null);
        System.out.println(a.size());
        for (Object o : a){
            System.out.println(o.toString());
        }
    }
}
