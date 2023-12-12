package com.example.javaDevModule20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    public void testAddition() {
        //Given
        Calculator calc = new Calculator();
        int value1 = 5;
        int value2 = 3;

        //When
        int result = calc.addition(value1, value2);

        //Then
        int expected = 8;
        Assertions.assertEquals(expected, result);
    }
}