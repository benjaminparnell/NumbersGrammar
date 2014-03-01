package numbers;

public class RomanNumeral {
  public enum Numeral {
    M(1000), CM(900), D(500), CD(400), C(100), XC(90), L(50), XL(40), X(10),
    IX(9), V(5), IV(4), I(1);

    public final long weight;

    private Numeral(long weight) {
      this.weight = weight;
    }
  };

  public static Double decode(String roman) {
    Double result = new StringBuilder(roman.toUpperCase()).reverse().chars()
      .mapToObj(c -> Character.toString((char) c))
      .map(numeral -> Enum.valueOf(Numeral.class, numeral))
      .mapToDouble(numeral -> numeral.weight)
      .reduce(0, (a, b) -> a + (a <= b ? b : -b));
    return result;
  }
}