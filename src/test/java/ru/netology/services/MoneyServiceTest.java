package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class MoneyServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/money.csv")
    public void restCalculation (int expected, int income , int expense) {

        MoneyService service = new MoneyService();

        int actual = service.calculate(income, expense);

        Assertions.assertEquals(expected, actual);
    }
}
