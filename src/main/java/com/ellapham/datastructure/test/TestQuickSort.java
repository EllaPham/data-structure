/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ellapham.datastructure.test;

import com.ellapham.datastructure.QuickSort;

/**
 *
 * @author Trang
 */
public class TestQuickSort {
    
    
    /**
     *
     * @param args
     */
    public static void main(String[] args){
              int[] arr = {7,2,3,4,50,12,13,17,22};
              QuickSort aQS = new QuickSort();
              System.out.println("Given array is: ");
              for(int i=0;i<arr.length;i++){
                  System.out.print("  " + arr[i]);
              }
              aQS.sort(arr);
              System.out.println("Sorted array is: ");
              for(int i=0;i<arr.length;i++){
                  System.out.print("  " + arr[i]);
              }
          }  
            
            
}
