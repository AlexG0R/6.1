import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
//подготавливаем данные;
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        //вызываем целевой метод
        long sumSales = service.sumAllSales(sales);

        //выводим результат
        System.out.println(sumSales);
    }
}