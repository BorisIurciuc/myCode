package deposits.i03;

public enum StatusEnum {

  DEVELOP("develop"),
  PREPARE("prepare"),
  CONSERVE("conserve");
  private final String status;
  StatusEnum(String status){
    this.status = status;
  }

  public String getStatus() {
    return status;
  }
}
