public class DynamicArray {
    public static void main(String args[]) {
        DynamicArrayImpl dArr = new DynamicArrayImpl(2);
        // dArr.add('a');
        // dArr.add('b');
        // System.out.print(dArr.getAt(1));
        // dArr.add('d');
        // dArr.add('e');
        // System.out.print(dArr.getAt(3));
        
        dArr.add(0, 'a');
        dArr.add(1, 'b');
        dArr.add(2, 'd');
        dArr.add(3, 'e');
        dArr.add(1, '1');
        System.out.println(dArr.getAt(3));
        
        for(int i = 0; i < dArr.length(); i++)
            System.out.print(dArr.getAt(i));
    }
}

class DynamicArrayImpl {
    
    private int initialSize;
    private int currentIdx;
    private char[] array;
    
    public DynamicArrayImpl(int initialSize){
        this.initialSize = initialSize;
        array = new char[initialSize];
    }

    public void add(char c){
        if(currentIdx == array.length){
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
    
    // an overloaded method
    public void add(int idx, char c){
        if(currentIdx == array.length){
            char[] tmpArray = new char[array.length * 2];
            for(int i = 0; i < idx; i++)
                tmpArray[i] = array[i];
            for(int i = idx + 1; i < array.length + 1; i++)
                tmpArray[i] = array[i - 1];
            tmpArray[idx] = c;
            currentIdx++;
            array = tmpArray;
            tmpArray = null;
        } else {
            for(int i = currentIdx; i > idx; i--)
                array[i + 1] = array[i];
            array[idx] = c;
            currentIdx++;
        }
    }
    
    public void remove(){
        // do not decrease the size of the array if it is not big
        // array[currentIdx] = '\0'; - not the approach to use
    }
    
    // public void remove(int idx){}
    
    public char getAt(int idx){
        return array[idx];
    }
    
    public int length(){
        return currentIdx;
    }
}
