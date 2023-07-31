package Inheritance_in_Java;

class SuperDemo {
      public static void main(String[] args){
        Derived obj1 = new Derived();
        obj1.printJ();
      }
}

class Base{
      protected int i;
      Base(){
            i = 10;
      }
     public void printI(){
            System.out.println(i);
      }
}

class Derived extends Base{
      private int j;
      Derived(){
            // super.i = 20;
            super();
            this.j = 30;
      }
      public void printJ(){
            super.printI();
            // System.out.println(i);
            System.out.println(j);
      }

}
