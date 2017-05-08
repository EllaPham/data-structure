/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ellapham.datastructure;

import javax.swing.SpringLayout;

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

    //Kiem tra  Linked list empty hay khong - test done
    public boolean empty() {
        return head == null;
    }

    // tra ve gia tri cua node o vi tri index - test done
    public Integer value_at(int index) {
        Node X = head;
        if ((X != null) && (index < size) && (index >= 0)) {
            for (int i = 0; i < index; i++) {
                X = X.next;
            }
            System.out.println("Value of index " + index + ": (" + X.item + ", " + X.next + ")");
            return X.item;
        } else {

            System.out.println("Can not file node at index " + index);
            return null;
        }
    }

    //Insert 1 phan tu vao dau linked list -  test done
    public Integer push_front(int value) {

        Node N = new Node(value, head);
        head = N;
        size += 1;
        System.out.println(this.toString());
        return N.item;

    }

    //Xoa 1 phan tu o dau linked list- test done
    public Integer pop_front() {

        if (head != null) {
            int value = head.item;
            head.item = 0;
            head = head.next;
            size = size - 1;

            System.out.println(this.toString());

            return value;
        } else {
            System.out.println("ERROR: Linked List is empty!");
            return null;
        }

    }

    //Insert 1 phan tu vao cuoi linked list - test done
    public Integer push_back(int value) {
        Node new_node = new Node(value);
        Node X = head;
        if (head == null) {
            head = new_node;
            size += 1;
            System.out.println(this.toString());
            return new_node.item;
        }

        while (X.next != null) {
            X = X.next;
        }
        X.next = new_node;
        size += 1;
        System.out.println(this.toString());
        return new_node.item;
    }

    //Xoa phan tu cuoi cua 1 linked list va tra ve gia tri cua phan tu bi xoa - test done
    public Integer pop_back() {

        Node X = head;
        Node tmp = null;
        if (head != null) {
            while (X.next != null) {
                tmp = X;
                X = X.next;

            }
            if (tmp != null) {
                tmp.next = null;
            }
            X.item = 0;
            size -= 1;
            if (size == 0) {
                head = null;
            }

            System.out.println(this.toString());
            return X.item;
        } else {

            System.out.println(this.toString());
            return null;
        }

    }

    // Tra ve gia tri cua phan tu dau tien cua linked list - test done
    public Integer front() {
        if (head != null) {
            System.out.println("value of first element: " + head.item);
            return head.item;
        }
        System.out.println("Linked list is empty!");
        return null;
    }

    //Lay value cua phan tu cuoi cua linked list - test done
    public Integer back() {
        Node X = head;
        if (head != null) {
            while (X.next != null) {
                X = X.next;
            }
            System.out.println("value of last element: " + X.item);
            return X.item;
        }
        System.out.println("Linked list is empty!");
        return null;
    }

    // them 1 node moi, co gia tri la value, vao vi tri index cua linked list - test done
    public Integer insert(int index, int value) {
        Node X = head;
        Node tmp = null;
        if (index == 0) {
            return push_front(value);
        }
        if (head != null) {

            if (index >= size) {
                System.out.println("ERROR: invalid index!!!");
                return null;
            }
//            if (index == size) {
//                return push_back(value);
//            }

            if (index > 0 && index < size) {

                for (int i = 0; i < index; i++) {
                    tmp = X;
                    X = X.next;
                }
                Node N = new Node(value, X);

                tmp.next = N;

                N.next = X;
                size += 1;
                System.out.println(this.toString());
                return value;

            }

        }

        System.out.println("ERROR:Invalid index!!!");
        return null;

    }

    //Xoa mot phan tu o vi tri index - test done
    public Integer erase(int index) {
        Node X = head;
        Node temp = X;
        if (head != null) {
            if (index == 0) {
                return pop_front();
            }
            if (index >= size) {
                System.out.println("ERROR: invalid index!");
                return null;
            }
            if (index < size) {
                for (int i = 1; i <= index; i++) {
                    temp = X;
                    X = X.next;

                }

                temp.next = X.next;
                X.item = 0;
                size -= 1;
                System.out.println(this.toString());
                return temp.item;
            }

        }

        System.out.println("ERROR: linked list is empty!");
        return null;

    }

    // tra ve value cua phan tu thu n, tinh tu cuoi cua linked list
    public Integer value_n_from_end(int index) {
        Node X = head;
        int count = 0;
        Node tmp  = null;
        if (head != null) {
            if(index>=size || size <0){
                System.out.println("ERROR: Invalid index!!!");
            }
                    
            if (index < count) {
                for (int i =0;i<index ;i++) {
                     tmp = X;
                   X=X.next;

                }
                
                System.out.println("Value of element index " + index+": " + tmp.item);
                return tmp.item;
            }
            
        }
        System.out.println("ERROR:Linked list is empty! cant not found element index " + index);
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
            if (tmp.item != 0) {
                sb.append("(").append(tmp.item).append(",").append(tmp.next).append(")");
            } else {
                sb.append("----");
            }

        }

        if (head != null) {
            sb.append("  *** ").append(size).append("  ").append(head.item).append("  ").append(head.next).append(" **** ").append("isEmpty:").append(this.empty());

        } else {
            sb.append("  *** ").append(size).append("  ").append("head: NULL").append(" **** ").append("isEmpty:").append(this.empty());
        }

        return sb.toString();

    }

}
