package depozits.i02;

public enum Status {

  DEVELOP("develop"),
  PREPARE("prepare"),
  CONSERVE("conserve");
  private final String status;
  Status(String status){
    this.status = status;
  }
}
