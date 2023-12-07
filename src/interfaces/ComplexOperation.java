package interfaces;

import objects.ComplexNumber;
/*
интерфейс для операций над комплексными числами
 */
public interface ComplexOperation {
    ComplexNumber calculate(ComplexNumber a, ComplexNumber b);
}