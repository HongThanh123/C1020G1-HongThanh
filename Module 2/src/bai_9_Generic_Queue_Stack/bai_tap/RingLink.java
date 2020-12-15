package bai_9_Generic_Queue_Stack.bai_tap;

public class RingLink {
//    public void enqueue(int index) {
//    }
//
//    public void displayQueue() {
//    }
//
//    public int dequeue() {
//        return 0;
//    }
//
//    public class CircleLinkedListQueue {
//        private Node front;
//        private Node rear;
//
//        public CircleLinkedListQueue() {
//        }
//
//        public void enqueue(int item) {
//            Node node = new Node(item);
//
//            if (isEmpty())
//                front = node;
//            else rear.next = node;
//
//            rear = node;
//            rear.next = front;
//
//        }
//
//        public int dequeue() {
//            if (isEmpty())
//                throw new IllegalStateException("Empty queue");
//
//            int removedItem = front.data;
//            if (front == rear)
//                front = rear = null;
//
//            assert front != null;
//            front = front.next;
//            rear.next = front;
//
//            return removedItem;
//        }
//
//        public void displayQueue() {
//            if (isEmpty())
//                return;
//
//            Node current = front;
//            while (current.next != front) {
//                System.out.print(current.data + " ");
//                current = current.next;
//            }
//            System.out.println(current.data);
//        }
//
//        private boolean isEmpty() {
//            return front == null;
//        }
//
//        private class Node {
//            private int data;
//            private Node next;
//
//            public Node(int data) {
//                this.data = data;
//            }
//        }
//    }

    public static class Node {
        int data;
        Node link;
    }
    public static class Queue {
        Node front , rear;
    }
    public static void enQueue (Queue q , int value){
        Node temp = new Node();
        temp.data = value;
        if(q.front == null){
            q.front = temp;
        }else {
            q.rear.link = temp;
        }
        q.rear = temp;
        q.rear.link = q.front;
    }
    public static int deQueue(Queue q) {
        if(q.front == null){
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }

        return 0;
    }
}

