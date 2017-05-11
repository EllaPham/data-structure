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
public class HashTable {

    public int size;
    public int[] key = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public int[] arrValue;

    public HashTable(int size) {
        this.size = size;
        this.arrValue = new int[size];
    }

//    }
    //add elemsizeent to hash table, our hash table is an array
    // size = 7, insert(5,12) (ok); insert(5,3)-not ok
    public int[] insert(int value) {
        //initArrValue();
        int module = value % size;

        for (int i = 0; i < key.length; i++) {

            if (module == key[i]) {

                arrValue[i] = value;

            }
        }
        System.out.println(this.toString());
        return arrValue;
    }

    //Hash function
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < arrValue.length; j++) {

            sb.append(arrValue[j]).append("   ");
        }
        return sb.toString();
    }

}
