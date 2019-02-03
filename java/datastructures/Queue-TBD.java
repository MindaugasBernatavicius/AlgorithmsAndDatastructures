public class Queue {
    public static void main(String args[]) {
        QueueImpl q = new QueueImpl();
        q.enqueue('a');
        q.enqueue('b');
        q.enqueue('c');
        q.enqueue('d');
        q.enqueue('e');
        // q.print();
        
        while(!q.isEmpty())
            System.out.print(q.dequeue());
           
        // TODO :: fix a bug, where the tailIdx
        // does not get restored when we reach the 
        // end of the queue
        q.enqueue('c');
        System.out.println(q.dequeue());
    }
}

class QueueImpl {
    
    char[] queue;
    int headIdx;
    int tailIdx;
    
    public QueueImpl(){
        queue = new char[5];
        tailIdx = headIdx = queue.length - 1;
    }
    
    public void enqueue(char c){
        // add resizing logic if you want
        queue[headIdx--] = c;
    }
    
    public char dequeue(){
        return queue[tailIdx--];
    }
    
    public char tail(){
        return queue[tailIdx];
    }
    
    public char head(){
        return queue[headIdx];
    }
    
    public boolean isEmpty(){
        return (tailIdx == headIdx);
    }
    
    public void print(){
        for(int i = 0; i < queue.length; i++)
            System.out.print(queue[i]);
        System.out.println();
    }
}
