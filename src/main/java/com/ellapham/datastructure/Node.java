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
public class Node {

    public int item;
   
    public Node next;
    

    public Node(int i, Node n) {
        item = i;
        next = n;
    }
 
    public Node(int i){
        item = i;
        next = null;
    }
}
