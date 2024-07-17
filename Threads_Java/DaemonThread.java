package Threads_Java;

class DaemonThread extends Thread{
      public void run(){
          try{
              System.out.println("In Run Method: " + Thread.currentThread());
              while (true) {
                  try{
                        Thread.sleep(500);
                  }catch(InterruptedException e){
                        System.out.println("In Run.. Woke up Again..");
                  }
              }
          }finally{
             System.out.println("Leaving Run Method...");
          }
      }
      public static void main(String[] args){
            System.out.println("Starting Main Thread...");
            DaemonThread obj = new DaemonThread();
            obj.setDaemon(true);
            obj.start();
            try{
                  Thread.sleep(3000);
            }catch(InterruptedException e){
                  System.out.println("Time Up... Exiting Now");
            }
      }
}