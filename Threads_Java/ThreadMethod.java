package Threads_Java;

// class JoinDemo extends Thread  {
//       int t;
//        JoinDemo(int t){
//             this.t = t;
//             start();
//        }
//        public void run(){
//             try{
//                   for(int i=0; i<= 5; i++){
//                         System.out.println(getName() + " " + i);
//                         Thread.sleep(t);
//                   }

//             }catch(InterruptedException e){
//                   e.printStackTrace();
//             }
//        }
//        public static void main(String[] args){
//             JoinDemo obj1  = new JoinDemo(200);
//             JoinDemo obj2  = new JoinDemo(300);
//             JoinDemo obj3  = new JoinDemo(400);

//               try {
//                   obj1.join();
//                   // obj2.join();
//                   // obj3.join();

//               } catch (InterruptedException e) {
//                   // TODO: handle exception
//                   //  e.printStackTrace();

//               }
//               System.out.println("Main is Exting...");
//               return;
//        }
// }


// class PriorityDemo extends Thread{
//       public void run(){
//             System.out.println("Priority of the Thread: " + Thread.currentThread() + " is: " + getPriority());

//       }
//       public static void main(String[] args){
//             PriorityDemo obj1 = new PriorityDemo();
//             obj1.setPriority(Thread.NORM_PRIORITY);
//             obj1.start();
//       }
// }


class AliveDemo extends Thread{
      AliveDemo(){
            start();
      }
     public void run(){
      try {
            System.out.println(getName() + " Says...Hello");
            Thread.sleep(500);
            System.out.println(getName() + " Says.. Bye Bye");
      } catch (InterruptedException e) {
            // TODO: handle exception
      }
     }
      public static void main(String[] args){
            AliveDemo obj0 = new AliveDemo();
            AliveDemo obj1 = new AliveDemo();
            AliveDemo obj2 = new AliveDemo();
            
            System.out.println(obj0.getName() + " Alive Status: " + obj0.isAlive());
            System.out.println(obj1.getName() + " Alive Status: " + obj1.isAlive());
            System.out.println(obj2.getName() + " Alive Status: " + obj2.isAlive());
            System.out.println("Main Sleeping for 2000 ms");

            try {
                  Thread.sleep(2000);
            } catch (InterruptedException e) {
                  // TODO: handle exception
            }
              System.out.println(obj0.getName() + " Alive Status: " + obj0.isAlive());
            System.out.println(obj1.getName() + " Alive Status: " + obj1.isAlive());
            System.out.println(obj2.getName() + " Alive Status: " + obj2.isAlive());

      }
}
