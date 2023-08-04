package Abstract_Class_And_Interface_In_Java;


interface I1{
      int no = 10;
      void f();
}
interface I2{
      int no2 = 20;
      void g();
}
class Base{
      void h() {
            System.out.println("H is called");
      }
}

interface I4{
//      default void m(){
//             System.out.println("F I4 is called");
//       }
     static void m(){
            System.out.println("F I4 is called");
      }
}

class InterfaceDemo extends Base implements I1,I2,I4{
       public void f(){
            // no = no + 1;
            System.out.println("F called..." + no);
      }
      public void g(){
            // no = no + 1;
            System.out.println("G called..." + no2);
      }
      public static void main(String[] args){
             InterfaceDemo obj = new InterfaceDemo();
             obj.f();
             obj.g();
             obj.h();
             I4.m();
      }
}

