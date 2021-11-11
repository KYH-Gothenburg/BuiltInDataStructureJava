import static java.lang.System.arraycopy;

public class ArrayQueue {
    protected int[] internalQueue;
    protected int insert;
    protected int remove;
    protected final int CAPACITY_INCREASE = 10;

    // [10, 20, 30, 40, 50, 60, 70, 80]
    //           r      i
    // [20, 30, 40, 50, 0, 0, 0, 0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 ,0, 0]

    public ArrayQueue() {
        internalQueue = new int[CAPACITY_INCREASE];
        insert = -1;
        remove = -1;
    }

    public void enqueue(int data) {
        insert++;
        if(insert == 0) {
            remove = 0;
        }
        if(insert >= internalQueue.length) {
            int[] newArr = new int[internalQueue.length + CAPACITY_INCREASE];
            arraycopy(internalQueue, remove, newArr, 0, insert - remove);
            insert -= remove;
            remove = 0;
            internalQueue = newArr;
        }
        internalQueue[insert] = data;
    }

    public int dequeue() {
        if(remove >= 0 && remove <= insert) {
            int value = internalQueue[remove];
            remove++;
            if(length() <= internalQueue.length - CAPACITY_INCREASE) {
                int[] newArr = new int[internalQueue.length - CAPACITY_INCREASE];
                arraycopy(internalQueue, remove, newArr, 0, length());
                insert -= remove;
                remove = 0;
                internalQueue = newArr;
            }
            return value;
        }

        throw new IndexOutOfBoundsException("Dequeue on empty queue");
    }

    public int length() {
        return insert - remove + 1;
    }
}
