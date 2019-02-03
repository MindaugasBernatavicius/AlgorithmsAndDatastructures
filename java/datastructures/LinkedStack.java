import java.util.NoSuchElementException;

public class LinkedStack {
    public static void main(String[] args) {
        LinkedStackImpl stack = new LinkedStackImpl();
    }
}

class LinkedStackImpl {
    private int n;          // size of the stack
    private Node first;     // top of stack

    public LinkedStackImpl() {
        first = null;
        n = 0;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return n;
    }

    public void push(char c) {
        Node oldfirst = first;
        first = new Node();
        first.item = c;
        first.next = oldfirst;
        n++;
    }

    public char pop() {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        char item = first.item;        // save item to return
        first = first.next;            // delete first node
        n--;
        return item;                   // return the saved item
    }

    public char peek() {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        return first.item;
    }
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Item item : this)
            s.append(item + " ");
        return s.toString();
    }
}

class Node {
    char data;
    Node next;
}
