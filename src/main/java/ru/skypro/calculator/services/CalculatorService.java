package ru.skypro.calculator.services;

public interface CalculatorService {
    String getGreeting();

    Double getPlus(Double num1, Double num2);

    Double getMinus(Double num1, Double num2);

    Double getMultiply(Double num1, Double num2);

    Double getDivide(Double num1, Double num2);
}
