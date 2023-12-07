import complexmath.ComplexAddition;
import complexmath.ComplexDivision;
import complexmath.ComplexMultiplication;
import objects.ComplexCalculator;
import objects.ComplexNumber;

public class Main {
    public static void main(String[] args) {
        ComplexCalculator calculator = new ComplexCalculator();

        ComplexNumber a = new ComplexNumber(5, 3);
        ComplexNumber b = new ComplexNumber(2, 7);

        calculator.setOperation(new ComplexAddition());
        ComplexNumber resultAdd = calculator.performOperation(a, b);
        System.out.println("Addition Result: " + resultAdd);

        calculator.setOperation(new ComplexMultiplication());
        ComplexNumber resultMul = calculator.performOperation(a, b);
        System.out.println("Multiplication Result: " + resultMul);

        calculator.setOperation(new ComplexDivision());
        ComplexNumber resultDiv = calculator.performOperation(a, b);
        System.out.println("Division Result: " + resultDiv);
    }
}