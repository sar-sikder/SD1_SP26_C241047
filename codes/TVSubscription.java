/*
A new TV streaming service was recently started in IIUC Hall called the IIUC-TV.
A group of Nfriends in IIUC want to buy IIUC-TV subscriptions. We know 
that 6 people can share one IIUC-TV subscription. Also, the cost of one IIUC-TV 
subscription is 300 Taka. Determine the minimum total cost that the group 
of Nfriends will incur so that everyone in the group is able to use IIUC-TV
 */

import java.util.*; 
public class TVSubscription {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in); 
    
    System.out.print("Enter number of friends: ");
        int N = sc.nextInt();

        int subscriptions = (N + 5) / 6;

        int cost = subscriptions * 300;

        System.out.println("Minimum total cost: " + cost + " Taka");

        sc.close();
  }
}
