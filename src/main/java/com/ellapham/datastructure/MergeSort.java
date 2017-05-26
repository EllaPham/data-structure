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
public class MergeSort {

    public int[] tmpArr;
    public int[] myArr;
    public int numbers;
   
  

    public void sort(int[] values) {
        
        this.myArr = values;
       
        numbers = values.length;
        this.tmpArr=new int[numbers];
        MergeSort(0, numbers - 1);
        System.out.println("After sorted");
         for (int i = 0; i <myArr.length; i++) {
             System.out.println(" " + myArr[i]);
        }
    }

    public void MergeSort(int lo, int hi) {
        
        if (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            MergeSort(lo, mid);
            MergeSort(mid + 1, hi);
            Merge(lo, mid, hi);
        }

    }

    public void Merge(int low, int mid, int high) {
        //load phan tu vao de merge
        for (int i = low; i <= high; i++) {
            tmpArr[i] = myArr[i];
        }
        int i=low;
        int j=mid+1;
        int k=low;
        while(i<=mid&&j<=high){
            if(tmpArr[i]<=tmpArr[j]){
                myArr[k]=tmpArr[i];
                i++;
            }else{
                myArr[k] = tmpArr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            myArr[k]=tmpArr[i];
            k++;
            i++;
        }
    }
}
