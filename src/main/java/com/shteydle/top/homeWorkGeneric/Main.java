package com.shteydle.top.homeWorkGeneric;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        MyArrayList<String> arr = new MyArrayList<>(2);
        arr.pushBack("Str1");
        arr.pushBack("Str2");
        arr.pushBack("Str3");
        arr.pushBack("Str1");
        arr.pushBack("Str1");
        arr.pushBack("Str4");
        arr.pushBack("Str8");

        arr.pushBack("Str1");
        arr.pushBack("Str1");

        arr.pushBack("Str23");
        arr.pushBack("Str1");
        arr.pushBack("Str1");

        //arr.popFront();

      /*  arr.pushFront("Str54");
        arr.pushBack("Str1");

        arr.insert(5, "Str6");
        arr.insert(3, "Str1");*/

        //arr.removeAt(3);
        MyArrayList<String> arr2 = new MyArrayList<>(2);
        arr2.pushBack("Str1");
        arr2.pushBack("Str2");
        arr2.pushBack("Str3");
        arr2.pushBack("Str1");
        arr2.pushBack("Str1");
        arr2.pushBack("Str4");
        arr2.pushBack("Str8");

        arr2.pushBack("Str1");
        arr2.pushBack("Str1");

        arr2.pushBack("Str23");
        arr2.pushBack("Str1");
        arr2.pushBack("Str1");


        //arr.popFront();

        /*arr.pushFront("Str54");
        arr.pushBack("Str1");

        arr.insert(5, "Str6");
        arr.insert(3, "Str1");*/

/*        System.out.println(arr.getSize());
        System.out.println(arr.toString());

        //arr.remove(7);
        arr.removeAll("Str1");

        System.out.println(arr.getSize());
        System.out.println(arr.toString());

        arr.popBack();

        System.out.println(arr.getSize());
        System.out.println(arr.toString());
        arr.pushBack("Str6");

        //arr.clear();

        System.out.println(arr.getSize());
        System.out.println(arr.toString());

        System.out.println(arr.isEmpty());

        System.out.println(arr.indexOf("Str4"));
        System.out.println(arr.lastIndexOf("Str6"));

        arr.reverse();
        System.out.println(arr.toString());

        arr.shuffle();
        System.out.println(arr.toString());*/

        System.out.println(arr.myEquals(arr2));
    }
}
