/* Inheritance.java
 * written by csi/cen 213 students fall 2016
 * 
 * A class for learning about inheritance.
 */
public class Inheritance {
  
  public static void main (String [] args) {
    int[] stats = {5,6,7};
    int[] location = {40,41};
    int[] spawnLocation = {50,51};
    Character dude = new Character(stats, location, spawnLocation);
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
    
  }
}