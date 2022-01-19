package Loop;
import java.util.Scanner;

// This is a program that automatically monitors the season according to the month
// This is Switch loop.
public class Switch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your month from 1 to 12");
        while(true){
        int month = sc.nextInt();
        // switch loop has a character called pierce through,
        // we can put together variables with the same corresponding data
        switch(month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                //This is a stop command.
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("Your month is wrong cannot judge");


        }
        }

    }

}
