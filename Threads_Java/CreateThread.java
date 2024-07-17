package Threads_Java;

class CustomThread extends Thread {
      public CustomThread(String name){
            super(name);
      }

      public void run() {
            for(int i = 1; i <= 10; i++){
                  System.out.println(getName() + ": " + i);
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

            ct1.start();
            ct2.start();
            ct3.start();

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