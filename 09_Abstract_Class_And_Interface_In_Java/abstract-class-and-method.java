package Abstract_Class_And_Interface_In_Java;
import java.util.Scanner;



class AbstractClassesAndMethods{
      public static void main(String args[]){
         try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Please Enter 1 to select for dog and 2 to select for cat");
               int choice = sc.nextInt();
            //    Animal a = new Animal(); //🔎 not make instance of Animal why? that is abstract class.
            //     Animal a;
            PetAnimal a;
               if(choice == 1){
                   a = new Dog();
               }else{
                   a = new Cat();
               }
               a.makeSound();
         }


      }
}

abstract class Animal{
     abstract protected void makeSound();
   
}

abstract class PetAnimal extends Animal{
      protected void getType(){
            System.out.println("this is a pet Animal");
      }
      final public void f(){
                  System.out.println("F() called....");

      }
}

class Dog extends PetAnimal{
       protected void makeSound(){
         System.out.println("Bow... wow");
      }
}
class Cat extends PetAnimal{
       protected void makeSound(){
         System.out.println("Meow..Meow");
      }
}
