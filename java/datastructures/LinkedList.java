public class LinkedList {
    public static void main(String args[]) {
        LinkedListImpl sll = new LinkedListImpl();
        System.out.println(sll.isEmtpy());
        sll.addFirst('c');
        System.out.println(sll.isEmtpy());
        System.out.println(sll.getLast());
        sll.addFirst('d');
        System.out.println(sll.getFirst());
    }
}

class LinkedListImpl {
    
    private Node first;
    
    public LinkedListImpl(){
        // explicitly set to null (for clarity)
        first = null;
    }
    
    public boolean isEmtpy(){
        return (first == null);
    }
    
    // Adding values
    public void addFirst(char data){
        Node node = new Node(data);
        node.setNext(first); // old first
        first = node;
    }
    
    public void add(char data){
        // call addFirst() if first element
        if(isEmtpy())
            addFirst(data);
        else {
            Node current = first;
            // travel to the last node
            while(current.getNext() != null)
                current = current.getNext();
            current.setNext(new Node(data));
        }
    }
    
    // public void addAt(char data, int idx){
        
    // }
    
    // Removing values
    public Node deleteFirst(){
        // verify that the list if not empty
        Node tmp = first;
        // disconnect the link (GC will destroy it latter)
        first.setNext(first);
         // retur deleted node (this step is optional)
        return tmp;
    }
    
    // public Node detele(){
        
    // }
    
    // public Node deleteAt(){
        
    // }
    
    // Getting values
    public char getFirst(){
        // we could raise an exception, or return null char
        // when the getFirst() is called on an empty LL
        return first == null ? '\0' : first.getData();
    }
    
    public char getLast(){
        Node current = first;
        while(current.getNext() != null)
            current = current.getNext();
        return current.getData();
    }
    
}

class Node {
    // data could be of type Person, InventoryItem
    private char data;
    // null on creation
    private Node next;
    
    public Node(char data){
        this.data = data;
    }
    
    public char getData(){
        return this.data;
    }
    
    public void setData(char c){
        this.data = c;
    }
    
    public Node getNext(){
        return this.next;
    }
    
    public void setNext(Node next){
        this.next = next;
    }
    
}
