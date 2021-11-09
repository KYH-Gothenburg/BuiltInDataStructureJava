public class ArrayQueue {
    private int[] internalQueue;
    private int top;
    private int end;
    private final int CAPACITY_INCREASE = 10;

    // [10, 20, 30, 40, 50]
    //       e          t

    public ArrayQueue() {
        internalQueue = new int[CAPACITY_INCREASE];
        top = -1;
        end = -1;
    }

    public void enqueue(int data) {

    }

    public int dequeue() {

    }

    public int length() {
        return top - end + 1;
    }
}
