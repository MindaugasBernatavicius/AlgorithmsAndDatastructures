public class Stack {
    public static void main(String args[]) {
        CharStack s = new CharStack(2);
        System.out.println(s.empty());
        s.push('a');
        s.push('b');
        System.out.println(s.empty());
        System.out.println(s.size());
        System.out.println(s.pop());
        s.push('c');
        System.out.println(s.pop());
    }
}

class CharStack {

    private int topIdx;
    private char[] stack;
    
    Stack(int maxSize){
        topIdx = 0;
        stack = new char[maxSize];
    }
    
    // API
    public void push(char c){
        stack[topIdx++] = c;
    }
    
    public char pop(){
        return stack[--topIdx];
    }
    
    public char peek(){
        return stack[topIdx];
    }
    
    public int size(){
        return stack.length;
    }
    
    public boolean empty(){
        return (topIdx == 0);
    }
}
