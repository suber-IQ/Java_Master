

class MethodDeclaration {
    public static void isPrime(int num) {
        if (num <= 1) {
            System.out.println("Give num greater than 1");
            return;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println(num + " is Not Prime Number");
                return;
            }
        }
        System.out.println(num + " is Prime Number");
    }

    public static void f(){
      System.out.println("Inside F...Before Calling g()");
         g();
         System.out.println("Inside F...After Calling g()");
    }
    public static void g(){
      System.out.println("Inside G...Before Calling h()");
         h();
         System.out.println("Inside G...After Calling h()");
    }
    public static void h(){
      System.out.println("Inside H...");
    
    }
    public static void main(String[] args) {
      //   isPrime(7);
        System.out.println("Inside Main...Before Calling f()");
         f();
         System.out.println("Inside Main...After Calling f()");
    }
}
