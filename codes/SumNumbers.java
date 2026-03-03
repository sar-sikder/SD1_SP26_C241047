//  Sum of all numbers from 1 to N

import java.util.*;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = input.nextInt();

        int sum = 0;

        for(int i = 1; i <= N; i++) {
            sum += i; // sum = sum + i
        }

        System.out.println("Sum of numbers from 1 to " + N + " is: " + sum);

        input.close();
    }
}