package Arrays_in_Java;

class CopyCloneArray {
       public static void printTwoDArray(int[][] array) {
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
       public static void main(String[] args) {
      //       // System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length);

      //   // Source array
      //   int[] sourceArray = {1, 2, 3, 4, 5};
        
      //   // Destination array with extra capacity
      //   int[] destinationArray = new int[10];
        
      //   // Using arraycopy to copy elements from sourceArray to destinationArray
      //   System.arraycopy(sourceArray, 0, destinationArray, 2, sourceArray.length);
        
      //   // Printing the destination array to see the copied elements
      //   System.out.println("Destination array after copying:");
      //   for (int num : destinationArray) {
      //       System.out.print(num + " ");
      //   }

      // 👉 clone array
        // Original array
      //   int[] originalArray = {1, 2, 3, 4, 5};
        
      //   // Using clone() to create a shallow copy of the original array
      //   int[] clonedArray = originalArray.clone();
        
      //   // Modifying the cloned array
      //   clonedArray[0] = 10;
        
      //   // Printing both arrays to see the effect of the change
      //   System.out.println("Original array:");
      //   for (int num : originalArray) {
      //       System.out.print(num + " ");
      //   }
        
      //   System.out.println("\nCloned array:");
      //   for (int num : clonedArray) {
      //       System.out.print(num + " ");
      //   }
      // 👉 clone 2D array
        
      // Original 2D array
        int[][] originalArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Using clone() to create a shallow copy of the original 2D array
        int[][] clonedArray = originalArray.clone();
        
        // Modifying the cloned 2D array
        clonedArray[0][0] = 10;
        
        // Printing both arrays to see the effect of the change
        System.out.println("Original 2D array:");
        printTwoDArray(originalArray);
        
        System.out.println("\nCloned 2D array:");
        printTwoDArray(clonedArray);

    }
    
}
