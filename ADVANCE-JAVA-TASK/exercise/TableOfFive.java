// Q.1 wap to store the table of 5 into an array of size 10 

public class TableOfFive {
    public static void main(String[] args) {
          int[] tableOfFive = new int[10];
      
      for (int i = 0; i < tableOfFive.length; i++) {
            tableOfFive[i] = 5 * (i + 1);
        }
        
        System.out.println("Table of 5:");
        for (int i = 0; i < tableOfFive.length; i++) {
            System.out.println("5 x " + (i + 1) + " = " + tableOfFive[i]);
        }
    }
}
