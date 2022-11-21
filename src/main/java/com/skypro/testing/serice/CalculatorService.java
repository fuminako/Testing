package com.skypro.testing.serice;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public int getSum(int num1, int num2) {
        return num1 + num2;
    }

    public int getDifference(int num1, int num2) {
        return num1 - num2;
    }

    public int getProduct(int num1, int num2) {
        return num1 * num2;
    }

    public int getQuotient(int num1, int num2) {
        if (num2 == 0){
            throw new IllegalInvalidValue("Деление на 0");
        }
        return num1 / num2;
    }
}
