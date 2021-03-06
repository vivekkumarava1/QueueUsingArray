package implementation;

import interface1.QueueADT;

import javax.naming.PartialResultException;

public class MyQueue<E> implements QueueADT<E> {
    private int front;
    private int rear;
    private E[] arr;
    private int size;
    public MyQueue(E[] arr){
        this.arr = arr;
        size = 0;
        front = 0;
        rear = 0;

    }

    @Override
    public void enqueue(E data) {
        if (size != arr.length){
            if (rear == arr.length ){
                rear =  0;
            }
            arr[rear] = data;

            size++;
            rear++;
        }
        else{
            System.out.println("Queue is Overflow");
        }


    }

    @Override
    public E dequeue() {
        E response = null;
        if (size!= arr.length){
            if(front == arr.length){
                front = 0;
            }
            response = arr[front];
            front++;
            size++;
        }
        else{
            System.out.println("QueueUnderflow");
        }
        return response;
    }

    @Override
    public E peek() {
        E response = null;
        if (size!= arr.length){
            if(front == arr.length){
                front = 0;
            }
            response = arr[front];
            //front++;
            //size++;
        }
        else{
            System.out.println("Queue is Empty ");
        }
        return response;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void traverse() {
        System.out.print("front -->");
        if (!isEmpty()){
            for (int i = 0; i <rear ; i++) {
                System.out.print(arr[i]+ "-->");

            }
        }
        System.out.println("rear");
    }
}
