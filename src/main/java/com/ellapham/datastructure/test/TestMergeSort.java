/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ellapham.datastructure.test;

import com.ellapham.datastructure.MergeSort;

/**
 *
 * @author Trang
 */
public class TestMergeSort {

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        MergeSort aSort = new MergeSort();
        System.out.println("Given Array: ");
        for(int i =0;i<arr.length;i++){
            System.out.print(" " + arr[i]);
           
        }
         System.out.println("\n");
        aSort.sort(arr);
//        System.out.println("after merge & sort");
//       int[] A =aSort.sort(arr);
//        for(int i=0;i<aSort.myArr.length;i++){
//            System.out.print("  "+A[i]);
//        }
      
        }
    }


