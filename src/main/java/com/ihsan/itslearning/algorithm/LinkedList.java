//package com.ihsan.itslearning.algorithm;
//
//public class LinkedList {
//    private final int data;
//    private LinkedList first;
//
//    private LinkedList prev;
//    private LinkedList current;
//    private LinkedList next;
//
//    private LinkedList last;
//
//    private LinkedList(int data) {
//        this.data = data;
//    }
//    public int getData() {
//        return data;
//    }
//
//    public String toString() {
//        return "LinkedList [ current=" + current.getData() + ", next=" + next.getData() + ", last=" + last.getData() + ", first=" + first.getData() + "]";
//    }
//
//
//    static void main() {
//        LinkedList current = new LinkedList(1);
//        current.first = new LinkedList(0);
//        current.prev = new LinkedList(0);
//        current.next = new LinkedList(2);
//        current.last = new LinkedList(3);
//        System.out.println(current);
//    }
//}
