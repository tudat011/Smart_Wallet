import java.util.Scanner;

public class Time{
    public static void main(String args[]){
        System.out.print("please enter the second:");
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        int m = 0;
        int h = 0;
        h = s / 3600;
        m = s / 60 - h*60;
        s = s - h*3600 - m*60;
        System.out.print(h + "h" + m + "m" + s + "s");
    }
}