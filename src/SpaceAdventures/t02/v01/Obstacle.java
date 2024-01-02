package SpaceAdventures.t02.v01;

public abstract class Obstacle extends GameObject {
  public Obstacle(int remainingStrength) {
    super(remainingStrength);
  }
  public abstract void encounter(); //описать абстрактный метод void encounter() - встретить/найти
  @Override
  public int getRemainingStrength() {
    return super.getRemainingStrength();
  }
  @Override
  public void setRemainingStrength(int remainingStrength) {
    super.setRemainingStrength(remainingStrength);
  }
  @Override
  public boolean isAlive() {
    return super.isAlive();
  }
  @Override
  void destroy() {
    super.destroy();
  }
  @Override
  void hurt(double amount) {
    super.hurt(amount);
  }
  @Override
  public boolean equals(Object o) {
    return super.equals(o);
  }
  @Override
  public int hashCode() {
    return super.hashCode();
  }
  @Override
  public String toString() {
    return super.toString();
  }
}

