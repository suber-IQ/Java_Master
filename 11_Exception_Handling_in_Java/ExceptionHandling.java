package Exception_Handling_in_Java;


class Demo{
      int a[] = new int[5];
      public void set(){
            for(int i = 0; i < 5; i++){
                  a[i] = i + 2;
            }
      }
      public void print(){
            for(int i = 0; i <= 5; i++){
                System.out.println(a[i]);  
            }
      }

      public static void main(String[] args){
            Demo obj = new Demo();
            obj.set();
            // obj.a[0] = 20;
            // System.out.println("Setting of a[0] done");
            // obj.a[25] = 30;
            // System.out.println("Setting of a[25] done"); 
            try {
                  
                  obj.print();
            } catch (Exception e) {
                  // TODO: handle exception
                  System.out.println("After Calling Print Methods");
            }
      }
}