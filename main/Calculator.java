package main;
import Complex.ComplexNumber;


public class Calculator {
    private ComplexCalculation operation;

    public void setOperation(ComplexCalculation operation) {
        this.operation = operation;
    }

    public void executeOperation(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = operation.operate(num1, num2);
        Logger.log("Результат калькуляции: " + result.getReal() + " + " + result.getImaginary() + "i");
    }
}

    
    

