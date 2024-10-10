package com.shteydle.top.homeWorkGeneric;

public class MyArrayList<E> {

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
     * Метод возвращает элемент массива под заданным индексом;
     * @param position - индекс элемента массива;
     * @return - элемент массива в виде Object;
     */
    public Object getElement(int position) {

        Object a = data[position];
        return a;
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
     * @param e - данные дюбого типа;
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
}
