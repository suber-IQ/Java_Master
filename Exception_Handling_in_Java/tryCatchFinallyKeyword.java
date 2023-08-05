package Exception_Handling_in_Java;

class ExceptionHandlingDemo2 {
      public static void main(String[] args){
            int a = 10, b = 2;
            try{
                  // b = Integer.parseInt(args[0]);
                  int ans = a/b;
                  System.out.println("The ans is: " + ans);
 
            }catch(Exception e){
                  System.out.println("Exception is Generated");
            }finally{
                  System.out.println("Always excuted");
            }
            System.out.println("After try block");
      }
}
