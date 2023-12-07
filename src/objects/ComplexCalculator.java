package objects;

import interfaces.ComplexOperation;
import logging.Logger;
/*
Класс для применения математических операций с комплексными числами
 */
public class ComplexCalculator {
    private ComplexOperation operation;
    private Logger logger = Logger.getInstance();

    public void setOperation(ComplexOperation operation) {
        this.operation = operation;
    }

    public ComplexNumber performOperation(ComplexNumber a, ComplexNumber b) {
        logger.log("Calculating " + operation.getClass().getSimpleName() + " of " + a + " and " + b);
        return operation.calculate(a, b);
    }
}
