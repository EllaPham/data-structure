/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ellapham.datastructure.test;

import com.ellapham.datastructure.MaxHeap;
import java.util.ArrayList;

/**
 *
 * @author Trang
 */
public class TestMaxHeap {

    public static void main(String[] args) {
        MaxHeap aHeap = new MaxHeap();
        ArrayList<Integer> myArr = new ArrayList<>();
        myArr.add(20);
        myArr.add(2);
        myArr.add(30);
        myArr.add(7);
        myArr.add(8);
        aHeap.insert(10);
        aHeap.insert(9);
        aHeap.insert(11);
        aHeap.insert(12);
        aHeap.insert(15);
        aHeap.heapify(myArr);

        aHeap.printBST(aHeap.heapRoot, 0);
        aHeap.getSize();
        System.out.println("Extract max: " + aHeap.extract_max().value);
       // System.out.println("sorted arr from heap: " + aHeap.heap_sort());
        aHeap.printBST(aHeap.heapRoot, 0);
        System.out.println("heap size after remove max: " + aHeap.getSize());
        System.out.println("Extract max: " + aHeap.extract_max().value);
        aHeap.printBST(aHeap.heapRoot, 0);
        System.out.println("heap size after remove max: " + aHeap.getSize());
        System.out.println("Delete node at index 2: ");
        aHeap.remove(2);
        //System.out.println("Delete value: " + aHeap.remove(2).value);
         aHeap.printBST(aHeap.heapRoot, 0);
        
    }
}
