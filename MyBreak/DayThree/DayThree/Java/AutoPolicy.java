public class AutoPolicy {
  private String model;
  private int accountNumber;
  private String state;

  public AutoPolicy(String model, int accountNumber, String state) {
    this.model = model;
    this.accountNumber = accountNumber;
    this.state = state;
  }

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getModel() {
    return model;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getState() {
    return state;
  }

  public boolean isNoFaultState() {
    boolean noFaultState;

    switch (getState()) {
      case "Nigeria":
      case "United Kingdom":
      case "United States of America":
        noFaultState = true;
        break;
      default:
        noFaultState = false;

    }
    return noFaultState;
  }
}
