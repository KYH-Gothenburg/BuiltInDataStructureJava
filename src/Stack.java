import java.util.ArrayList;

public class Stack {
    private ArrayList<Integer> internalStack;

    public Stack() {
        internalStack = new ArrayList<>();
    }

    public void push(int data) {
        internalStack.add(0, data);
    }

    public int pop() {
        return internalStack.remove(0);
    }

    public int length() {
        return internalStack.size();
    }
}
