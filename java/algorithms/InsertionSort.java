public class InsertionSort {

    public static void main(String[] args){
        double[] testArr = {2, 4, 7, 4, 1};

        // Run insertion sort
        InsertionSort.insertionSort(testArr);

        for(int i = 0; i < testArr.length; i++){
            System.out.println(testArr[i]);
        }
    }

    public static void insertionSort(double[] arr){
        for(int j = 1; j < arr.length; j++){
            double key = arr[j];
            int i = j - 1;
            while(i >= 0 && arr[i] > key){
                arr[i + 1] = arr[i];
                i = i - 1;
            }
            arr[i + 1] = key;
        }
    }
}
