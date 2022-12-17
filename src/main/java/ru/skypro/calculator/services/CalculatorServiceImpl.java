package ru.skypro.calculator.services;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    private void isNotNull(Double num1, Double num2){
        if (num1 == null || num2 == null) {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, "num1 и num2 должны быть указаны");
        }
    }

    @Override
    public String getGreeting() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public Double getPlus(Double num1, Double num2) {
        isNotNull(num1,num2);
        return num1 + num2;
    }

    @Override
    public Double getMinus(Double num1, Double num2) {
        isNotNull(num1,num2);
        return num1 - num2;
    }

    @Override
    public Double getMultiply(Double num1, Double num2) {
        isNotNull(num1,num2);
        return num1 * num2;
    }

    @Override
    public Double getDivide(Double num1, Double num2) {
        isNotNull(num1,num2);
        if (num2 == 0.0) {
            throw new IllegalArgumentException();
        }
        return num1 / num2;
    }
}
