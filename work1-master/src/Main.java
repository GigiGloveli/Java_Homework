public class Main {

    static int quadEq(int a, int b, int c){
        return b * b - 4 * a * c;
    }

    static String smallStr(String[] array){
        String s = array[0];
        for (String i : array){
            if (i.length() < s.length()) {
                s = i;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println("D = "+ quadEq(5, 20, 25) );


        String[] array = new String[]{"java", "class", "university", "hi"};
        System.out.println("Small String - " + smallStr(array));

        Fraction fraction1 = new Fraction(7, 15);
        Fraction fraction2 = new Fraction(2, 15);

        System.out.println("Simplifying Fraction = " + Fraction.simpleFrac(fraction1.getNumerator(), fraction1.getDenominator()));

        System.out.println("Fraction addition = " + fraction1.fractionAdd(fraction2));
        System.out.println("Fraction Division = " + fraction1.fractionDiv(fraction2));
    }
}