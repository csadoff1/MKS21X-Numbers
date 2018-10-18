public class RationalNumber extends RealNumber{
  private int nume, deno;

  public RationalNumber(int nume, int deno) {
    super(0.0);
    if (deno == 0) {
      nume = 0;
      deno = 1;
    }
    else {
      this.nume = nume/gcd(nume,deno);
      this.deno = deno/gcd(nume,deno);
    }
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
    if (deno == 1) {
      return "" + getNumerator();
    }
    if (nume == 0) {
      return "" + 0;
    }
    else {
      return "" + getNumerator() + "/" + getDenominator();
    }
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
    if (b != 0) {
      return gcd(b, a%b);
    }
    return a;
  }
  private void reduce() {
    nume = nume/gcd(nume, deno);
    deno = deno/gcd(nume, deno);
    if (deno==0) {
      nume = 0;
      deno = 1;
    }
  }
  public RationalNumber multiply(RationalNumber other) {
    RationalNumber product = new RationalNumber
    (this.getNumerator()*other.getNumerator(),
    this.getDenominator()*other.getDenominator());
    return product;
  }
  public RationalNumber divide(RationalNumber other) {
    return this.multiply(other.reciprocal());
  }
  public RationalNumber add(RationalNumber other) {
    RationalNumber sum = new RationalNumber
    (this.getNumerator()*other.getDenominator() +
    other.getNumerator()*this.getDenominator(),
    this.getDenominator()*other.getDenominator());
    return sum;
  }
  public RationalNumber subtract(RationalNumber other) {
    RationalNumber difference = new RationalNumber
    (this.getNumerator()*other.getDenominator() -
    other.getNumerator()*this.getDenominator(),
    this.getDenominator()*other.getDenominator());
    return difference;
  }
}
