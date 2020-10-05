import java.util.Scanner;

/**
 * Hailstone sequence
 * @author Rose
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create new scanner for user input
    Scanner input = new Scanner(System.in);

    //Ask user for a number
    System.out.println("Please enter a positive integer to see the hailstone sequence.");

    //declare variable to store user input
    int usersNum = input.nextInt();

    
    System.out.println("Hailstone sequence is the following:");

 
    //create while loop to list the hailstone sequence until the number before 1 
    while(usersNum > 1){
      
      //declare variable to determine if a number is even
      int even = usersNum % 2;
      
      //create if statement to test if the number is even or not and print out the result
      if (even == 0){
        System.out.println(usersNum);
        usersNum = usersNum / 2;
      }else if (even > 0){
        System.out.println(usersNum);
        usersNum = usersNum*3 + 1;
      }
      }
      //print out 1 to end the hailstone sequence
      System.out.println("1");
     
      
    }
    
  }
