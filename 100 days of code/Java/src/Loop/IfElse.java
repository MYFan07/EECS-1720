package Loop;
// import Scanner which can help us to type the variable
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args){
        System.out.println("begin");
        // while true loop, Make the whole program enter a cycle and output data indefinitely
       while(true) {
           Scanner sc = new Scanner(System.in);
           System.out.println("type the number from 1 to 7");
           int day = sc.nextInt();
           //if else loop
           if (day == 1) {
               System.out.println("monday");
           } else if (day == 2) {
               System.out.println("Tuesday");
           } else if (day == 3) {
               System.out.println("Wednesday");
           } else if (day == 4) {
               System.out.println("Thursday");
           } else if (day == 5) {
               System.out.println("Friday");
           } else if (day == 6) {
               System.out.println("Sataurday");
           } else if (day == 7) {
               System.out.println("Sunday");
           } else {
               System.out.println("Your number is wrong");
           }
       }


    }
}
