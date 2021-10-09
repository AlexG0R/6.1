package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public long sumAllSales(long[] sales) {
        long sumSales = 0;

        for (long sale : sales) {
            sumSales = sumSales + sale;
        }
        return sumSales;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth - 1;
    }

    public long averageAmountSales(long[] sales) {
        long avgSales = 0;
        for (long sale : sales) {
            avgSales = avgSales + sale;
        }
        return avgSales / sales.length;
    }

    public int countLessAverageAmountSales(long[] sales) {
        long avgSale = averageAmountSales(sales);
        int countMonth = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {

            if (sale <= avgSale) {
                countMonth = countMonth + 1;
            }
        }
        return countMonth;
    }

    public int countMoreAverageAmountSales(long[] sales) {
        long avgSale = averageAmountSales(sales);
        int countMonth = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {

            if (sale >= avgSale) {
                countMonth = countMonth + 1;
            }
        }
        return countMonth;
    }
}