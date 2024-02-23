package CSC260_Homework1_Review.Problem4;

public class MyCalculator {

    private double a;
    private double b;
    private char operator;

    public MyCalculator(double a, double b, char operator) {
        this.a = a;
        this.b = b;
        this.operator = operator;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public char getOperator() {
        return operator;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public double executeOperator() {
        double result = this.a;
        switch (this.operator) {
            case '+' -> {
                result = this.a + this.b;
            }
            case '-' -> {
                result = this.a - this.b;
            }
            case '*' -> {
                result = this.a * this.b;
            }
            case '/' -> {
                if (this.b != 0) {
                    result = this.a / this.b;
                } else {
                    result = Double.NaN; // return not a number if / 0
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "\n" + this.a + " " + this.operator + " " + this.b + " = "
                + executeOperator() + "\n";
    }
}
