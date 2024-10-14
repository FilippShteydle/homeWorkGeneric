package com.shteydle.top.homeWorkGeneric;

import java.util.Arrays;
import java.util.Random;

public class MyArrayList<E> implements Cloneable {

    private Object[] data;
    private int size;
    private int capacity;

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        data = new Object[capacity];
        size = 0;
    }

    public MyArrayList() {
        capacity = 10;
        data = new Object[capacity];
        size = 0;
    }

    /**
     * Метод для получения параметра size - размер массива;
     * @return - возвращает значение int;
     */

    public int getSize() {
        return size;
    }

    /**
     * Метод, возвращающий строковое представление элементов массива через пробел;
     * @return возвращает строку с элементами массива;
     */

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < capacity; i++) {
            if (data[i] == null) {
                //sb.append(null + " ");
                continue;
            }
            sb.append(data[i] + " ");
        }
        return sb.toString();
    }

    private void ensureCapacity() {
        if (size >= capacity) {
            capacity = (int) (capacity * 1.5 + 1);
            Object[] newData = new Object[capacity];
            for (int i = 0; i < size; i++) {
                newData[i] = data[i];
            }
            data = newData;

        }
    }

    /**
     * Метод добавляет элемент в конец массива;
     * @param e - данные любого типа;
     */

    public void pushBack(E e) {
        ensureCapacity();
        data[getSize()] = e;
        size++;
    }

    /**
     * Метод удаляет первый элемент массива;
     */

    public void popFront() {
        Object[] newData = new Object[capacity];
        for (int i = 1; i < size; i++) {
            newData[i - 1] = data[i];
        }
        size -= 1;
        data = newData;
    }

    /**
     * Метод добавляет элемент в начало массива;
     * @param e - данные любого типа;
     */

    public void pushFront(E e) {
        ensureCapacity();
        size += 1;
        Object[] newData = new Object[capacity];
        newData[0] = e;

        for (int i = 1; i < size; i++) {
            newData[i] = data[i - 1];
        }
        data = newData;
    }

    /**
     * Метод добавляет данный элемент в массив по заданному индексу;
     * @param position - индекс элемента в массиве;
     * @param elem - элемент любого типа;
     */

    public void insert(int position, E elem) {
        ensureCapacity();
        size++;
        if (position > size) {
            System.out.println("Ошибка! Выход за пределы массива");
        } else {
            Object[] newData = new Object[capacity];
            int a = 0;
            for (int i = 0; i < size; i++) {

                if (i == position) {
                    newData[i] = elem;
                    a++;
                } else {
                    newData[i] = data[i - a];
                }
            }
            data = newData;
        }
    }

    /**
     * Метод удаляет элемент массива по заданному индексу;
     * @param position - индекс элемента в массиве;
     */
    public void removeAt(int position) {
        if (position > size) {
            System.out.println("Ошибка! Данного индекса нет");
        } else {
            Object[] newData = new Object[capacity];
            int a = 0;
            size--;
            for (int i = 0; i < size; i++) {
                if (i == position) {
                    a = 1;
                }
                newData[i] = data[i+a];
            }
            data = newData;
        }
    }

    /**
     * Метод удаляет элемент массива, значение которого совпадает с переданным;
     * @param e - элемент, который необходимо удалить;
     */

    public void remove(E e) {
        Object[] newData = new Object[capacity];
        int a = 0;
        size--;
        for (int i = 0; i < size; i++) {
            if (data[i] == e) {
                a = 1;
            }
            newData[i] = data[i + a];
        }
        data = newData;
    }

    /**
     * Метод удаляет все элемент массива, значение которых совпадает с переданным;
     * @param e - элемент, который необходимо удалить;
     */
    public void removeAll(E e) {

        Object[] newData = data;
        int contSize = size;

        for (int i = 0; i < contSize; i++) {
            if (newData[i] == e) {
                remove(e);
            }
        }
    }

    /**
     * Метод удаляет последний элемент в массиве;
     */
    public void popBack() {
        removeAt(size);
    }

    /**
     * Метод удаляет все элементы массива;
     */
    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    /**
     * Метод проверят есть ли в массиве элементы;
     * @return возвращает true если size = 0, и false  в обратном случае
     */
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * Метод подгоняет значение capacity под size;
     */
    public void trimToSize() {
        capacity = size;

        Object[] newData = new Object[capacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    /**
     * Линейный поиск слева направо первого вхождения в массив указанного значения;
     * @param e - элемент, который необходимо найти;
     * @return возвращает индекс найденного элемента, если ничего не найдено возвращает -1;
     */
    public int indexOf(E e) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (data[i] == e) {
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * Линейный поиск справа налево вхождения в массив указанного значения;
     * @param e - элемент, который необходимо найти;
     * @return возвращает индекс найденного элемента, если ничего не найдено возвращает -1;
     */
    public int lastIndexOf(E e) {
        int index = -1;
        for (int i = size - 1; i > 0; i--) {
            if (data[i] == e) {
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * Изменение порядка следования элементов в массиве на противоположный;
     */
    public void reverse() {
        Object[] newData = new Object[capacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[size - 1 - i];
        }
        data = newData;
    }

    private int[] getRand() {
        Random random = new Random();
        boolean flag = false;
        int[] arrRandom = new int[size];
        int randomNum = 0;
        for (int i = 0; i < size; i++) {
            while (!flag) {
                randomNum = random.nextInt(1, size + 1);
                for (int j = 0; j <= i; j++) {
                    if (randomNum != arrRandom[j]) {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                }
            }
            arrRandom[i] = randomNum;
            flag = false;
        }
        for (int i = 0; i < size; i++) {
            if (arrRandom[i] == size) {
                arrRandom[i] = 0;
            }
        }
       return arrRandom;
    }

    /**
     * Случайное перемешивание элементов массива;
     */
    public void shuffle() {
        Object[] newData = new Object[capacity];
        int[] arr =getRand();
        for (int i = 0; i < size; i++) {
            newData[i] = data[arr[i]];
        }
        data = newData;
    }

    /**
     * Метод сравнивает массивы не только по количеству элементов, но и по их содержимому;
     * @param arr - массив, с которым необходимо сравнить;
     * @return - возвращает true если массивы идентичны и false в обратном случае;
     */
    public boolean myEquals(MyArrayList arr) {
       boolean flag = false;
        if (arr.getSize() == getSize()) {
            for (int i = 0; i < size; i++) {
                if (arr.getElementAt(i) != getElementAt(i)) {
                    flag = false;
                    break;
                }
                flag = true;
            }
        } else {
            flag = false;
        }
        return flag;
    }

    /**
     * Метод ищет элемент по указанному индексу;
     * @param index - индекс по которому необходимо вернуть элемент;
     * @return - возвращает элемент по заданному индексу
     */
    public E getElementAt(int index) {
        if (index >= size) {
            System.out.println("Выход за пределы массива");
        }
        return (E) data[index];
    }

    /**
     * Метод создает точную копию MyArrayList;
     * @return ссылку на копию объекта;
     * @throws CloneNotSupportedException - если класс объекта не реализует интерфейс Cloneable;
     */
    @Override
    protected MyArrayList<E> clone() throws CloneNotSupportedException {
        return (MyArrayList<E>) super.clone();
    }
}
