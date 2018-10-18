public class RationalNumber extends RealNumber{
  private int nume, deno;

  public RationalNumber(int nume, int deno) {
    super(0.0);
    if (deno==0) {
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
  private void reduce() {
    nume = nume/gcd(nume, deno);
    deno = deno/gcd(nume, deno);
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
