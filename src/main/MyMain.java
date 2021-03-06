package main;

import implementation.MyQueue;

public class MyMain {
    public static void main(String[] args) {
        Integer[] integers = new Integer[5];
        MyQueue<Integer> myQueue = new MyQueue<>(integers);
        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);
        myQueue.traverse();
        myQueue.enqueue(40);
        myQueue.enqueue(50);
        myQueue.enqueue(60);
        myQueue.traverse();

    }
}
