/*
You are given 3 numbersA,B,and C.
Determine whether the average of A and B is strictly greater than C or not?
NOTE:Average of Aand Bis defined as(A+B)/2. For example, average 
of 5 and 9is 7, average of 5 and 8 is 6.5
*/

import java.util.*;

public class AverageCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A, B, C: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        double avg = (A + B) / 2.0;

        if(avg > C) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}