/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ellapham.datastructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.SpringLayout;

/**
 *
 * @author Trang
 */
public class MaxHeap {

    public heapNode heapRoot;
    public int h;
    public int size = 0;

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
            this.getHeapArray();
            queueData.add(n);
            builHeap(queueData);
            sift_up(n);
        }

    }

    public Boolean is_Empty() {
        if (heapRoot == null) {
            return true;
        }
        return false;
    }

    public heapNode getMax() {
        if (heapRoot != null) {
            return heapRoot;
        }
        return null;
    }

    public Integer getSize() {
        heapNode X = null;

        if (heapRoot == null) {
            return size = 0;
        } else {
            X = heapRoot;
            size = 1;
            getHeapArray();
            while (!queueData.isEmpty()) {
                if (X != null) {
                    X = queueData.poll();
                    size += 1;
                }

            }

//            System.out.println("QUEUE DATA = " + queueData);
//            System.out.println("SIZE of queuedata: " + queueData.size());
//            size = queueData.size()+1;
//            System.out.println("SIZE OF HEAP = " + size);
        }
        System.out.println("size of heap= " + size);
        return size;
    }

    public void Sift_down() {

    }

    public heapNode extract_max() {
        ArrayList<Integer> arr = new ArrayList<>();
        getHeapArray();
        heapNode X = null;
        heapNode temp = heapRoot;
        heapRoot = null;
        while (!queueData.isEmpty()) {
            arr.add(queueData.peek().value);
            X = queueData.poll();
        }
        heapify(arr);
        return temp;

    }

    public heapNode remove(int index) {
        Queue<heapNode> tempQueue=new LinkedList<>();
        ArrayList<Integer> myArr=new ArrayList<>();
        getHeapArray();
        heapNode n = null;
        for(int i=0;i<index-1;i++){
            n = queueData.peek();
        }
        System.out.println("value of n: " + n.value);
        
         heapNode X=null;
         myArr.add(heapRoot.value);
       while(!queueData.isEmpty()){
          X=queueData.poll();
           if(n.value!=X.value){
               myArr.add(X.value);
               System.out.println("X.value = " + X.value);
           }
           
       }
        System.out.println("After while, arr = " + myArr);
       heapRoot=null;
        heapify(myArr);
        return n;
    }

    public void heapify(ArrayList<Integer> array) {

        

        for (int i = 0; i < array.size(); i++) {

            insert(array.get(i));
        }

    }

    public ArrayList heap_sort() {
        ArrayList<Integer> sortedArr = new ArrayList<>();

        return null;
    }

    private void builHeap(Queue<heapNode> q) {
        heapNode X;
        X = heapRoot;
        Queue<heapNode> qTemp = new LinkedList<>();
        while (!q.isEmpty()) {

            X.left = q.poll();
            X.left.parent = X;

            if (!q.isEmpty()) {

                X.right = q.poll();
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
