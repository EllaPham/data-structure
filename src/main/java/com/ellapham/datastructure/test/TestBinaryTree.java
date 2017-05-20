/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ellapham.datastructure.test;

import com.ellapham.datastructure.BinarySearchTree;
import com.ellapham.datastructure.TreeNode;

/**
 *
 * @author Trang
 */
public class TestBinaryTree {

    public static void main(String[] args) {
        BinarySearchTree aBST = new BinarySearchTree();
        TreeNode n;
        aBST.insert(5);
        aBST.insert(10);
        aBST.insert(4);

        aBST.insert(3);
        aBST.insert(6);
        aBST.insert(7);

        aBST.insert(2);
        aBST.insert(8);
        aBST.insert(9);

        aBST.printBST(aBST.root,0);
        aBST.h = aBST.get_height(aBST.root);
        System.out.println("Before Balance");
        aBST.balanceBST();
        System.out.println("After Balance");
        aBST.printBST(aBST.root,0);
        System.out.println("DONE");
    
    }

}
