/*
A student has to submit 3 assignments before 10 pm and he starts to do the 
assignments at X pm. Each assignment takes him 1 hour to complete. Can you tell 
whether he'll be able to complete all assignments on time or not?
*/

import java.util.Scanner;

public class Assignment{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start time (0-23): ");
        int start = sc.nextInt();

        if (start < 0 || start > 23) {
            System.out.println("Invalid time!");
            return;
        }

        int deadline = 22; 
        int assignment = 1; 
        int finish = start + assignment * 3;

        if (finish <= deadline) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}