package Control_Structure_java;

class SwitchCaseStatement {
      public static void main(String[] args){
            // int day_of_week = 9;
            // switch (day_of_week) {
            //       // default:
            //       //       System.out.println("Not Give Invalid Day_OF_WEEK Less then 1 & Greater than 7");
            //       case 1:
            //       System.out.println("Monday");
            //       break;
                  
            //       case 2:
            //       System.out.println("Tuesday");
            //       break;
                  
            //       case 3:
            //       System.out.println("Wednesday");
            //       break;
            
            //       case 4:
            //       System.out.println("Thursday");
            //       break;
                  
            //       case 5:
            //       System.out.println("Friday");
            //       break;
                  
            //       case 6:
            //       System.out.println("Saturday");
            //       break;
                  
            //       case 7:
            //       System.out.println("Sunday");
            //       break;
            //       default:
            //         System.out.println("Not Give Invalid Day_OF_WEEK Less then 1 & Greater than 7");
                  //      break;
            // }

            int day_of_week = 3;

            switch(day_of_week) {
                  case 1:
                  case 2:
                  case 3:
                  case 4:
                  case 5:
                    System.out.println("Today will be a full working day");
                    break;
                  case 6:
                    System.out.println("Today will be a Half Working day");
                    break;
                  case 7:
                    System.out.println("Today will be a Fun Day");
                    break;
                  default:
                    System.out.println("Invalid Day_OF_WEEK Less then 1 & Greater than 7");
            }
      }
}
