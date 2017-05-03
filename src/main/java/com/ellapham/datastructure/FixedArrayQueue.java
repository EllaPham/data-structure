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
public class FixedArrayQueue {

    public int front;
    public int back;
    public int MAXSIZE;
    public int q_length = 0;
    public int[] q;

    public FixedArrayQueue(int maxsize) {
        this.front = 0;
        this.back = 0;
        this.MAXSIZE = maxsize;
        this.q = new int[maxsize];
        for (int i = 0; i < MAXSIZE; i++) {
            q[i] = 0;
        }
    }

    @Override
//    ´ - - 1 2 - -   - - 1 2 3 -   
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < MAXSIZE; i++) {
            if (q[i] != 0) {
                sb.append(q[i]).append("  ");
            } else {
                sb.append("-  ");
            }
        }

        sb.append("  *** ").append(front).append("  ").append(back);
        return sb.toString();
    }

    public Integer enqueue(int value) {
        if ((back == front - 1) || (front == 0 && back == MAXSIZE - 1)) {
            System.out.println(this.toString() + "  FULL");
            return null;
        } else {
            q[back] = value;
            System.out.println(this.toString());
            if (back < MAXSIZE - 1) {
                back += 1;
            } else {
                back = 0;
            }
            return value;
        }

    }

    public Integer dequeue() {
        if (front != back) {
            int value = q[front];
            q[front] = 0;
            if (front < MAXSIZE - 1) {
                front += 1;
            } else {
                front = 0;
            }
            System.out.println(this.toString() + "  --> " + value);
            return value;
        } else {
            System.out.println(this.toString() + "  EMPTY");
            return null;
        }

    }
    // Tra ve gia tri dau tien cua mang

    public Integer getFrontValue(int[] queue) {
        return queue[front];
    }

    public Integer queueLength(int[] qArr) {
        while (qArr != null) {
            q_length += 1;
        }
        return q_length;
    }

    public boolean isFull() {
        return ((back == front - 1) || (front == 0 && back == MAXSIZE - 1)) ;
    }

    public boolean isEmpty() {
        return (back == front);
    }
}
