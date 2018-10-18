public class RationalNumber extends RealNumber{
  private int nume, deno;

  public RationalNumber(int nume, int deno) {
    super(((double)nume)/deno);
    this.nume = nume;
    this.deno = deno;
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
  public RationalNumber reciprocal() {
    RationalNumber recip = new RationalNumber(deno, nume);
    return recip;
  }
  public boolean equals(RationalNumber other) {
    return (this.getNumerator() == other.getNumerator()
            && this.getDenominator() == other.getDenominator());
  }
  public static int gcd(int a, int b) {
    int result = 0;
    if (a<b) {
      a=b;
      b=a;
      gcd (a,b);
    }
      if (a%b == 0) {
        result = b;
      }
      else {
        a=b;
        b=a%b;
        gcd (a,b);
      }
      return result;
  }
  public RationalNumber multiply(RationalNumber other) {
    RationalNumber product = new RationalNumber
    (this.getNumerator()*other.getNumerator(),
    this.getDenominator()*other.getDenominator());
    return product;
  }
}
