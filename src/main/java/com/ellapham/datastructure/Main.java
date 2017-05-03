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
public class Main {

    public static void main(String[] args) {
        //******test for queue**********
        // testFixedArrayQueue();

        //*********test for Vector        
        //testVector();
        
        //**********test for linked list
        testLinkedList();
    }

    public static void testFixedArrayQueue() {

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

    public static void testVector() {
        Vector aVector = new Vector();
        System.out.println(aVector);
        /*Test scenarios:
        capacity = 4
            Them phan tu vao cuoi, tang kich thuoc khi can
            1- Add 4 Phan tu vao Vector (done)
            2- Add 5 phan tu vao Vector, tang gap doi capacity (done)
           
            Xoa phan tu cuoi, giam capacity khi can 
            3- Xoa 1 phan tu cuoi,cap giu nguyen (done)
            4- Xoa 3 phan tu, cap giam 1 nua (done))
            5- Xoa trong truong hop vector = null (done)
        
        
            7- Vector 3 phan tu, them 1 phan vao vi tri so 2
            8- Vector 3 phan tu, them 2 phan tu vao vi tri so 2
            9- Mang 4 phan tu, tim xoa phan tu co gi tri 3
        
            
            
            
        */
        aVector.push(1);
        aVector.push(2);
        aVector.push(3);
       aVector.prepend(11);
       aVector.prepend(22);
        aVector.prepend(33);
         aVector.prepend(44);
      aVector.delete(4);
      aVector.delete(3);
      aVector.delete(1);
    
       
        //System.out.println("value of positon-2. " + aVector.at(1));
        
        
       
       
     
        
              
    }
    public static void testLinkedList(){
        SList aSList = new SList();
        
    }
    
}
