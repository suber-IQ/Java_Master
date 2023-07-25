package Control_Structure_java;

class WhileLoopStatement{
      public static void main(String[] args){
            // int num = 20;
            // int i = 1;
            // while(i <= num){
            //       System.out.println(i++);
            // }
           int num = 50;
           int i = 1, sum = 0;
           while(i <= num){
              sum += i;
              i++;
           }

           System.out.println("Sumition of numbers: " + sum);
          
      }
}