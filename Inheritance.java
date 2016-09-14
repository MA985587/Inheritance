/* Inheritance.java
 * written by csi/cen 213 students fall 2016
 * 
 * A class for learning about inheritance.
 */
public class Inheritance {
  
  public static void main (String [] args) {
    int[] stats = {5,6,7,10};
    int[] location = {40,41};
    int[] spawnLocation = {50,51};
    Player dude = new Player(stats, location, spawnLocation, "Blahblah");
    // tests that Constructor initializes stats properly
    System.out.print("Stats: ");
    for (int i = 0; i < dude.getStats().length; i++) {
       System.out.print(dude.getStats()[i] + " "); 
    }
    System.out.println("");
    
    // tests that Constructor initializes location properly
    System.out.print("Location: ");
    for (int i = 0; i < dude.getLocation().length; i++) {
       System.out.print(dude.getLocation()[i] + " "); 
    }
    System.out.println("");

    // tests that Constructor initializes spawn location properly
    System.out.print("Spawn Location: ");
    for (int i = 0; i < dude.getSpawnLocation().length; i++) {
       System.out.print(dude.getSpawnLocation()[i] + " "); 
    }
    System.out.println("");
    
    // tests that Constructor initializes name properly
    System.out.print("name: ");
    System.out.println(dude.getName()); 

    
    // movement test
    dude.moveUp(); // expect y axis to be 51
    System.out.println("Test moveUp()");
    // tests that Constructor initializes location properly
    System.out.print("Location: ");
    for (int i = 0; i < dude.getLocation().length; i++) {
       System.out.print(dude.getLocation()[i] + " "); 
    }
    System.out.println("");
    
    dude.moveDown(); // expect y axis to be 41
    System.out.println("Test moveDown()");
    // tests that Constructor initializes location properly
    System.out.print("Location: ");
    for (int i = 0; i < dude.getLocation().length; i++) {
       System.out.print(dude.getLocation()[i] + " "); 
    }
    System.out.println("");
    
    dude.moveLeft(); // expect x axis to be 30
    System.out.println("Test moveLeft()");
    // tests that Constructor initializes location properly
    System.out.print("Location: ");
    for (int i = 0; i < dude.getLocation().length; i++) {
       System.out.print(dude.getLocation()[i] + " "); 
    }
    System.out.println("");
   
    dude.moveRight(); // expect x axis to be 40
    System.out.println("Test moveRight()");
    // tests that Constructor initializes location properly
    System.out.print("Location: ");
    for (int i = 0; i < dude.getLocation().length; i++) {
       System.out.print(dude.getLocation()[i] + " "); 
    }
    System.out.println("");
  }
}