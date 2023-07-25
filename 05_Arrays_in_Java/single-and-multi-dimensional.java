package Arrays_in_Java;

class SingleAndMultiDimensional {
      public static void main(String[] args) {
            // int [] arr = {10,20,30,40,50};
            // String [] name = {"Sumit","Amit","Sunil"};
            // for (int i = 0; i < arr.length; i++){
            // System.out.println(arr[i]);
            // }
            // for(String ele:name){
            // System.out.println(ele);
            // }
            // 👉 2D Arrays_in_Java

            int num[][] = new int[3][];
            for (int i = 0; i < num.length; i++) {
                  num[i] = new int[3];
            }
            for (int i = 0; i < num.length; i++) { // i = 0, 1, 2
                  for (int j = 0; j < num[i].length; j++) { // j = 0, 1,2,3,4
                        num[i][j] = i * j;
                  }
            }

            for (int i = 0; i < num.length; i++) {
                  for (int j = 0; j < num[i].length; j++){
                        System.out.print(num[i][j] + "\t");
                  }      
                  System.out.println("\n");
            }
      }

}
