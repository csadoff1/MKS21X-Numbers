public class RationalNumber extends RealNumber{
  private int x, y;

  public double toRatio() {
    return x/y;
  }
  public int getX() {
    return x;
  }
  public int getY() {
    return y;
  }
  public void setX(int X) {
    x=X;
  }
  public void setY(int Y) {
    y=Y;
  }
  public String toString() {
    return getX() + "//" + getY();
  }
}
