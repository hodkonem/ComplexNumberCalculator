package complexmath;

import interfaces.ComplexOperation;
import objects.ComplexNumber;
/*
Реализация интерфейса ComplexOperation для сложения комплексных чисел
 */
public class ComplexAddition implements ComplexOperation {
    public ComplexNumber calculate(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.getReal() + b.getReal(), a.getImaginary() + b.getImaginary());
    }
}
