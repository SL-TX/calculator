package ru.skypro.calculator.controllers;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.skypro.calculator.services.CalculatorService;
import ru.skypro.calculator.services.CalculatorServiceImpl;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorControllerParamsTest {

    @NotNull
    private static Stream<Arguments> provideParamsForTest(){
        return Stream.of(
                Arguments.of(5.0,3.0),
                Arguments.of(4.0,3.0),
                Arguments.of(2.0,3.0),
                Arguments.of(2.0,0.0)
        );
    }
    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    void getGreeting() {
        String expected = "Добро пожаловать в калькулятор";
        String actual = calculatorService.getGreeting();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    void getPlus(Double val1,Double val2) {
        Double expected = val1+val2;
        Double actual = calculatorService.getPlus(val1,val2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    void getMinus(Double val1,Double val2) {
        Double expected = val1-val2;
        Double actual = calculatorService.getMinus(val1,val2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    void getMultiply(Double val1,Double val2) {
        Double expected = val1*val2;
        Double actual = calculatorService.getMultiply(val1,val2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    void getDivide(Double val1,Double val2) {
        if (val2 != 0.0) {
            Double expected = val1 / val2;
            Double actual = calculatorService.getDivide(val1, val2);
            assertEquals(expected, actual);
        } else {
            assertThrows(IllegalArgumentException.class,()->calculatorService.getDivide(val1,val2),"Dividing on 0 expected");
        }
    }

}
