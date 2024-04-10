package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountMonthServiceTest {
    @Test
    public void CountMonthMin() {
        CountMonthService service = new CountMonthService();

        int expected = 3;
        int actual = service.calCount(10000, 3000, 20000);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void CountMonthMax() {
        CountMonthService service = new CountMonthService();

        int expected = 2;
        int actual = service.calCount(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);

    }
}
