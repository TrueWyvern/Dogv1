/*
 * determine is encounter is friendly
 * user input values into dog object and program determines if encounter is friendly or not
 * Aisik
 */

package twodogsmeet;
import java.util.Scanner;

/**
 *
 * @author aipil3692
 */
public class TwoDogsMeet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);  // Reading from System.in
    System.out.println("Enter a aggressiveness then hunger: ");
     // Scans the next token of the input as an int.
    int a = reader.nextInt(); //agg for dog 1
    int b = reader.nextInt(); //hung for dog 1
    int c = reader.nextInt(); //agg for dog 2
    int d = reader.nextInt(); //hung for dog 2
    
    
    Dog dog1 = new Dog("Rover", "Spaniel", a, b);
    Dog dog2 = new Dog("Spot", "Border Collie", c, d);

    //Factors control behaviour
    if (dog1.getAggression() + dog1.getHunger() > 8) {
      //dog1 is aggressive
      System.out.print(dog1.getName() + ": ");
      dog1.barkAngry();
    } else {
      //dog1 is not aggressive
      System.out.print(dog1.getName() + ": ");
      dog1.barkFriendly();
    }

    if (dog2.getAggression() + dog2.getHunger() > 8) {
      //dog2 is aggressive
      System.out.print(dog2.getName() + ": ");
      dog2.barkAngry();
    } else {
      //dog2 is not aggressive
      System.out.print(dog2.getName() + ": ");
      dog2.barkFriendly();
    }
    
    if(dog2.getAggression() + dog2.getHunger() > 8 || dog1.getAggression() + dog1.getHunger() > 8){
        System.out.print("not a friendly meeting");
    } if(dog2.getAggression() + dog2.getHunger() <= 8 && dog1.getAggression() + dog1.getHunger() <= 8) {
        System.out.print("this is a friendly meeting");
    }
  }
}

