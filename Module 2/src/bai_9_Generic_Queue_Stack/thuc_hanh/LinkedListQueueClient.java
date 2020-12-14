package bai_9_Generic_Queue_Stack.thuc_hanh;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        System.out.println(queue.size());
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        int size = queue.size();
        for (int index = 0; index<size ; index++){
            System.out.println(queue.dequeue().key);
        }
//        System.out.println("Dequeued item is " + queue.dequeue().key);
    }
}
