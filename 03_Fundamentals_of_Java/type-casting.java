
// 👉Type Casting Primitive Types
class TypeConversion {
      public static void main(String [] args) {
        // 🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷
      // 👉 Widening Casting 
      //   byte -> short -> char -> int -> long -> float -> double 
        //   int i_val = 3;
        //   double d_val = i_val;
        //   System.out.println("The Value of i_val:" + i_val);
        //   System.out.println("The Value of d_val:" + d_val);
        // 🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷🎷
      // 👉 Narrowing Casting 
      //   byte -> short -> char -> int -> long -> float -> double 
          int i_val;
          double d_val = 3.45;
          i_val = (int) d_val; // (Manual Casting: double to int)
          System.out.println("The Value of i_val:" + i_val); //outputs 3
          System.out.println("The Value of d_val:" + d_val); // outputs 3.45
      }
}
