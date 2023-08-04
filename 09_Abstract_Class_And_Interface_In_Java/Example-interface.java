package Abstract_Class_And_Interface_In_Java;
import java.util.Scanner;

class Vehicle{
      int noSeats;
      String fuel;
      int speed;
     public Vehicle(int noSeats,String fuel,int speed){
         this.noSeats = noSeats;
         this.fuel = fuel;
         this.speed = speed;
     }
     public String toString(){
         return "No of Seats: " + noSeats + " Fuel Used: " + fuel + " Speed: " + speed;
     }
}

interface FlyingObject{
      int maxHeight = 20000;

}

class Aeroplane extends Vehicle implements FlyingObject{
          int takeoffSpeed;
          public Aeroplane(int noSeats,String fuel,int speed,int takeoffSpeed){
             super(noSeats,fuel,speed);
             this.takeoffSpeed = takeoffSpeed;
          }
          public String toString(){
               String aeroPrint;
               aeroPrint = "Attributes of Aeroplane\n";
               aeroPrint = aeroPrint + "No of Seats: " + noSeats + " Fuel Used: " + fuel + " Speed: " + speed;
               aeroPrint = aeroPrint + "Maxium Height: " + maxHeight;
               aeroPrint = aeroPrint + "TakeoffSpeed: " + takeoffSpeed; 
               return aeroPrint;

          }
}
class Rocket extends Vehicle implements FlyingObject{
     public Rocket(int noSeats,String fuel,int speed){
             super(noSeats,fuel,speed);
          }
}
class Bus extends Vehicle{
          String type;
          public Bus(int noSeats,String fuel,int speed,String type){
             super(noSeats,fuel,speed);
             this.type = type;
          }
          public String toString(){
               String busPrint;
               busPrint = "Attributes of Bus\n";
               busPrint = busPrint + "No of Seats: " + noSeats + " Fuel Used: " + fuel + " Speed: " + speed;
               busPrint = busPrint + "Type: " + this.type; 
               return busPrint;
          }
}



class InterfaceDemo{
      public static void main(String arg[]){
            Vehicle v [] = new Vehicle[5];
            try (Scanner sc = new Scanner(System.in)) {
                  for(int i = 0; i < 5; i++){
                      System.out.println("Enter 1 to create Bus, 2 to create AeroPlane and 3 to create Rocket");
                      int choice = sc.nextInt();
                      if(choice == 1) {  // user wants to create bus
                        int seats;
                        String fuel;
                        int speed;
                        String type;
                        System.out.println("Enter seats, fuel, speed and type of Bus");
                        seats = sc.nextInt();
                        fuel = sc.next();
                        speed = sc.nextInt();
                        type = sc.next();

                        v[i] = new Bus(seats,fuel,speed,type);
                      }else if(choice == 2){ // user wants to create aeroplane
                        int seats;
                        String fuel;
                        int speed;
                        int takeoffSpeed;
                        System.out.println("Enter seats, fuel, speed and takeoffSpeed of AeroPlane:");
                        seats = sc.nextInt();
                        fuel = sc.next();
                        speed = sc.nextInt();
                        takeoffSpeed = sc.nextInt();

                        v[i]  = new Aeroplane(seats, fuel, speed, takeoffSpeed);

                      }else{
                          int seats;
                          String fuel;
                          int speed;
                           System.out.println("Enter seats, fuel and speed of Rocket :");
                        seats = 2;
                        fuel = sc.next();
                        speed = sc.nextInt();

                        v[i]  = new Rocket(seats, fuel, speed);
                      }
                  }
                  int count = 0;
                  for(int i = 0; i < 5; i++){
                        if(v[i] instanceof FlyingObject){
                              count++;
                        }
                        System.out.println(v[i]);
                  }
                  System.out.println("Total FlyingObject are: " + count );
            }

      }
}