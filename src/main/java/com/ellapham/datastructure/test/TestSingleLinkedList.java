/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ellapham.datastructure.test;

import com.ellapham.datastructure.SingleLinkedList;

/**
 *
 * @author Trang
 */
public class TestSingleLinkedList {

    public static void main(String[] args) {

        SingleLinkedList aList = new SingleLinkedList();
//        //  Test for push_front va pop_front
        aList.push_front(22);
        aList.push_front(33);
        aList.push_front(44);
        aList.push_front(55);
        aList.push_front(66);
        aList.value_at(2);
        
//        
//        aList.pop_front();
//        aList.pop_front();
//       aList.pop_front();
//        aList.pop_front(); aList.pop_front();

      // Test for value_at
    }

}
