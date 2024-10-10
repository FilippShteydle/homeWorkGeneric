package com.shteydle.top.homeWorkGeneric;

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

        //arr.popFront();

        arr.pushFront("Str54");
        arr.pushBack("Str1");

        arr.insert(5, "Str6");
        arr.insert(3, "Str1");

        //arr.removeAt(3);

        System.out.println(arr.getSize());
        System.out.println(arr.toString());

        //arr.remove(7);
        arr.removeAll("Str1");

        System.out.println(arr.getSize());
        System.out.println(arr.toString());

        arr.popBack();

        System.out.println(arr.getSize());
        System.out.println(arr.toString());

        arr.clear();

        System.out.println(arr.getSize());
        System.out.println(arr.toString());

    }
}
