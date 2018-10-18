public class RealNumber{
  private double val;

  public RealNumber(double val) {
    this.val = val;
  }

  public double getValue() {
    return (double)val;
  }

  public String toString() {
    return "" + val;
  }

  public double add(RealNumber other) {
    return 0.0 + this.getValue() + other.getValue();
  }

  public double subtract(RealNumber other) {
    return 0.0 + this.getValue() - other.getValue();
  }

  public double multiply(RealNumber other) {
    return 0.0 + this.getValue()*other.getValue();
  }

  public double divide(RealNumber other) {
    return 0.0 + this.getValue()/other.getValue();
  }

}
