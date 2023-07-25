package Control_Structure_java;

class IfElseIfStatement {
      public static void main(String[] args) {
            // int temprature = 0;
            // int temprature = 40;
            // int temprature = 101;

            // if(temprature <= 0){
            //       System.out.println("Its Solid Or Ice");
            // }else if(temprature >= 100){
            //       System.out.println("Its Gas Or Vapor");
            // }else{
            //       System.out.println("Its liquid Or Water");
            // }
            // System.out.println("Program is complete");

            //👉 Example 2 
            // int marks = 20;
            // int marks = 35;
            // int marks = 50;
            int marks = 60;


            if(marks < 35){
                  System.out.println("You Are Failed");
            }else if(marks < 50){
                  System.out.println("You  Are Third");
            }else if( marks < 60){
                  System.out.println("You Are Second");
            }else{
                  System.out.println("You Are First");
            }
            System.out.println("Marks Program is complete");
      }
}
