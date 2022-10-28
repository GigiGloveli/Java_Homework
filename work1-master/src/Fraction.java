public class Fraction {

    private int numerator;
    private int denominator;

    Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    static String simpleFrac(int numerator, int denominator){
        int a = numerator;
        int b = denominator;

        while (a != 0 && b != 0) {
            if(a>b) a %= b;
            else b %= a;
        }
        int gcd = a+b;

        return numerator / gcd + "/" + denominator / gcd;
    }

    public String fractionAdd(Object obj){
        int addNum = numerator * ((Fraction) obj).denominator + ((Fraction) obj).numerator * denominator;
        int addDem = denominator * ((Fraction) obj).denominator;

        return simpleFrac(addNum, addDem);
    }

    public String fractionDiv(Object obj){
        int divNum = numerator * ((Fraction) obj).denominator;
        int divDen = denominator * ((Fraction) obj).numerator;

        return simpleFrac(divNum, divDen);
    }

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    @Override
    public boolean equals(Object obj){

        if(obj instanceof Fraction) {
            return numerator * ((Fraction) obj).denominator == denominator * ((Fraction) obj).numerator;
        }

        return false;
    }
}
