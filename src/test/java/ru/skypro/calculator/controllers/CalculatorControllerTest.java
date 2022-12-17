package ru.skypro.calculator.controllers;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;
import ru.skypro.calculator.services.CalculatorService;
import ru.skypro.calculator.services.CalculatorServiceImpl;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorControllerTest {

    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    void getGreeting() {
        String expected = "Добро пожаловать в калькулятор";
        String actual = calculatorService.getGreeting();
        assertEquals(expected, actual);
    }

    @Test
    void getPlus() {
        Double expected = 5.0+5;
        Double actual = calculatorService.getPlus(5.0,5.0);
        assertEquals(expected, actual);
    }

    @Test
    void getMinus() {
        Double expected = 5.0-5;
        Double actual = calculatorService.getMinus(5.0,5.0);
        assertEquals(expected, actual);
    }

    @Test
    void getMultiply() {
        Double expected = 5.0*5;
        Double actual = calculatorService.getMultiply(5.0,5.0);
        assertEquals(expected, actual);
    }

    @Test
    void getDivide() {
        Double expected = 5.0/5;
        Double actual = calculatorService.getDivide(5.0,5.0);
        assertEquals(expected, actual);
    }
}