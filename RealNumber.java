public class RealNumber{
  private double val;

  public RealNumber(double val) {
    this.val = val;
  }

  public double getValue() {
    return val;
  }

  public String toString() {
    return "" + val;
  }

  public double add(RealNumber other) {
    return this.getValue() + other.getValue();
  }

  public double subtract(RealNumber other) {
    return this.getValue() - other.getValue();
  }

  public double multiply(RealNumber other) {
    return this.getValue()*other.getValue();
  }

  public double divide(RealNumber other) {
    return this.getValue()/other.getValue();
  }

}
