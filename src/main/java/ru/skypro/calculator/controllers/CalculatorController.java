package ru.skypro.calculator.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.calculator.services.CalculatorService;

@RestController
@RequestMapping("calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String getGreeting(){
        return calculatorService.getGreeting();
    }

    @GetMapping("plus")
    public Double getPlus(@RequestParam Double num1, @RequestParam Double num2){
        return calculatorService.getPlus(num1,num2);
    }

    @GetMapping("minus")
    public Double getMinus(@RequestParam Double num1, @RequestParam Double num2){
        return calculatorService.getMinus(num1,num2);
    }

    @GetMapping("multiply")
    public Double getMultiply(@RequestParam Double num1, @RequestParam Double num2){
        return calculatorService.getMultiply(num1,num2);
    }

    @GetMapping("divide")
    public Double getDivide(@RequestParam Double num1, @RequestParam Double num2){
        return calculatorService.getDivide(num1,num2);
    }
}
