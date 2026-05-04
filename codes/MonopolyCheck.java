/*
There are 4 companies in the markets of Chittagong,A,B,C, and D. This year,
Company A made a profit of Plakh,
Company B made a profit of Qlakh,
Company C made a profit of Rlakh,
Company D made a profit of S lakh.
There is said to be a monopolyin the market if the profit made by one company 
is strictly greater than the sum of profits made by all other companies. Determine 
if there is a monopoly in the market or not.
 */

import java.util.*;

public class MonopolyCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Profit of A: "); 
        int P = sc.nextInt(); 
        System.out.println("Profit of B: ");
        int Q = sc.nextInt(); 
        System.out.println("Profit of C: ");
        int R = sc.nextInt(); 
        System.out.println("Profit of D: ");
        int S = sc.nextInt();

        if (P > Q + R + S || Q > P + R + S || R > P + Q + S || S > P + Q + R) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}