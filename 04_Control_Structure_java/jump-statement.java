package Control_Structure_java;

class JumpStatement {
      public static int sum(int a, int b){
            return a + b;
      }
      public static void main(String[] args){
            // ✴️ 'Break': Jump Statement
            // int num = 10;
            // for(int i = 1; i <= num; i++){
            //       if(i == 7)
            //          break;
            //          System.out.println(i);
            // }
            // System.out.println("Just came out of loop!");
 // ✴️ 'Continue': Jump Statement
              // Example array of integers
      //   int[] numbers = {1, 2, 3, 4, 5};
        
      //   // Using a loop to print even numbers in the array
      //   for (int number : numbers) {
      //       if (number % 2 == 1) {
      //           // If the number is odd, skip to the next iteration
      //           continue;
      //       }
      //       System.out.println("Even Number: " + number);
      //   }
        
      //   System.out.println("Loop has ended!");

//✴️ 'Labelled Break' AND 'Labelled Continue' : Jump Statement
      //    out:
      //     for(int i = 1; i <= 5; i++){
      //        System.out.println("outer");
      //          for(int j = 1; j <= 5; j++){
      //            System.out.println("inner");
      //             if(j==2){
      //             //   break; //🔎 this will exit from inner loop only
      //               break out; //🔎 this will exit from both loops
      //             }
      //          }
      //     }

// ✴️ 'Return': Jump Statement
          int a = 7, b = 6;
          int ans = sum(a,b);
          System.out.println("Two numbers of submissions: " + ans);

      }

}
