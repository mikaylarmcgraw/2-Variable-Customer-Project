// Customer project take 2
//able to compare integers in ascending/decending order
//3 integers at a time
//able to tell first, second, third integer entered in
import java.util.Scanner;
public class IntegerSort {
public static void main(String args[]) {
    Scanner userInput = new Scanner(System.in);
    int x, y;//inputted numbers by user
    //no input error trapping needed no arguments entered in
    System.out.println("Please enter first number:");
    x = userInput.nextInt();
    System.out.println("Please enter second number:");
    y = userInput.nextInt(); 
   // securing place holders 
    int firstplace=0;
    int secondplace=0;
    //set of conditions greater or less than
    if (x>y) {
        firstplace=x; secondplace=y;
    System.out.println("The descending numbers are:");
    System.out.println(""+firstplace);
    System.out.println(""+secondplace);
    } if (x<y) {
        firstplace=y; secondplace=x;
    System.out.println("The descending numbers are:");
    System.out.println(""+firstplace);
    System.out.println(""+secondplace);
    }
    // equal values
    if(x==y) {
        System.out.println("Values are equal");
    }
 
    
  
 
    
}
}