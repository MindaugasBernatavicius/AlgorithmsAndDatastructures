package algorithms;

public class ArrayRowwiseAndCollumnarTraversal {
  public static void main(String[] args){
    int testCount = 1;
    int initRowCount = 3;
    int initCollumnCount = 3;
    int multiplier = 2;

    // 0. Loop through increasing the size of matrix.
    for(int i = 0; i < testCount; i++){
      // 1. Define a new, bigger matrix on each loop
      Integer[][] matrix = new Integer[initRowCount * multiplier][initCollumnCount * multiplier];

      // 2. Fill the array and print it
      for(int j = 0; j < matrix.length; j++){
        for(int k = 0; k < matrix[j].length; k++){
          matrix[j][k] = (int)(Math.random() * 99 + 1);
        }
      }
      printMatrix(matrix);

      // 3. Row-wise traversal.
      increaseMatrixRowwise(matrix);
      printMatrix(matrix);


      // 4. Collum-wise traversal (same array).
      increaseMatrixCollumnwise(matrix);
      printMatrix(matrix);

    }

    // 4. Print results.

  }

  private static <T> void printMatrix(T[][] matrix){
    for(int j = 0; j < matrix.length; j++){
      for(int k = 0; k < matrix[j].length; k++)
        System.out.print(matrix[j][k] + " ");
      System.out.println();
    }
    System.out.println();
  }

  private static void increaseMatrixRowwise(Integer[][] matrix) {
    for (int j = 0; j < matrix.length; j++) {
      for (int k = 0; k < matrix[0].length; k++) {
        matrix[j][k] += 1;
      }
    }
  }

  private static void increaseMatrixCollumnwise(Integer[][] matrix) {
    for(int j = 0; j < matrix[0].length; j++){
      for(int k = 0; k < matrix.length; k++){
        matrix[j][k] += 1;
      }
    }
  }

}