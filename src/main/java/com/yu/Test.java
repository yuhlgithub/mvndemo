package com.yu;

import java.util.UUID;

public class Test {
    public static void main(String[] args){
        //System.out.println("test");

        String str1 = UUID.randomUUID().toString().replace("-","").toUpperCase();
        System.out.println(str1);
        String str2 = UUID.randomUUID().toString().replace("-","").toUpperCase();
        System.out.println(str2);

        //String str = "http://ctg-stg1.hrx.pingan.com.cn/gzw-api/gzwapp/wx/suite/receive?echostr=BDxzkr73c3S0RBI8KgHRfsVJSJJApAoYKkGUT6U288MC%2BLwNOBHp7D9zW0l7KOdJv7Orpukb2g%2BGG9A4at4tSw%3D%3D&msg_signature=af8eb49e0e0b3948fa93abbe6e2ea33066cd7c1e&timestamp=1597983707&nonce=OGDGP8HsPaDG4H2Y";


    }
}
