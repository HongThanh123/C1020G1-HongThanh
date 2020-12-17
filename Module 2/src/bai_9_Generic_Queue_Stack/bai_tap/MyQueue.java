package bai_9_Generic_Queue_Stack.bai_tap;

public class MyQueue {
    private int capacity;
    private int queueArr[];
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueue(int capacity) {
        this.capacity = capacity;
        queueArr = new int[this.capacity];
    }
//    Cài đặt phương thức isQueueFull ()
    public boolean isQueueFull(){
    boolean status = false;
    if (currentSize == capacity){
        status = true;
    }
    return status;
    }
//    Cài đặt phương thức isQueueEmpty()
    public boolean isQueueEmpty(){
    boolean status = false;
    if (currentSize == 0){
        status = true;
    }
    return status;
    }
//    Cài đặt phương thức enqueue ()
    public void enqueue(int item) {
    if (isQueueFull()) {
        System.out.println("Overflow ! Unable to add element: " + item);
    } else {
        tail++;
        if (tail == capacity - 1) {
            tail = 0;
        }
        queueArr[tail] = item;
        currentSize++;
        System.out.println("Element " + item + " is pushed to Queue !");
    }
    }
//    Cài đặt phương thức dequeue ()
    public void dequeue() {
    if (isQueueEmpty()) {
        System.out.println("Underflow ! Unable to remove element from Queue");
    } else {
        head++;
        if (head == capacity - 1) {
            System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
            head = 0;
        } else {
            System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
        }
        currentSize--;
    }
    }


}
