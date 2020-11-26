package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class StatsServiceTest {
    public  int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    public StatsService service = new StatsService();

    @Test
    void shouldSum() {
       int expected = 180;

        int actual = service.sum(purchases);

        assertEquals(expected, actual);
    }
    @Test
    void shouldAverage() {
        int expected = 15;
        int actual = service.average(purchases);

        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnMonthNumberWithMax() {
        int expected = 8;
        int actual = service.monthWithMax(purchases);

        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnMonthNumberWithMin() {
        int expected = 9;
        int actual = service.monthWithMin(purchases);
        assertEquals(expected, actual);
    }
    @Test
    void calcMonthsBelowAverge() {
        int expected = 5;
        int actual = service.calcMonthsBelowAverage(purchases);
        assertEquals(expected, actual);
    }
    @Test
    void calcMonthsAboveAverge() {
        int expected = 5;
        int actual = service.calcMonthsAboveAverage(purchases);
        assertEquals(expected, actual);
    }
}