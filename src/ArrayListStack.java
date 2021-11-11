import java.util.ArrayList;

public class ArrayListStack {
    private ArrayList<Integer> internalStack;

    public ArrayListStack() {
        internalStack = new ArrayList<>();
    }

    public void push(int data) {
        internalStack.add(0, data);
    }

    public int pop() {
        if(empty()) {
            throw new IndexOutOfBoundsException("Pop on empty stack");
        }
        return internalStack.remove(0);
    }

    public int peek() {
        if(empty()) {
            throw new IndexOutOfBoundsException("Peek on empty stack");
        }
        return internalStack.get(0);
    }

    public boolean empty() {
        return length() == 0;
    }

    public int length() {
        return internalStack.size();
    }
}
