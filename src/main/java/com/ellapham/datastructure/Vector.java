/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ellapham.datastructure;

/**
 *
 * @author Trang
 */
public class Vector {

    int[] myArray;
    int pointer_last;
    int CAPACITY = 4;
    int size;

    //Khoi tao 1 vector - done test
    public Vector() {
        myArray = new int[CAPACITY];
        pointer_last = -1;
        size = 0;
    }
//Tra ve kich thuoc that cua Vector- so lg phan tu - done test

    public int size() {
        size = pointer_last + 1;
        return size;
    }
//Tra ve CAPACITY cua Vector - maxsize cua Vector - done

    public int capacity() {
        return CAPACITY;
    }
// Kiem tra vector co rong hay khong, tra ve true/false

    public boolean is_empty() {
        return (pointer_last < 0);
    }

    //Tra ve value cua phan tu o vi tri index -done test
    public Integer at(int index) {
        if (index >= 0 && index <= pointer_last) {
            return myArray[index];
        } else {
            return null;
        }
    }
// Insert phan tu vao cuoi - done test

    public Integer push(int item) {
        pointer_last += 1;
        myArray[pointer_last] = item;
        size = size();
        System.out.println(this.toString());

        if (pointer_last >= CAPACITY - 1) {
            resize(CAPACITY * 2);
        }
        return item;

    }

// insert function, insert 1 phan 1 tu vao vi tri index - done 
    public Integer insert(int index, int item) {

        if (pointer_last >= CAPACITY - 1) {
            resize(CAPACITY * 2);
        }
        if (index <= pointer_last + 1) {
            for (int i = pointer_last; i >= index; i--) {
                myArray[i + 1] = myArray[i];
            }

            myArray[index] = item;
            pointer_last += 1;
            size = size();
            System.out.println(this.toString());
            return item;

        } else {
            push(item);
        }
        return null;
    }

// Insert phan tu vao dau vector - done test
    public Integer prepend(int item) {
        int value = insert(0, item);

        return value;
    }

//  Xoa phan tu o cuoi vector - test done 
    public Integer pop() {

        if (size != 0) {
            int value = myArray[pointer_last];
            myArray[pointer_last] = 0;
            pointer_last -= 1;
            size = size();
            if (pointer_last < CAPACITY / 2 && CAPACITY >= 4) {
                resize(CAPACITY / 2);
            }

            System.out.println(this.toString());

            return value;

        } else {
            System.out.println(this.toString() + "  Can not delele!Vector is empty");
            return null;

        }

    }

//Xoa phan tu o vi tri index
    public Integer delete(int index) {

        if(index<=pointer_last && index>=0){
             int temp = myArray[index];
        for (int i = index+1; i <= pointer_last; i++) {
            myArray[i - 1] = myArray[i];

        }
        myArray[pointer_last] = 0;
        pointer_last-=1;
        size = size();
        if (pointer_last < CAPACITY / 2 && CAPACITY >= 4) {
            resize(CAPACITY / 2);
        }
        System.out.println(this.toString());
        return temp;
        }
        else{
            // index = -1, giu nguyen vector, ko co phan tu nao bi xoa
             System.out.println(this.toString()+ "  -There is no item deleted!");
              return null;
        }
        
      

    }
// Xoa phan tu dau tien co gia tri = value

    public void remove(int item) {
        for (int i = 0; i <= pointer_last; i++) {
            if (myArray[i] == item) {
                delete(i);
            }
        }
        System.out.println(this.toString());
    }
// Tim phan tu co gia tri = value, tra ve vi tri dau cua phan tu dau tien tim dc

    public int find(int item) {
        for (int i = 0; i <= pointer_last; i++) {
            if (myArray[i] == item) {
                return i;
            }

        }
        return -1;
    }
// thay doi CAPACITY

    private void resize(final int new_capacity) {
        CAPACITY = new_capacity;
        int[] new_arr = new int[new_capacity];
        for (int i = 0; i <= pointer_last; i++) {
            new_arr[i] = myArray[i];
        }
        myArray = new_arr;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] != 0) {
                sb.append(myArray[i]).append("  ");
            } else {
                sb.append("-  ");
            }
        }
        sb.append("  *** ").append(pointer_last).append("  ").append(size).append("  ").append(CAPACITY);

        return sb.toString();

    }

}
