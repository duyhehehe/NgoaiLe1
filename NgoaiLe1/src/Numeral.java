public class Numeral extends Expression {
    private double value;

    public Numeral() {

    }

    public Numeral(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value + "";
    }

    @Override
    public double evaluate() {
        return value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
