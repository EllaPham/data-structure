/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ellapham.datastructure;

import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author Trang
 */

public class TestArrayQueue {
    
    @Test 
    
    public void insert1(){
        FixedArrayQueue FAQ = new FixedArrayQueue(10);
        TestCase.assertEquals(true, FAQ.isEmpty());
        FAQ.enqueue(1);
        TestCase.assertEquals(1,FAQ.q[0]);
        TestCase.assertEquals(false,FAQ.isFull());
        TestCase.assertEquals(false, FAQ.isEmpty());
    }
    
   
    
}
