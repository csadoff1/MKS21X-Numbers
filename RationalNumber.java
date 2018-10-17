public class RationalNumber extends RealNumber{
  private int nume, deno;

  public RationalNumber(int num, int den) {
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
}
