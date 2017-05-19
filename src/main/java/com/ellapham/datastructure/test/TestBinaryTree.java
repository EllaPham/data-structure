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
        aBST.insert(9);

        aBST.print_values(aBST.root);
        aBST.h = aBST.get_height(aBST.root);
        System.out.println("HEIGH of Binary Search  Tree is: " + aBST.get_height(aBST.root));
        //Delete all binary search tree
//        aBST.delete_all_tree();
//        System.out.println("HEIGH of Binary Search  Tree is: " + aBST.get_height(aBST.root));
//        System.out.println("Binary search Tree after delete all: ");
//        aBST.print_values(aBST.root);
        System.out.println("Number of nodes of binary search tree: " + aBST.getNumberOfNode());

        Boolean flag = aBST.is_in_tree(33);
        if (flag) {
            System.out.println(" this value is in BST");
        } else {
            System.out.println("this value is not included in BST");
        }

        System.out.println("MIN value of BST: " + aBST.get_min());
        System.out.println("MAX value of BST: " + aBST.get_max());
        
      System.out.println("Flag after delete a node: " + aBST.delete_value(2));
       

    }

}
