package Control_Structure_java;

class NestedIfStatement{
      public static void main(String[] args){
            int marks = 60;
            if(marks >= 40){
                  System.out.println("You cleared the test");
                  if(marks < 50){
                        System.out.println("With third class");
                  }else if(marks < 60){
                        System.out.println("With Second class");
                  }else if( marks < 70){
                        System.out.println("With First class");
                  }else{
                        System.out.println("With Distinction");
                  }
            }else{
                  System.out.println("Sorry You Could not clear the test");
            }
      }
}
