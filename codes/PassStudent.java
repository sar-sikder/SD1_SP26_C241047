/*
In IIUC, there are X sections, and each section hasY students.
The semester end results are in and a total of Z students passed the exams.
Assuming that all students appeared for the exams, find whether the number of 
students who passed, was strictly greater than 50%.
*/


import java.util.*; 

public class PassStudent {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in); 

    System.out.println("Number of Sections: "); 
    int X = sc.nextInt(); 

    System.out.println("Number of Students in per Section: "); 
    int Y = sc.nextInt(); 

    System.out.println("Total pass Students: "); 
    int Z = sc.nextInt(); 

    if(Z * 2 > X * Y)
      System.out.println("Yes, Number of Passed Students are greater than 50%"); 
    else
      System.out.println("No, Number of Passed Students are less than 50%"); 

    sc.close(); 
  }
}
