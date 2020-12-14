package bai_9_Generic_Queue_Stack.bai_tap;

public class TestRingLink    public static void main(String[] args) {
    CircleLinkedListQueue queue = new CircleLinkedListQueue();

    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.enqueue(4);

    queue.displayQueue();

    var front = queue.dequeue();
    queue.displayQueue();
    System.out.println(front);

    front = queue.dequeue();
    queue.displayQueue();
    System.out.println(front);
} {
}
