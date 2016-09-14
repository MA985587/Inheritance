/* Inheritance.java
 * written by csi/cen 213 students fall 2016
 * 
 * A class for learning about inheritance.
 */
public class Inheritance {
  
  public static void main (String [] args) {
    int[] stats = {5,6,7};
    int[] location = {50,50};
    int[] spawnLocation = {50,50};
    Character dude = new Character(stats, location, spawnLocation);
    
    System.out.println(dude.stats);
    System.out.println(dude.location);
    System.out.println(dude.spawnLocation());
    
    System.out.println(dude.getStats());
    System.out.println(dude.getLocation());
    System.out.println(dude.getSpawnLocation());
  }
}