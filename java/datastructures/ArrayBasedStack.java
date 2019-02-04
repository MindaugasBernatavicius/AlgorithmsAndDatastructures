public class ArrayBasedStack {
    public static void main(String args[]) {
        String name = "JKL";
        CharStack nameStack = new CharStack(name.length());

        for(int i = 0; i < name.length(); i++){
            nameStack.push(name.charAt(i));
        }

        // Testcase: stack size, should be same as name length
        System.out.println(nameStack.size() == name.length());

        for(int i = 0; i < nameStack.size(); i++){
            System.out.println(nameStack.pop());
        }
    }
}

class CharStack {

    private int topIdx;
    private char[] stack;
    
    CharStack(int maxSize){
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
