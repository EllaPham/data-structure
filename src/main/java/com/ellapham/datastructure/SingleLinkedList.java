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
public class SingleLinkedList {

    private Node head;
    private int size;

//Khoi tao 1 Single linked list
    public SingleLinkedList() {
        head = null;
        size = 0;

    }

    //tinh kich thuoc size cua linked list
    public Integer size() {
        return size;
    }

    //Kiem tra  Linked list empty hay khong
    public boolean empty() {
        return head == null;
    }

    // tra ve gia tri cua node o vi tri index
    public Integer value_at(int index) {
        Node X = head;
        for (int i = 1; i <= index; i++) {
            if (X.next != null) {
                X = X.next;
            } else {
                return null;
            }
        }
        System.out.println(this.toString());
        return X.item;
    }

    //Insert 1 phan tu vao dau linked list -  test done
    public Node push_front(int value) {

        Node N = new Node(value, head);
        head = N;
        size += 1;
        System.out.println(this.toString());
        return N;
    }

    //Xoa 1 phan tu o dau linked list- test done
    public Integer pop_front() {

       
            
            if(head!=null){
                int value = head.item;
                 head.item = 0;  
                 head = head.next;
            size = size - 1;
            
            System.out.println(this.toString());
            
             return value;
            }
            else{
                System.out.println("ERROR: Linked List is empty!");
                return null;
            }
           
            
           
            
           
       
    }

    //Insert 1 phan tu vao cuoi linked list - 2
    public Node push_back(int value) {
        Node new_node = new Node(value);
        Node X = head;
        if (head == null) {
            head = new_node;
            return new_node;
        }

        while (X.next != null) {
            X = X.next;
        }
        X.next = new_node;
        return new_node;
    }

    //Xoa phan tu cuoi cua 1 linked list va tra ve gia tri cua phan tu bi xoa
    public Integer pop_back() {
        Node X = head;
        if (head != null) {
            while (X.next != null) {
                X = X.next;
            }
            return X.item;
        }
        return null;
    }

    // Tra ve gia tri cua phan tu dau tien cua linked list
    public Integer front() {
        if (head != null) {
            return head.item;
        }
        return null;
    }

    //Lay value cua phan tu cuoi cua linked list
    public Integer back() {
        Node X = head;
        if (head != null) {
            while (X.next != null) {
                X = X.next;
            }
            return X.item;
        }
        return null;
    }

    // them 1 node moi, co gia tri la value, vao vi tri index cua linked list
    public Integer insert(int index, int value) {
        Node X = head;

        if (head != null) {
            for (int i = 0; i < index; i++) {
                X = X.next;
            }
            Node N = new Node(value, X);
            X = N;
            return value;
        }

        return null;

    }

    //Xoa mot phan tu o vi tri index
    public Integer erase(int index) {
        Node X = head;
        Node temp = X;
        if (head != null) {
            for (int i = 1; i < index; i++) {
                temp = X;
                X = X.next;

            }
            temp.next = X.next;
            return temp.item;
        }
        return null;
    }

    // tra ve value cua phan tu thu n, tinh tu cuoi cua linked list
    public Integer value_n_from_end(int index) {
        Node X = head;
        int count = 0;
        if (head != null) {
            while (X.next != null) {
                X = X.next;
                count += 1;
            }
            if (index <= count) {
                for (int i = index; i >= 1; i--) {

                    X.next = X;

                }
                X = X.next;
                return X.item;
            }
            return null;
        }

        return null;
    }

    // dao nguoc linked list
    public boolean reverse() {

        if (head != null && head.next != null) {
            Node X = head;
            Node back = null;
            Node front = X.next; //Front = N2
            while (front.next != null) {
                X.next = back;
                back = X;
                X = front;
                front = front.next;

            }
            head = front;
            front.next = X;

            return true;
        }
        return false;
    }

    //Tim va xoa phan tu co gia tri = value. phan tu dau tien tim thay
    public boolean remove_value(int value) {
        Node X = head;
        Node tmp;
        while (X.next != null) {
            tmp = X;
            X = X.next;
            if (X.item == value) {
                tmp.next = X.next;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node X = head;
       
            while (X != null) {
                Node tmp = X;
                X = X.next;
                if (tmp.
                        item != 0) {
                    sb.append("(").append(tmp.item).append(",").append(tmp.next).append(")");
                } else {
                    sb.append("----");
                }
                
            }
                        
            if(head!=null){
        sb.append("  *** ").append(size).append("  ").append(head.item).append("  ").append(head.next);
            }
        else {
               sb.append("  *** ").append(size).append("  ").append("head: NULL");
                }
        return sb.toString();

    }

}
