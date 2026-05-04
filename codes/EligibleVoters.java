/*
Election season has started in Bangladesh and the election commission wants to 
know the count of eligible voters.
There are N people in Bangladesh where the age of the ith person is A[i] .
Given that a person needs to be at least X years old to vote, find the number of 
eligible voters.
*/

import java.util.*;

public class EligibleVoters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int X = input.nextInt();

        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = input.nextInt();
        }

        int cnt = 0;

        for (int i = 0; i < N; i++) {
            if (A[i] >= X) {
                cnt++;
            }
        }

        System.out.println(cnt);

        input.close();
    }
}
