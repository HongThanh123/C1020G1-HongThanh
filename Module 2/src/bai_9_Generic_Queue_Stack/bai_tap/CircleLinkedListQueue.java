package bai_9_Generic_Queue_Stack.bai_tap;

import bai_9_Generic_Queue_Stack.thuc_hanh.Node;

public class CircleLinkedListQueue {
    private Node front;
    private Node rear;

    private class Node{
        private int data;
        private Node link;

        public Node(int data) {
            this.data = data;
        }
    }


    public CircleLinkedListQueue() {
    }

    public void enqueue (int element){
        Node node = new Node(element);

        if (isEmpty()){
            front = node;
        }else {
            rear.link = front;
        }
    }

    private boolean isEmpty() {
        return front == null;

    }
}
