package complexmath;

import interfaces.ComplexOperation;
import objects.ComplexNumber;

/*
Реализация интерфейса ComplexOperation для деления комплексных чисел
 */
public class ComplexDivision implements ComplexOperation {
    public ComplexNumber calculate(ComplexNumber a, ComplexNumber b) {
        double divisor = b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary();
        double real = (a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) / divisor;
        double imaginary = (a.getImaginary() * b.getReal() - a.getReal() * b.getImaginary()) / divisor;
        return new ComplexNumber(real, imaginary);
    }
}