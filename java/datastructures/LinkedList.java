public class LinkedList {
    public static void main(String args[]) {
        LinkedListImpl sll = new LinkedListImpl();
        sll.addFirst('a');
        while(!sll.isEmtpy()){
            System.out.println(sll.get(0));
            sll.delete(0);   
        }
        
        sll.add('a');
        while(!sll.isEmtpy()){
            System.out.println(sll.get(0));
            sll.delete(0);   
        }
        sll.addFirst('c');
        
        sll.print();
        
        while(!sll.isEmtpy()){
            System.out.println(sll.get(0));
            sll.delete(0);   
        }
        
        // print when empty
        sll.print();
    }
}

class LinkedListImpl {
    
    private Node head;
    
    public LinkedListImpl(){
        head = null;
    }
    
    public boolean isEmtpy(){
        return (head == null);
    }
    
    // Adding values
    public void addFirst(char data){
        Node node = new Node(data);
        // old head will be moved
        node.setNext(head);
        // and the new node becomes
        // the head like we expect when
        // adding the first element
        head = node;
    }
    
    public void add(char data){
        // call addFirst() if first element
        if(isEmtpy())
            addFirst(data);
        else {
            Node current = head;
            // travel to the last node
            while(current.getNext() != null)
                current = current.getNext();
            current.setNext(new Node(data));
        }
    }
    
    // public void add(char data, int idx){}
    
    // Removing values
    public Node deleteFirst(){
        Node tmp = head;
        if(!isEmtpy())
            head = head.getNext();
        return tmp;
        // now we can call delete
        // as many times as we want
        // we could also throw an error
    }
    
    public Node delete(int idx){
        if(idx == 0)
            return deleteFirst();
            
        Node current = head;
        for(int i = 0; i != idx - 1; i++){
            if(current.getNext() != null)
                current = current.getNext();
            else
                throw new ArrayIndexOutOfBoundsException(idx);
        }
        current.setNext(current.getNext().getNext());
        return current;
    }
    
    // public Node deleteLast(){}
    
    // Getting values
    public char getFirst(){
        // we could raise an exception, or return null char
        // when the getFirst() is called on an empty LL
        return head == null ? '\0' : head.getData();
    }
    
    public char get(int idx){
        if(idx == 0)
            return getFirst();
        
        Node current = head;
        for(int i = 0; i != idx; i++){
            if(current.getNext() != null)
                current = current.getNext();
            else
                throw new ArrayIndexOutOfBoundsException(idx);
        }
        return current.getData();
    }
    
    public char getLast(){
        Node last = head;
        while(last.getNext() != null)
            last = last.getNext();
        return last.getData();
    }
    
    public void print(){
        if(!isEmtpy()){
            Node current = head;
            while(current != null){
                System.out.println(current.getData());
                current = current.getNext();
            }
        } else {
            getFirst();
        }
    }
}

class Node {
    // could be: Person, InventoryItem
    private char data;
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
