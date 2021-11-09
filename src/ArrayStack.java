import static java.lang.System.arraycopy;

public class ArrayStack {
    private int[] internalStack;
    private int top;
    private final int CAPACITY_INCREASE = 10;


    public ArrayStack() {
        // Create a new internal array of size CAPACITY_INCREASE (10)
        internalStack = new int[CAPACITY_INCREASE];
        // Init top to -1 to indicate that the stack is empty
        top = -1;
    }

    public int pop() {
        if(top >= 0) {
            int value = internalStack[top];
            top--;
            if(top < internalStack.length - CAPACITY_INCREASE) {
                int[] newArr = new int[internalStack.length - CAPACITY_INCREASE];
                arraycopy(internalStack, 0, newArr, 0, newArr.length);
                internalStack = newArr;
            }
            return value;
        }
        throw new IndexOutOfBoundsException("Pop on empty stack");
    }


    public void push(int data) {
        // When pushing, increase top, so it points at the new position in the internal stack
        top++;
        // Check if we are out of space. If top is >= the current length of the internal stack array
        // we will need to create a new array with some additional space
        if(top >= internalStack.length) {
            // Create the new array of the same size as the old one plus CAPACITY_INCREASE (10)
            int[] newArr = new int[internalStack.length + CAPACITY_INCREASE];
            // Copy all the values from the old internal stack to the new array
            arraycopy(internalStack, 0, newArr, 0, internalStack.length);
            // Overwrite the old internal stack with the new array
            internalStack = newArr;
        }
        // Add the new element to the stack
        internalStack[top] = data;
    }

    public int length() {
        // We must return top, not the length of the internal stack as it might have more positions than we
        // have items on the stack. Add 1 as top is used as an index starting at 0.
        return top+1;
    }
}
