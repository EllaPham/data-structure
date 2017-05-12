/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ellapham.datastructure.test;

import com.ellapham.datastructure.BinarySearch;

/**
 *
 * @author Trang
 */
public class TestBinarySearch {
    public static void main(String[] args) {
        int[] arr= {11,12,13,17,18,19};
        BinarySearch aSearch = new BinarySearch(15, arr);
        
        aSearch.BSearch();
    }
}
