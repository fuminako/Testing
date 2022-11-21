package com.skypro.testing;

import com.skypro.testing.serice.CalculatorService;
import com.skypro.testing.serice.IllegalInvalidValue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

public class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @ParameterizedTest
    @MethodSource("sumTestSuites")
    public void sumTest(int num1, int num2, int result) {
        Assertions.assertEquals(result, calculatorService.getSum(num1, num2));
    }

    public static List<Arguments> sumTestSuites() {
        return List.of(
                Arguments.of(5, 8, 13),
                Arguments.of(2, 7, 9)
        );
    }

    @ParameterizedTest
    @MethodSource("differenceTestSuites")
    public void differenceTest(int num1, int num2, int result) {
        Assertions.assertEquals(result, calculatorService.getDifference(num1, num2));
    }

    public static List<Arguments> differenceTestSuites() {
        return List.of(
                Arguments.of(5, 8, -3),
                Arguments.of(2, 7, -5)
        );
    }

    @ParameterizedTest
    @MethodSource("productTestSuites")
    public void productTest(int num1, int num2, int result) {
        Assertions.assertEquals(result, calculatorService.getProduct(num1, num2));
    }

    public static List<Arguments> productTestSuites() {
        return List.of(
                Arguments.of(5, 8, 40),
                Arguments.of(2, 7, 14)
        );
    }

    @ParameterizedTest
    @MethodSource("quotientTestSuites")
    public void quotientTest(int num1, int num2, int result) {
        Assertions.assertEquals(result, calculatorService.getQuotient(num1, num2));
    }

    public static List<Arguments> quotientTestSuites() {
        return List.of(
                Arguments.of(10, 2, 5),
                Arguments.of(2, 1, 2)
        );
    }

    @Test
    public void divisionByZeroExceptionTest() {
        Assertions.assertThrows(IllegalInvalidValue.class, () ->
        {calculatorService.getQuotient(1, 0);
        });
    }
}
