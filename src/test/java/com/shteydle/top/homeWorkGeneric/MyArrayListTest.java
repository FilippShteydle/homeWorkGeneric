package com.shteydle.top.homeWorkGeneric;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {


    MyArrayList<Integer> arr = new MyArrayList<>(3);

    @Test
    void getSizeTest() {
        arr.pushBack(2);
        arr.pushBack(1);
        arr.pushBack(0);

        assertEquals(3, arr.getSize());
    }

    @Test
    void toStringTest() {
        arr.pushBack(2);
        arr.pushBack(1);
        arr.pushBack(0);

        String s = "2 1 0 ";

        assertEquals(s, arr.toString());
    }

    @Test
    void pushBackTest() {
        arr.pushBack(2);
        arr.pushBack(1);
        arr.pushBack(0);

        int c = (int) arr.getElement(2);

        assertEquals(0, c);
    }

    @Test
    void popFontTest() {
        arr.pushBack(2);
        arr.pushBack(1);
        arr.pushBack(0);

        assertEquals(3, arr.getSize());
        arr.popFront();
        int c = (int) arr.getElement(0);
        assertEquals(1, c);
        assertEquals(2, arr.getSize());
    }

    @Test
    void pushFrontTest() {
        arr.pushBack(2);
        arr.pushBack(1);
        arr.pushBack(0);

        arr.pushFront(5);
        int c = (int) arr.getElement(0);

        assertEquals(5, c);
    }

    @Test
    void insertTest() {
        arr.pushBack(2);
        arr.pushBack(1);
        arr.pushBack(0);

        arr.insert(1, 15);

        int c = (int) arr.getElement(1);

        assertEquals(15, c);
    }

    @Test
    void removeAtTest() {
        arr.pushBack(2);
        arr.pushBack(1);
        arr.pushBack(0);

        arr.removeAt(1);

        int c = (int) arr.getElement(1);
        assertEquals(0, c);
        assertEquals(2, arr.getSize());
    }

    @Test
    void removeTest() {
        arr.pushBack(2);
        arr.pushBack(1);
        arr.pushBack(0);
        arr.pushBack(1);
        arr.pushBack(3);

        arr.remove(1);

        int c = (int) arr.getElement(1);

        assertEquals(0, c);
        assertEquals(4, arr.getSize());
    }

    @Test
    void removeAllTest() {
        arr.pushBack(2);
        arr.pushBack(1);
        arr.pushBack(0);
        arr.pushBack(1);
        arr.pushBack(3);

        arr.removeAll(1);

        int c = (int) arr.getElement(1);
        int d = (int) arr.getElement(2);

        String s = "2 0 3 ";

        assertEquals(0, c);
        assertEquals(3, d);
        assertEquals(3, arr.getSize());
        assertEquals(s, arr.toString());
    }

    @Test
    void popBackTest() {
        arr.pushBack(2);
        arr.pushBack(1);
        arr.pushBack(0);
        arr.pushBack(1);
        arr.pushBack(3);

        assertEquals(5, arr.getSize());

        arr.popBack();

        assertEquals(4, arr.getSize());
    }

    @Test
    void clearTest() {
        arr.pushBack(2);
        arr.pushBack(1);
        arr.pushBack(0);
        arr.pushBack(1);
        arr.pushBack(3);

        assertEquals(5, arr.getSize());

        arr.clear();
        String s = "";

        assertEquals(0, arr.getSize());
        assertEquals(s, arr.toString());
    }

}
