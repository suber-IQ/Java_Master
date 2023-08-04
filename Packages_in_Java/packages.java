package Packages_in_Java;
// import java.util.Scanner;


class PackagesDemo{
      public static void main(String args[]){
            System.out.println("Please Enter Your Name");
            //  Scanner sc = new Scanner(System.in); // 
            try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
                  String my_name = sc.next();
                  System.out.println("Hello... " + my_name);
            }

      }
}