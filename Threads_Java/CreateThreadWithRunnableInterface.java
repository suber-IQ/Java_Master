package Threads_Java;

class CustomThread implements Runnable {
      Thread t;
      public CustomThread(String name){
            t = new Thread(this,name);
            t.start();
      }

      public void run() {
            for(int i = 1; i <= 10; i++){
                  System.out.println(t.getName() + ": " + i);
                   try {
                        Thread.sleep(300);
                  } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                  }
            }
      }

      public static void main(String[] args){
            CustomThread ct1 = new CustomThread("Thread 1");
            CustomThread ct2 = new CustomThread("Thread 2");
            CustomThread ct3 = new CustomThread("Thread 3");


            for(int i = 1; i <= 10; i++){
                  System.out.println("Main Thread: " + i);
                  try {
                        Thread.sleep(300);
                  } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                  }
            }

      }
}