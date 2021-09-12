package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.stats.StatsService;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest2 {
    @ParameterizedTest(name = "Test name - {0}")
    @CsvSource(
            value = {
                    "sumAllSales ,180"})
    void shouldCalculateSumAllSales(String name, long expected) {
        StatsService service = new StatsService();
//подготавливаем данные;

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        //вызываем целевой метод
        long actual = service.sumAllSales(sales);

        assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "Test name - {0}")
    @CsvSource(
            value = {
                    "minSales ,9"})
    void shouldCalculateMinSales(String name, int expected) {
        StatsService service = new StatsService();
//подготавливаем данные;

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        //вызываем целевой метод
        int actual = service.minSales(sales);

        assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "Test name - {0}")
    @CsvSource(
            value = {
                    "maxSales , 6", "error MaxSales,7"})
    void shouldCalculateMaxSales(String name, int expected) {
        StatsService service = new StatsService();
//подготавливаем данные;

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        //вызываем целевой метод
        int actual = service.maxSales(sales);

        assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "Test name - {0}")
    @CsvSource(
            value = {
                    "averageSales , 15"})
    void shouldCalculateAverageSales(String name, long expected) {
        StatsService service = new StatsService();
//подготавливаем данные;

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        //вызываем целевой метод
        long actual = service.averageAmountSales(sales);

        assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "Test name - {0}")
    @CsvSource(
            value = {
                    "LessAvg ,7"})
    void shouldCalculateLessAvgSales(String name, int expected) {
        StatsService service = new StatsService();
//подготавливаем данные;

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        //вызываем целевой метод
        int actual = service.countLessAverageAmountSales(sales);

        assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "Test name - {0}")
    @CsvSource(
            value = {
                    "MoreAvg ,7", "error MaxSales,9"})
    void shouldCalculateMoreAvgSales(String name, int expected) {
        StatsService service = new StatsService();
//подготавливаем данные;

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        //вызываем целевой метод
        int actual = service.countMoreAverageAmountSales(sales);

        assertEquals(expected, actual);
    }
}
