public class Player extends Character{
  // properties
  private String name = "";
  
  // constructor
  public Player(int[] stats, 
                int[] location, 
                int[] spawnLocation, 
                String name) {
    super(stats, location, spawnLocation);
    this.name = name;
  }
 
    // methods
}