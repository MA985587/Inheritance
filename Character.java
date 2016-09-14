import java.util.Random;

public class Character {
  // Properties:
  // HP, strength, mana
  private int[] stats = new int[3]; 
  // current location of Character: x,y coordinate
  private int[] location = new int[2]; 
  // location where Character starts: x,y coordinate
  private int[] spawnLocation = new int[2];; 

  // Constructor:
  public Character(int[] stats, int[] location, int[] spawnLocation) {
    this.stats = stats;
    this.location = location;
    this.spawnLocation = spawnLocation;
  }
  
  public Character(int[] spawnLocation) {
    Random rand = new Random();  // generates random integers
    this.spawnLocation = spawnLocation;  // starting position
    this.stats[0] = rn.nextInt(500);  // stats: HP
    this.stats[0] = rn.nextInt(100);  // stats: strength
    this.stats[0] = rn.nextInt(100);  // stats: mana
    this.location[0] = spawnLocation[0];  // location: x coordinate
    this.location[1] = spawnLocation[1];  // location: y coordinate
  }
  
  // Methods:

  // getters/setters
  public int[] getStats() {
    return this.stats;
  }
  
  public int[] getLocation() {
    return this.location;
  }
  
  public int[] getSpawnLocation() {
    return this.spawnLocation;
  }
  /*stats
    location
    spawnLocation*/
}