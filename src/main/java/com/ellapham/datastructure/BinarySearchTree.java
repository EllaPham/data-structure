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
public class BinarySearchTree {

    public TreeNode root = null;

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
    private Integer get_node_count(TreeNode aNode) {
        int count = 0;
        if (aNode == null) {

            return 1;
        } else {

            count += get_node_count(aNode.left);
            count += get_node_count(aNode.right);

        }
        return count;
    }

    public Integer getNumberOfNode() {
        return get_node_count(root) - 1;
    }

// prints the values in the tree, from min to max
    public void print_values(TreeNode node) {
        if (node == null) {
            System.out.println("null");
        }
        if (node != null) {
            // print everything that's earlier than this node
            print_values(node.left);

            // print this node's value
            System.out.println(node.value);

            // print everything that's afterthan this node
            print_values(node.right);

        }
    }

    public void delete_all_tree() {
        delete(root);
        root = null;
    }

    private void delete(TreeNode aNode) {
        if (aNode == null) {
            return;
        }
        delete(aNode.left);
        delete(aNode.right);
        aNode.left = null;
        aNode.right = null;
        aNode.value = 0;

    }

    public Boolean is_in_tree(int value) {
        TreeNode X;
        if (root == null) {
            return false;
        } else {
            X = root;
            while (X != null) {
                if (value < X.value) {
                    X = X.left;
                } else if (value > X.value) {
                    X = X.right;
                } else {
                    return true;
                }
            }
        }
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
        TreeNode X;

        X = root;

        while (X.left != null) {

            X = X.left;
        }
        return X.value;
    }

    private TreeNode get_min(TreeNode aNode) {
        TreeNode X;

        X = aNode;

        while (X.left != null) {

            X = X.left;
        }
        return X;
    }

    public Integer get_max() {
        TreeNode X;

        X = root;

        while (X.right != null) {

            X = X.right;
        }
        return X.value;

    }

    public Boolean is_binary_search_tree(TreeNode aNode) {
      
        if (aNode == null) {
            return true;
        }
       
        if ((aNode.left!=null && aNode.value < aNode.left.value) 
                || (aNode.right!= null && aNode.value > aNode.right.value)) {
            return false;
        } else {
            return is_binary_search_tree(aNode.left) && is_binary_search_tree(aNode.right);
            
        }
     
    }

    public Boolean delete_value(int value) {
        TreeNode X = root;
        TreeNode aNode = null;
        TreeNode parentNode = null;
        TreeNode minNode = null;
        System.out.println("start delte");
        while (X != null) {
            if (value < X.value) {
                System.out.println("value < X.value");
                parentNode = X;
                X = X.left;
            } else if (value > X.value) {
                System.out.println("value > X.value");
                parentNode = X;
                X = X.right;
            } else {
                System.out.println("value = X.value");
                aNode = X;
                break;
            }
        }
        System.out.println("finished while, X found");
        if (aNode == null) {
            return false;
        }
        System.out.println("aNode is not null");
        if (aNode.left == null && aNode.right == null) {
            System.out.println("aNode is leaf");
            if (aNode.value < parentNode.value) {
                parentNode.left = null;
            } else {
                parentNode.right = null;
            }

            return true;
        }
        if (aNode.left != null && aNode.right == null) {
            parentNode.left = aNode.left;

            return true;
        }
        if (aNode.right != null && aNode.left == null) {
            parentNode.right = aNode.right;

            return true;

        }
        if (aNode.right != null && aNode.left != null) {

            minNode = get_min(aNode.right);
            if (aNode.value < parentNode.value) {
                parentNode.left = minNode;
            } else {
                parentNode.right = minNode;
            }
            minNode.left = aNode.left;
            if (aNode.right.value != minNode.value) {
                minNode.right = aNode.right;

                return true;
            }
        }
        return true;
    }

    //returns next-highest value in tree after given value, -1 if none
    public Integer get_successor(int value) {
        return null;
    }
}
