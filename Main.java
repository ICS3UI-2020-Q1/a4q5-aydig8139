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
    int usersNum = input.nextInt();
    System.out.println("Hailstone sequence is the following:");

    //create variable to determine if the number is even
    
    
    


    //create while loop
    while(usersNum >= 1){
      
      int even = usersNum % 2;
      
      if (even == 0){
        
        System.out.println(usersNum);
        usersNum = usersNum / 2;
      }else if (even > 0){
        System.out.println(usersNum);
         usersNum = usersNum*3 + 1;
      }
     
      
    }
    
  }
}
