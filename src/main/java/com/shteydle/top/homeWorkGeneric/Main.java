package com.shteydle.top.homeWorkGeneric;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        MyArrayList<String> arr = new MyArrayList<>(2);
        arr.pushBack("Str10");
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

        MyArrayList<String> arr2;

        try {
            arr2 = arr.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(arr.myEquals(arr2));



    }
}
