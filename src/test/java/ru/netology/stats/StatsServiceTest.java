package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test

    public void testSum() {
        StatsService service = new StatsService();        // сумма всех продаж

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        int actual = service.sumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverage() {                     // средняя сумма продаж
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = ((8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12);
        int actual = service.averageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxSalesMonth() {                 // месяц в котором был пик продаж
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 7;
        long actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }


    @Test
public void testMinSaleMonth() {
        StatsService service = new StatsService();


    }
}


