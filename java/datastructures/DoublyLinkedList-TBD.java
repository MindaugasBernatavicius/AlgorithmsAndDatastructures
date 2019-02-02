public class DoublyLinkedList {
    public static void main(String args[]) {
        DoublyLinkedListImpl dll = new DoublyLinkedListImpl();
        System.out.println(dll.isEmpty());
        dll.addFirst('c');
        System.out.println(dll.isEmpty());
        dll.addFirst('d');
        dll.addFirst('k');
        
        
        dll.add('e');
        // dll.print();
        dll.printReversed();
    }
}

class DoublyLinkedListImpl {
    
    private Node first;
    
    public DoublyLinkedListImpl(){
        first = null;
    }
    
    public boolean isEmpty(){
        return (first == null);
    }
    
    // Adding values
    public void addFirst(char data){
        Node node = new Node(data);
        if(isEmpty()){
            first = node;
            return;
        }
        node.setNext(first);
        first.setPrev(node);
        first = node;
        return;
    }
    
    public void add(char data){
        if(isEmpty())
            addFirst(data);
        else {
            Node current = first;
            while(current.getNext() != null)
                current = current.getNext();
            Node next = new Node(data);
            current.setNext(next);
            next.setPrev(current);
        }
    }
    
    // public void addAt(char data, int idx){
        
    // }
    
    // // Removing values
    // public Node deleteFirst(){
    //     // verify that the list if not empty
    //     Node tmp = first;
    //     // disconnect the link (GC will destroy it latter)
    //     first.setNext(first);
    //      // retur deleted node (this step is optional)
    //     return tmp;
    // }
    
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
    
    public void print(){
        Node tmp = first;
        while(first != null){
            System.out.print(first.getData());
            first = first.getNext();
        }
        System.out.println();
        first = tmp;
    }
    
    public void printReversed(){
        Node tmp = first;
        if(first != null){
            while(first.getNext() != null){
                first = first.getNext();
            }
            while(first != null){
                System.out.print(first.getData());
                first = first.getPrev();
            }   
        }
        System.out.println();
        first = tmp;
    }
}

class Node {
    private char data;
    private Node next;
    private Node prev;
    
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
    
    public Node getPrev(){
        return this.prev;
    }
    
    public void setPrev(Node prev){
        this.prev = prev;
    }
    
}
