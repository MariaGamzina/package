package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CountMonthServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/count.csv")
    public void CountMonthMin(int expected, int income, int expenses, int threshold) {
        CountMonthService service = new CountMonthService();

        // int expected = 3;
        int actual = service.calCount(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }
}

//    @Test
//    public void CountMonthMax() {
//        CountMonthService service = new CountMonthService();
//
//        int expected = 2;
//        int actual = service.calCount(100_000, 60_000, 150_000);
//
//        Assertions.assertEquals(expected, actual);
//
//    }
//}
