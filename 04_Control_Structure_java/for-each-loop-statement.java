package Control_Structure_java;

class ForEachLoopStatement{
      public static void main(String[] args){
            // int [] myList = {11,12,13,14,15,16,17,18,19};
            // for(int val:myList){
            //       System.out.println(val);
            // }
            int [] myList = {11,12,13,14,15,16,17,18,19};
            int sum = 0;
            for(int val:myList){
                  sum += val;
            }
            System.out.println(sum);
      }
}
