package bai_9_Generic_Queue_Stack.bai_tap;

public class MyStack {
    private int arr[];
    private int size;
    private int index = 0;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    //    Cài đặt phương thức push()
    public void push(int element) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = element;
        index++;
    }
//    Cài đặt phương thức pop()
     public int pop() throws Exception {
         if (isEmpty()) {
           throw new Exception("Stack is null");
         }
         return arr[--index];
      }
//   Cài đặt phương thức isEmpty()
     boolean isEmpty() {
        if (index == 0){
            return true;
        }
        return false;
    }


    //  Cài đặt phương thức isFull()
    private boolean isFull() {
        if (index == size){
            return true;
        }
        return false;
    }

    public int size() {
        return index;
    }
}
