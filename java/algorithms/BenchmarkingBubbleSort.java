public class BenchmarkingBubbleSort {
    public static void main(String args[]) {
        // 0. - declare and initialize an array of any size
        int[] arr1 = new int[1000];

        // repeated testing
        long sumOfTime = 0;
        int numberOfExperiments = 30;
        for(int i = 0; i < numberOfExperiments; i++){
            // 1. - fill the array
            for(int j = 0; j < arr1.length; j++){
                int number = (int)(Math.random() * 500 + 1);
                arr1[j] = number;
            }

            long startTimeBubble = System.nanoTime();
            bubbleSort(arr1);
            long endTimeBubble = System.nanoTime();

            sumOfTime += (endTimeBubble - startTimeBubble);
            System.out.println("This iteration took:" + (endTimeBubble - startTimeBubble) + "ns");
        }

        System.out.println("On average bubbleSort(arr) took: " + sumOfTime / numberOfExperiments + "ns");
    }

    // function that performs bubble sort
    // Unoptimized: On average bubbleSort(arr) took: 3314665ns
    // 1-optimization: On average bubbleSort(arr) took: 2288617ns
    // 2-optimizations: On average bubbleSort(arr) took: ??
    static void bubbleSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - 1; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
