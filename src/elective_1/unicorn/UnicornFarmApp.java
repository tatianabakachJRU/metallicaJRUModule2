package elective_1.unicorn;

import java.util.concurrent.TimeUnit;

public class UnicornFarmApp {
    public static void main(String[] args) throws InterruptedException {
        UnicornFarm unicornFarm = new UnicornFarm();

        // добавляем единорогов в List
        unicornFarm.addUnicorn(new RainbowUnicorn("Радуга"));
        unicornFarm.addUnicorn(new DarkUnicorn("Тень"));
        unicornFarm.addUnicorn(new RainbowUnicorn("Сияние"));
        unicornFarm.addUnicorn(new DarkUnicorn("Дарки"));

        // запускаем основные процессы фермы
        unicornFarm.startFeeding();
        unicornFarm.startMagicShow();

        // Приостанавливаем главный поток на 10 секунд, чтобы наша ферма поработала 10 секунд
        TimeUnit.SECONDS.sleep(10);

        // Корректно завершаем работу фермы
        unicornFarm.stopFarm();


    }
}
