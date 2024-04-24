package Complex;

public class ComplexNumber {
    private double real; // вещественная часть комплексного числа
    private double imaginary; // мнимая часть комплексного числа

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

     // Метод сложения.
    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.getReal(), this.imaginary + other.getImaginary());
    }

     // Метод умножения.
    public ComplexNumber multiply(ComplexNumber other) {
        double newReal = this.real * other.getReal() - this.imaginary * other.getImaginary();
        double newImaginary = this.real * other.getImaginary() + this.imaginary * other.getReal();
        return new ComplexNumber(newReal, newImaginary);
    }

     // Метод деления.
    public ComplexNumber divide(ComplexNumber other) {
        double denominator = other.getReal() * other.getReal() + other.getImaginary() * other.getImaginary();
        double newReal = (this.real * other.getReal() + this.imaginary * other.getImaginary()) / denominator;
        double newImaginary = (this.imaginary * other.getReal() - this.real * other.getImaginary()) / denominator;
        return new ComplexNumber(newReal, newImaginary);
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
}

