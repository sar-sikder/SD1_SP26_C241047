// Sort an array (Ascending Order)

import java.util.*; 

public class SortArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array:");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        Arrays.sort(arr);

        System.out.println("\nSorted Array (Ascending):");
        for(int i : arr) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}