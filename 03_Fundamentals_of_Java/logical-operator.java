class LogicalOperator {
      public static void main(String[] args){
            int a = 5, b = 8, c = 12;

            System.out.println("a , b and c with AND' && Operators: " + ((a < b) && (a < c))); // output: true
            System.out.println("a , b and c with OR' ||  Operators: " + ((a < b) || (a > c))); // output: false

            System.out.println("a , b and c with OR' || Operators: " + ((a < b) || (a < c))); // output: true
            System.out.println("a , b and c with AND' &&  Operators: " + ((a < b) && (a > c))); // output: false
      }
}
