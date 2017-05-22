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
public class heapNode {

    public int value;
    public heapNode left;
    public heapNode right;
    public heapNode parent;

    public heapNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
        this.parent = null;
    }
}
