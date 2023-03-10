
package ru.netology.stats;

public class StatsService {

    public int sumSales(int[] sales) {    // сумма всех продаж
        int totalSale = 0;

        for (int sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public int averageSales(int[] sales) {        // средняя сумма продаж в месяц
        return sumSales(sales) / sales.length;
    }

    public int monthMaximumSale(long[] sales) {      // номер меяца, в котором был пик продаж
        int monthMaximum = 0;
        long saleMaximum = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= saleMaximum) {
                monthMaximum = i;
                saleMaximum = sales[i];
            }

        }
        return monthMaximum + 1;
    }


    public int minSales(long[] sales) {         //месяц с минимальными продажами
        int minMonth = 0;
        int month = 0;                 // переменная для индекса рассматриваемого месяца в массиве

        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;         // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;

    }


    public int monthsSalesBelowAverage(int[] sales) {         // кол-во месяцев в которых продажи были ниже среднего
        int averageSales = averageSales(sales);
        int result = 0;
        for (int sale : sales) {
            if (sale < averageSales) {
                result++;
            }
        }
        return result;
    }

    public int monthsSalesAboveAverage(int[] sales) {         // кол-во месяцев в которых продажи были выше среднего
        int averageSales = averageSales(sales);
        int result = 0;
        for (int sale : sales) {
            if (sale > averageSales) {
                result++;
            }
        }
        return result;
    }
}
