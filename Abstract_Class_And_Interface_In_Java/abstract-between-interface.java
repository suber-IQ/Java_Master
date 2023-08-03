package Abstract_Class_And_Interface_In_Java;

// 👉 first Difference 

// abstract class AbDemo{
//       void f(){
//             System.out.println("F from AbDemo");
//       }
       
//       abstract void g();
// }

// interface I{
//      void h(){  // do not write logic without default and static also
//             System.out.println("h method from I interface");
//       }
//       abstract void j();
// }

// 👉 Second Difference 

// class Base{}
// abstract class AbDemo{
//       void f(){
//             System.out.println("F from AbDemo");
//       }
       
//       abstract void g();
// }


// interface I1{
//     default void h(){
//             System.out.println("H from I1 interface");
//       }
//       // abstract void j();
// }
// interface I2{
      
// }

// class Dervied extends Base, AbDemo{}
// class Dervied implements I1, I2{}
// class Dervied extends Base implements I1, I2{}

// 👉 Third Difference 

// abstract class AbDemo{
//       int var1;
//       final int var2 = 10;
//       void f(){
//             var1++;
//             System.out.println("F from AbDemo");
//       }
       
//       abstract void g();
// }
// interface I1{
//       int var3 = 4;
//       final int var4 = 5;
//     default void h(){
//             System.out.println("H from I1 interface");
//             // var3++;
//       }
//       // abstract void j();
// }

// class Dervied extends AbDemo implements I1{}

// 👉 Four Difference 

// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
// interface I1{}
// abstract class AbBase implements I1{}
// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

// abstract class AbBase{}
// interface I1 extends AbBase{}

// 👉 Five Difference 

// interface I1{
//       void f();
// }
// abstract class AbBase{
//       abstract void h();
// }

// class Derived extends AbBase implements I1{
//       public void f(){  // give must be public from I1 by defalut is public
//             System.out.println("F Called");
//       }
//       void h(){
//             System.out.println("H Called");
//       }
// }

// 👉 Six Difference 

interface I1{
      void f();
      // public I1(){  // not give constructor in interface
      //    System.out.println("I1 Interface is call Constructor");
 
      // }
}
abstract class AbBase{
      abstract void h();
      public AbBase(){
            System.out.println("AbBase is call Constructor");
      }
}

class Derived extends AbBase implements I1{
      public void f(){  // give must be public from I1 by defalut is public
            System.out.println("F Called");
      }
      void h(){
            System.out.println("H Called");
      }
      public static void main(String [] args){
            // I1 obj1 = new I1(); //not make object of interface
            I1 obj1 = new Derived();
            // AbBase obj2 = new AbBase(); // not make object of abstract class
            AbBase obj2 = new Derived();
            Derived obj3 = new Derived();
            obj1.f();
            obj1.h();
      }
}