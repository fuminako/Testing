package com.skypro.testing.controller;


import com.skypro.testing.serice.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @GetMapping("/")
    private void printMessage() {
        System.out.println("Добро пожаловать в калькулятор");
    }

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }


    @GetMapping("/plus")
    public String getSum(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int result = this.calculatorService.getSum(num1, num2);
        return String.format("%d + %d = %d", num1, num2, result);
    }

    @GetMapping("/minus")
    public String getDifference(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int result = this.calculatorService.getDifference(num1, num2);
        return String.format("%d - %d = %d", num1, num2, result);
    }

    @GetMapping("/multiply")
    public String getProduct(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int result = this.calculatorService.getProduct(num1, num2);
        return String.format("%d * %d = %d", num1, num2, result);
    }

    @GetMapping("/divide")
    public String getQuotient(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int result = this.calculatorService.getQuotient(num1, num2);
        return String.format("%d / %d = %d", num1, num2, result);
    }
}
