package com.hkz.xa;


import java.util.ArrayList;

public class HelloWorld {
    public static void main(String[] args) {


        String [] arr=new String []{"123","465","555"};
        //模板：fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //iter
        for (String s : arr) {
            System.out.println(s);
        }
        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //list.for
        ArrayList<String> alist = new ArrayList<>();
        alist.add("第123");
        alist.add("第456");
        alist.add("第789");
        for (String s : alist) {
            System.out.println(s);
        }
        
        //alist.fori
        for (int i = 0; i < alist.size(); i++) {
            
        }

        //alist.forr
        for (int i = alist.size() - 1; i >= 0; i--) {
            
        }


    }

    public void mec() {
        
        //模板 ifn
        ArrayList<String> alist = new ArrayList<>();
        alist.add("第123");
        alist.add("第456");
        alist.add("第789");
        if (alist == null) {
            
        }

        //inn
        if (alist != null) {

        }
        //xx.nn /xx.null
        if (alist != null) {

        }
        if (alist == null) {

        }

        //

    }
}
