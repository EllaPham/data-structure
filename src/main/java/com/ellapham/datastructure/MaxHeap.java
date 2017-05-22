/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ellapham.datastructure;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Trang
 */
public class MaxHeap {

    public heapNode heapRoot;
    public int h;

    Queue<heapNode> queueData = new LinkedList<>();

    public void getHeapArray() {
        heapNode X;
        Queue<heapNode> queue = new LinkedList<>();
        X = heapRoot;

        //Tim vị trí trống đầu tiên và insert value
        while (X != null) {

            if (X.left != null) {
                queueData.add(X.left);
                queue.add(X.left);
            }
            if (X.right != null) {
                queueData.add(X.right);
                queue.add(X.right);
            }
            X = queue.poll();
        }

    }

    public void insert(int value) {
        heapNode n = new heapNode(value);
        if (heapRoot == null) {
            heapRoot = n;

        } else {
            builHeap(n);
            sift_up(n);
            System.out.println("Print heap after sift-up: ");
            printBST(heapRoot, 0);
        }

    }

    private void builHeap(heapNode n) {
        this.getHeapArray();
        queueData.add(n);

        heapNode X;
        X = heapRoot;
        Queue<heapNode> qTemp = new LinkedList<>();
        while (!queueData.isEmpty()) {

            X.left = queueData.poll();
            X.left.parent = X;

            if (!queueData.isEmpty()) {

                X.right = queueData.poll();
                X.right.parent = X;
            } else {

                X.right = null;
            }

            qTemp.add(X.left);
            qTemp.add(X.right);
            X = qTemp.poll();

        }
    }

    private void sift_up(heapNode node1) {

        int temp;
        heapNode X;

        X = node1;
        while (X.parent != null) {
            if (X.value > X.parent.value) {
                temp = X.value;
                X.value = X.parent.value;
                X.parent.value = temp;
                X = X.parent;
            } else {
                break;
            }

        }
//        if(node1.value>heapRoot.value){
//            temp.value= node1.value;
//            node1.value=heapRoot.value;
//            heapRoot.value = temp.value;
//        }

    }

    public void printBST(heapNode node, int heigh) {

        if (node != null) {
            // print this node's value
            String margin = "";
            for (int i = 0; i < heigh; i++) {
                margin = margin + "--";
            }

            System.out.println(margin + node.value);
            // print everything that's earlier than this node
            printBST(node.left, heigh + 1);
            // print everything that's afterthan this node
            printBST(node.right, heigh + 1);

        }

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
}
