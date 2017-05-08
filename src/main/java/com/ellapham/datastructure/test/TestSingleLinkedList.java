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
//                 aList.push_front(11);

//        aList.pop_front();
//        aList.pop_front();
//        aList.pop_front();
//        aList.pop_front();
//        aList.pop_front();

//      // Test for value_at
        
//        aList.value_at(2);
//        aList.value_at(0);
//        aList.value_at(-1);
//        aList.value_at(4);
//        aList.value_at(5);
        
        //Test for push_back()
//        aList.push_back(7);
//        aList.push_back(8);
//        aList.push_back(9);
        
        //Test for pop_back()
//        aList.pop_back();
//        aList.pop_back();
//        aList.pop_back();
//        aList.pop_back();
//        aList.pop_back();
        
        //Test for front(): lay gia tri cua phan tu dau linked list
//        aList.front();
//         aList.back();
        
        //Test for insert(index,value) 
//       aList.insert(0, 100);
        //aList.insert(0, 99);
        //aList.insert(7, 65);
//        aList.insert(0, 11);
//        aList.insert(0, 3);
//        aList.insert(1, 3);
        
        //Test for xoa 1 phan tu tai vi tri index
//        aList.erase(1);
      
      //Lay gia tri cua phan tu index
        aList.value_n_from_end(0);
       
       
         
        
    }

}
