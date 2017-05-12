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
public class BinarySearch {

    public int key;
    public int[] myArray;
     public int mid;
    public int low=0;
    public int high;

    public BinarySearch(int key, int[] myArray) {
        this.key = key;
        this.myArray = myArray;             
        this.high = myArray.length;
    }

    public Integer BSearch() {

        while (low <= high) {
            mid = low + (high - low) / 2;
            if( mid>=myArray.length){
                System.out.println("There is no element found!");
                return null;
            }
            else {
                 if (myArray[mid] == key) {
                System.out.println(this.toString());
                
                return mid;
            } 
            if (myArray[mid] < key) {
                low = mid + 1;}
            
            if(myArray[mid] > key){
                high = mid - 1;
            }
            }
           

        }       
        System.out.println("NOT FOUND");
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(key).append(" is found in position: ").append(mid);
        return sb.toString();
    }

}
