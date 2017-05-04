/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ellapham.datastructure.test;

import com.ellapham.datastructure.FixedArrayQueue;

/**
 *
 * @author Trang
 */
public class TestFixedArrayQueue {

    public static void main(String[] args) {
      
        FixedArrayQueue aQueue = new FixedArrayQueue(6);

        System.out.println(aQueue);
        aQueue.enqueue(5);
        aQueue.enqueue(6);
        aQueue.enqueue(7);
        aQueue.enqueue(8);
        aQueue.dequeue();
        aQueue.enqueue(9);
        aQueue.enqueue(1);
        aQueue.enqueue(2);
        aQueue.enqueue(3);
        aQueue.enqueue(4);

        aQueue.dequeue();
        aQueue.dequeue();
        aQueue.dequeue();
        aQueue.dequeue();
        aQueue.dequeue();
        aQueue.dequeue();
        aQueue.enqueue(3);
        aQueue.dequeue();
        aQueue.dequeue();
        aQueue.dequeue();
        aQueue.enqueue(3);
        aQueue.enqueue(3);
        aQueue.dequeue();
        aQueue.dequeue();
        aQueue.dequeue();
        aQueue.enqueue(3);
        aQueue.dequeue();
        aQueue.dequeue();

    }

   
    
}
