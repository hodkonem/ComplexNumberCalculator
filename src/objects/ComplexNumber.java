package objects;

// Класс для представления комплексного числа с действительной и мнимой частями.
public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    // Метод для получения строкового представления комплексного числа.
    @Override
    public String toString() {
        return "(" + real + (imaginary >= 0 ? "+" : "") + imaginary + "i)";
    }
}
