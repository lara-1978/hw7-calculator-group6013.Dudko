package main;

import java.util.Scanner;

import Complex.ComplexNumber;

public class mainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ComplexNumber num1 = new ComplexNumber(7.0, 1.0); 
        ComplexNumber num2 = new ComplexNumber(2.0, 1.0); 

        
        
        Calculator calculator = new Calculator(); // экземпляр калькулятора
        
        Logger.log("Выберите операцию:");
        Logger.log("1 - Сложение");
        Logger.log("2 - Умножение");
        Logger.log("3 - Деление");

        int choice = scanner.nextInt(); // обработка ввода 
        scanner.close();

        switch (choice) { // проверка  данных
            case 1 -> calculator.setOperation(new ComplexCalculation() {
                @Override
                public ComplexNumber operate(ComplexNumber num1, ComplexNumber num2) {
                    return num1.add(num2);
                }
            });
            
            case 2 -> calculator.setOperation(new ComplexCalculation() {
                @Override
                public ComplexNumber operate(ComplexNumber num1, ComplexNumber num2) {
                    return num1.multiply(num2);
                }
            });
            case 3 -> calculator.setOperation(new ComplexCalculation() {
                @Override
                public ComplexNumber operate(ComplexNumber num1, ComplexNumber num2) {
                    return num1.divide(num2);
                }
            });
            default -> Logger.log("Ошибка.");
        }
        calculator.executeOperation(num1, num2);
    }

}