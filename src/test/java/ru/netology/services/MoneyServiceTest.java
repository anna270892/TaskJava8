package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MoneyServiceTest {

    @Test
    public void restCalculation () {

        MoneyService service = new MoneyService();

        int expected = 3;
        int actual = service.calculate(10000, 3000);

        Assertions.assertEquals(expected, actual);
    }
}
