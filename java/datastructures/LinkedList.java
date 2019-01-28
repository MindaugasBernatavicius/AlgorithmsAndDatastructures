public class LinkList {
    public static void main(String args[]) {
        DynamicArray dArr = new DynamicArray(2);
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
    
    public addFirst(char data){
        Node node = new Node(data);
        node.next = first; // old first
        first = node;
    }
    
    public add(char data){
        
    }
    
    public addAt(char data, int idx){
        
    }
    
    public detele(){
        
    }
    
    public deleteAt(){
        
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
}
