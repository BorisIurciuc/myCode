package SpaceAdventures.t02.v03;
import java.util.Random;

/**
 * 30/12/2023 myCode * @author Boris Iurciuc (cohort36)
 */
public class Main {
  static int key;

  public static Asteroid[] getAsteroid(int key) {
    Asteroid[] aste = new Asteroid[key];
    for (int i = 0; i < key; i++) {
      aste[i] = new Asteroid(100, 100);
    }
    return aste;
  }

  public static Enemy[] getEnemy(int key) {
    Enemy[] enemy = new Enemy[key];
    for (int i = 0; i < key; i++) {
      enemy[i] = new Enemy(200, 200);
    }
    return enemy;
  }


  public static void main(String[] args) {


    Random random = new Random();
    key = random.nextInt(20);
    System.out.println("key " + key);

    fight();
  }

  public static void fight(){
    SpaceShip ship = new SpaceShip(100, "Ship", 10);
    Asteroid[] aste = getAsteroid(key);
    Enemy[] enemy = getEnemy(key);

    System.out.println("------------------------------");
    enemy[1].encounter();
    ship.attack(enemy[1]);
    System.out.println(enemy[1]);

    enemy[1].attack(ship);
    System.out.println(ship);

    aste[1].encounter();
    ship.destroy();

    System.out.println(ship.isAlive());
  }
}
