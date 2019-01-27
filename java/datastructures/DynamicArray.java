public class DynamicArray {
    public static void main(String args[]) {
        DynamicArrayImpl dArr = new DynamicArrayImpl(2);
        dArr.add('a');
        dArr.add('b');
        System.out.print(dArr.getAt(1));
        dArr.add('d');
        dArr.add('e');
        System.out.print(dArr.getAt(3));
    }
}

class DynamicArrayImpl {
    
    private int initialSize;
    private int currentIdx;
    private char[] array;
    
    DynamicArray(int initialSize){
        this.initialSize = initialSize;
        array = new char[initialSize];
    }

    public void add(char c){
        if(currentIdx >= array.length){
            // create a new array
            char[] tmpArray = new char[array.length * 2];
            
            // copy the old array and add new array
            for(int i = 0; i < array.length; i++)
                tmpArray[i] = array[i];

            array = tmpArray;
            tmpArray = null;
        }
        
        // add an element
        array[currentIdx++] = c;
    }
    
    // public void addAt(int idx, char c){}
    
    public void remove(){
        array[currentIdx] = '\0';
    }
    
    // public void removeAt(int idx){}
    
    public char getAt(int idx){
        return array[idx];
    }
    
    public int length(){
        return currentIdx;
    }
}
