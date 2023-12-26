package extras.t04GPT;

public class Block {

  private double volume;
  private double extract;

  public Block(double volume, double extract) {
    this.volume = volume;
    this.extract = extract;
  }

  public double getVolume() {
    return volume;
  }

  public void setVolume(double volume) {
    this.volume = volume;
  }

  public double getExtract() {
    return extract;
  }

  public void setExtract(double extract) {
    this.extract = extract;
  }
}
