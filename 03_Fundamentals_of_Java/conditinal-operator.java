class ConditionalOperator{
      public static void main(String[] args){
      //     int a = 7, b = 4,c = 12, max;
      //     int a = 7, b = 4,c = 2, max;
          int a = 7, b = 9,c = 2, max;
      //     max = (a > b) ? a : b;
      max = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;
          System.out.println(max);
      }
}