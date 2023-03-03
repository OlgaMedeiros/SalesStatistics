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

        int expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        int actual = service.averageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthMaximumSale() {                 // месяц в котором был пик продаж
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8;
        long actual = service.monthMaximumSale(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinSaleMonth() {                        //месяц минимальных продаж
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 9;
        long actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void testMonthSaleBelowAverage() {               // кол-во месяцев в которых продажи были ниже среднего
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        int expected = 5;
        int actual = service.monthsSalesBelowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthSaleAboveAverage() {               // кол-во месяцев в которых продажи были выше среднего
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        int expected = 5;
        int actual = service.monthsSalesBelowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}



