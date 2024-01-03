package SpaceAdventures.t02.v02;

/**
 * 30/12/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Main {
  public static void main(String[] args) {
    fight();
  }
  public static void fight(){
    SpaceShip ship = new SpaceShip(100, "ship", 10);
    Asteroid aste = new Asteroid(100, 50);
    Enemy enemy = new Enemy(100, 15);


    enemy.encounter();
    ship.attack(enemy);
    System.out.println(enemy);

    enemy.attack(ship);
    System.out.println(ship);

    aste.encounter();
    aste.extract();

  }
}
