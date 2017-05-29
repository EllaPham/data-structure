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
public class QuickSort {

    public int[] myArr;

    public void sort(int[] values) {
        this.myArr = values;
        quickSort(0, myArr.length - 1);
    }

    private void quickSort(int low, int high) {
        int mid = low + (high - low) / 2;
        int pivot = myArr[mid];
        int i = low;
        int j = high;
        while (i <= j) {
            while (myArr[i] < pivot) {
                i++;
            }
            while (myArr[j] > pivot) {
                j--;
            }
//            if (i <= j) {
                swap(i, j);
                i++;
                j--;
//            }
               


            if (i < high) {
                quickSort(i, high);
            }
            if (j > low) {
                quickSort(low, j);
            }
        }
    }

    private void swap(int i, int j) {
        int temp;
        temp = myArr[i];
        myArr[i] = myArr[j];
        myArr[j] = temp;
    }
}
