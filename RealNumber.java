public class RealNumber{
  private double val;

  public RealNumber() {
    
  }
  public RealNumber(double val) {
    this.val = val;
  }

  public double getValue() {
    return val;
  }
  public void setValue(double V) {
    val = V;
  }
  public String toString() {
    return "Value: " + val;
  }
}
