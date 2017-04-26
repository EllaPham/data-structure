/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dynamicarrayexample;

/**
 *
 * @author Trang
 */
public class Vector {

    int[] myArray;
    int pointer_last;
    int CAPACITY = 64;

    public Vector() {
        myArray = new int[CAPACITY];
        pointer_last = -1;
    }

    public int size() {
        return pointer_last + 1;
    }

    public int capacity() {
        return CAPACITY;
    }

    public boolean is_empty() {
        return (pointer_last < 0);
    }

    public Integer at(int index) {
        if (index >= 0 && index <= pointer_last) {
            return myArray[index];
        } else {
            return null;
        }
    }

    public Integer push(int item) {
        if (pointer_last < CAPACITY - 1) {
            pointer_last += 1;
            myArray[pointer_last] = item;

            return item;
        }
        return null;
    }

    public Integer insert(int index, int item) {
        if (pointer_last >= CAPACITY - 1) {
            resize(CAPACITY * 2);
        }

        for (int i = pointer_last; i >= index; i--) {
            myArray[i + 1] = myArray[i];
        }
        myArray[index] = item;
        return item;

    }

    public Integer prepend(int item) {
        return insert(0, item);
    }

    public Integer pop() {
        if (size() > 0) {
            pointer_last -= 1;
            return myArray[pointer_last + 1];
        }
        if (pointer_last <= CAPACITY / 4 && CAPACITY >=16) {
            resize(CAPACITY / 2);
        }
        return null;
    }

    public Integer delete(int index) {
        

        int temp = myArray[index];
        for (int i = index + 1; i <= pointer_last; i++) {
            myArray[i - 1] = myArray[i];
        }
        if (pointer_last <= CAPACITY / 4 && CAPACITY >=16) {
            resize(CAPACITY / 2);
        }
        return temp;

    }

    public void remove(int item) {
        for (int i = 0; i <= pointer_last; i++) {
            if (myArray[i] == item) {
                delete(i);
            }
        }
    }

    public int find(int item) {
        for (int i = 0; i <= pointer_last; i++) {
            if (myArray[i] == item) {
                return i;
            }

        }
        return -1;
    }

    private void resize(final int new_capacity) {
        CAPACITY = new_capacity;
        int[] new_arr = new int[new_capacity];
        for (int i = 0; i <= pointer_last; i++) {
            new_arr[i] = myArray[i];
        }
        myArray = new_arr;
    }

}
