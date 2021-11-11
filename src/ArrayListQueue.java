import java.util.ArrayList;

public class ArrayListQueue {
    private ArrayList<Integer> internalQueue;

    public ArrayListQueue() {
        internalQueue = new ArrayList<>();
    }

    public void enqueue(int data) {
        internalQueue.add(data);
    }

    public int dequeue() {
        if(empty()) {
            throw new IndexOutOfBoundsException("Dequeue on empty queue");
        }
        return internalQueue.remove(0);
    }


    public int peek() {
        if(empty()) {
            throw new IndexOutOfBoundsException("Peek on empty queue");
        }
        return internalQueue.get(0);
    }


    public boolean empty() {
        return length() == 0;
    }


    public int length() {
        return internalQueue.size();
    }

}
