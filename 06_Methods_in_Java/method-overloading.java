class MethodOverloading {
      static int count = 0;
      public static void main(String[] args){
      //      p_finite();
           long result = factoral(2);
           System.out.println(result);
      }

      public static long factoral(int num){
            if(num == 1){
                  return 1;
            }
            return num * factoral(num - 1);
           
      }

      static void p_finite() {
            // count--;
            count++;
            if(count <= 10){
                  System.out.println("Hello: " + count);
                  p_finite();
            }
      }
}
