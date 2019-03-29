public class GBSLauncher {
    public static void main(String args[]) {
        // can't be int - autoboxing does not work for arrays
        Integer[] iArr = {5, 4, 3, 10};
        GBS.sort(iArr);
        for(Integer i: iArr)
            System.out.print(" " + i);
        System.out.println();
        
        Character[] cArr = {'a', 'x', 'A', 'b', 'z', 'd'};
        GBS.sort(cArr);
        for(Character i: cArr)
            System.out.print(" " + i);
        System.out.println();
    }
}

class GBS {
    public static <E extends Comparable<E>> void sort(E[] arr){
        boolean swapped = true;
        int n = arr.length;
        for (int i = 0; i < n - 1 & swapped; i++){
            swapped = false;
            for (int j = 0; j < n-i-1; j++){
                if (arr[j].compareTo(arr[j+1]) > 0){
                    E temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
        }
    }
    
    // TODO: implement compare to
    // private int compareTo(T t1, T t2){
        
    // }
}
