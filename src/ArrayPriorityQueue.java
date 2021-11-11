import java.util.Arrays;

import static java.lang.System.arraycopy;

public class ArrayPriorityQueue extends ArrayQueue{

    @Override
    public void enqueue(int data) {
        super.enqueue(data);
        // Sort the used part of the array
        Arrays.sort(internalQueue, remove, insert+1);
    }

}
