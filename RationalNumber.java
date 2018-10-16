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
  public RationalNumber reciprocal(int nume, int deno) {
    nume = deno;
    deno = nume;
  }
  public boolean equals()
}
