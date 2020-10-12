package com.hkz.xa;

import java.util.HashMap;

/**
 * @author xiaoao
 * @date 2020/10/8 - 13:29
 */
public class DeBugJava {

    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("name","TOM");
        map.put("age","20");
        map.put("school","hkz");
        map.put("major","computer");

        String age=map.get("age");
        System.out.println("age = " + age);

        map.remove("major");
        System.out.println(map);

    }


}
