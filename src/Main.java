import java.util.*;

public class Main {

    public static void oldCollectionStructures() {
        // These are the oldest collection classes in Java
        // They lack any kind of common interface and are slow compared with the newer structures

        // Array
        // Fixed size collection
        // Creation and initialization
        String[] arrNames = new String[] {"Alice", "Bob", "Charlie"};
        // Accessing
        System.out.println("*** Array ***");
        System.out.println(arrNames[0]);
        System.out.println(arrNames[1]);
        System.out.println(arrNames[2]);

        // Vector
        // A dynamic collection, it is synchronized
        // Creation
        Vector<String> vecNames = new Vector<>();
        // Insertion of elements
        vecNames.add("Alice");
        vecNames.add("Bob");
        vecNames.add("Charlie");
        // Accessing
        System.out.println("*** Vector ***");
        System.out.println(vecNames.get(0));
        System.out.println(vecNames.get(1));
        System.out.println(vecNames.get(2));

        // Hashtable
        // Implements a dictionary structure, using hashable keys and values
        // Creation
        Hashtable<Integer, String> hashNames = new Hashtable<>();
        // Insertion of elements
        hashNames.put(1, "Alice");
        hashNames.put(2, "Bob");
        hashNames.put(3, "Charlie");
        // Accessing
        System.out.println("*** Hashtable ***");
        System.out.println(hashNames.get(1));
        System.out.println(hashNames.get(2));
        System.out.println(hashNames.get(3));

    }

    public static void collectionsFramework() {
        // ArrayList
        // Dynamic structure, much like the Vector class, but is non-synchronized
        // Creation
        ArrayList<String> arrListNames = new ArrayList<>();
        // Insertion of elements
        arrListNames.add("Alice");
        arrListNames.add("Bob");
        arrListNames.add("Charlie");
        // Accessing
        System.out.println("*** ArrayList ***");
        System.out.println(arrListNames.get(0));
        System.out.println(arrListNames.get(1));
        System.out.println(arrListNames.get(2));

        // Stack
        // Implements five stack related methods, apart from the methods from the List interface
        // These are: push, pop, peek, empty, and search
        // Creation
        //Stack<String> stackNames = new Stack<>();
        // Inserting (if used as a stack)
        //stackNames.push("Alice");
        //stackNames.push("Bob");
        //stackNames.push("Charlie");
        // Accessing (the top element)
        System.out.println("*** Stack ***");
        //System.out.println("Top element: " + stackNames.peek());
        //System.out.println(stackNames.pop());
        //System.out.println(stackNames.pop());
        //System.out.println(stackNames.pop());

        // LinkedList
        // Implements a linked list structure
        // Creating
        LinkedList<String> llNames = new LinkedList<>();
        //Inserting
        llNames.add("Alice");
        llNames.add("Bob");
        llNames.add("Charlie");
        // Accessing
        System.out.println("*** LinkedList ***");
        System.out.println(llNames.get(0));
        System.out.println(llNames.get(1));
        System.out.println(llNames.get(2));


        // TreeMap
        // Implements a tree structure with the keys in ascending order
        // Creation
        TreeMap<Integer, String> tmNames = new TreeMap<>();
        // Inserting
        tmNames.put(11, "Alice");
        tmNames.put(22, "Bob");
        tmNames.put(3, "Charlie");
        //Accessing
        System.out.println("*** TreeMap (ascending)");
        for(var key : tmNames.keySet()) {
            System.out.println(tmNames.get(key));
        }
        System.out.println("*** TreeMap (descending)");
        for(var key : tmNames.descendingKeySet()) {
            System.out.println(tmNames.get(key));
        }

        // PriorityQueue
        // A queue that orders the elements in their natural order, or by using
        // a comparator provided at creation time
        // Creating
        PriorityQueue<String> pqNames = new PriorityQueue<>();
        // Inserting
        pqNames.add("Bob");
        pqNames.add("Charlie");
        pqNames.add("Alice");
        // Accessing
        System.out.println("*** PriorityQueue ***");
        for(var name : pqNames) {
            System.out.println(name);
        }

    }

    public static void main(String[] args) {
        ArrayStack arrStack = new ArrayStack();
        arrStack.push(10);
        arrStack.push(20);
        arrStack.push(30);
        arrStack.push(40);
        arrStack.push(50);
        arrStack.push(60);
        arrStack.push(70);
        arrStack.push(80);
        arrStack.push(90);
        arrStack.push(100);
        arrStack.push(110);

//        Stack myStack = new Stack();
//        myStack.push(10);
//        myStack.push(20);
//        myStack.push(30);
//
//        System.out.println(myStack.pop());
//        System.out.println(myStack.pop());
//        System.out.println(myStack.pop());
//
//        Stack stack = new Stack();
//        for(int i = 1; i < 20; i++) {
//            stack.push(i);
//        }
//
//        int numsOnStack = stack.length();
//        for(int i = 0; i < numsOnStack; i++) {
//            System.out.println(stack.pop());
//        }
    }
}
