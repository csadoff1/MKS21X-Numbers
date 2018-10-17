public class RationalNumber extends RealNumber{
  private int numerator, denominator;

  public RationalNumber(int nume, int deno) {
    nume = 14;
    deno = 49;
  }

  public double getValue() {
    return nume/deno;
  }
  public int getNumerator() {
    return nume;
  }
  public int getDenominator() {
    return deno;
  }
  public String toString() {
    return getNumerator() + "//" + getDenominator();
  }
  public RationalNumber reciprocal(int num, int den) {
    RationalNumber recip = new RationalNumber(den, num);
    return recip;
  }
  public boolean equals(RationalNumber other) {
    return (this.getNumerator() == other.getNumerator()
            && this.getDenominator() == other.getDenominator());
  }
  public static int gcd(int a, int b) {
    if (a<b) {
      a=b;
      b=a;
    }
      int r = a % b;
      if (r == 0) {
        return b;
      }
      else {
        a=b;
        b=r;
      }
  }
}
