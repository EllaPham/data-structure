/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ellapham.datastructure;

import java.util.ArrayList;

/**
 *
 * @author Trang
 */
public class BinarySearchTree {

    public TreeNode root = null;
    public TreeNode currentNode = null;
    public int h = 0;

    //insert value into tree
    public TreeNode insert(int value) {
        TreeNode n = new TreeNode(value);
        TreeNode X;
        TreeNode parent = null;
        if (root == null) {
            root = n;
            return root;
        } else {
            X = root;
            while (X != null) {
                if (value < X.value) {
                    parent = X;
                    X = X.left;

                } else {
                    parent = X;
                    X = X.right;

                }
            }
            if (value < parent.value) {
                X = n;
                parent.left = n;
            } else {
                X = n;
                parent.right = n;
            }

            return n;
        }

    }

    // get count of values stored
    public Integer get_node_count() {
        return null;
    }

    // prints the values in the tree, from min to max
    public void print_values(TreeNode node) {
        if (node != null) {
            // print everything that's earlier than this node
            print_values(node.left);

            // print this node's value
            
                System.out.println(node.value);
           

            // print everything that's afterthan this node
            print_values(node.right);
        }
        else{
            System.out.println("Binary search tree is empty!");
        }

    }

    public void delete(TreeNode aNode) {
        while (aNode != null) {
            if (aNode.left != null && aNode.right != null) {
                aNode = aNode.left;
                delete(aNode.left);
                delete(aNode.right);

            } else {
                aNode = null;
                root = aNode;
            }
        }

    }

    public Boolean is_in_tree(int value) {
        return false;
    }

    public Integer get_height(TreeNode aNode) {
        if (aNode == null) {
            
            return -1;
        }

        int lefth = get_height(aNode.left);
        int righth = get_height(aNode.right);

        if (lefth > righth) {
            return lefth + 1;
        } else {
            return righth + 1;
        }
    }

    public Integer get_min() {
        return null;
    }

    public Integer get_max() {
        return null;
    }

    public Boolean is_binary_search_tree() {
        return false;
    }

    public Integer delete_value(int value) {
        return null;
    }

    //returns next-highest value in tree after given value, -1 if none
    public Integer get_successor(int value) {
        return null;
    }
}
