public class Queue {
    public static void main(String args[]) {
        QueueImpl q = new QueueImpl();
    }
}

class QueueImpl {
    
    char[] queue;
    int headIdx;
    
    public QueueImpl(){
        queue = new char[5];
    }
    
    public void enqueue(char c){
        // add resizing logic
        queue[headIdx] = c;
        headIdx++;
    }
    public char dequeue(){
        return queue[0];
    }
    
    public char tail(){
        return queue[0];
    }
    
    public char head(){
        return queue[headIdx];
    }
}
