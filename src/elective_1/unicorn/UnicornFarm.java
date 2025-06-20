package elective_1.unicorn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class UnicornFarm {
    // Потокобезопасный список для хранения единорогов
    private final List<Unicorn> unicorns = new CopyOnWriteArrayList<>();
    // Пул потоков для выполнения операций кормления
    private final ExecutorService feedingPool;
    // Пул потоков для периодического выполнения магического шоу
    private final ScheduledExecutorService magicShowPool;
    // Атомарный счетчик магических действий
    private final AtomicInteger magicCounter = new AtomicInteger();



    //Инициирует тут оба пула потоков
    public UnicornFarm() {
        this.feedingPool = Executors.newFixedThreadPool(2);
        this.magicShowPool = Executors.newScheduledThreadPool(1);
    }

    public void addUnicorn(Unicorn unicorn) {
        unicorns.add(unicorn);
        System.out.printf("%s добавлен на ферму. Энергия: %d%n",
                unicorn.getName(), unicorn.getEnergy());
    }

    /**
     * Метод для запуска процесса кормления единорогов
     * Для каждого единорога вызывается feedingPool.submit(unicorn::eat),
     * что отправляет метод eat в пул потоков
     * т.е.это и есть одна из наших tasks которая будет попадать в очередь пула потоков
     */
    public void startFeeding() {
        unicorns.forEach(unicorn -> feedingPool.submit(unicorn::eat));
    }

    /**
     * Метод который запускает магическое шоу
     * Шоу стартует без задержки и выполняется каждые 3 секунды в отдельном потоке
     * тут task, которая попадает в пул потоков это метод useMagic для каждого из единорогов
     */
    public void startMagicShow() {
        magicShowPool.scheduleAtFixedRate(() -> {
                    System.out.println("======Магическое шоу======");
                    // Копируем и перемешивание списка единорогов, чтобы в разном порядке
                    // выводились в каждом Магическом шоу
                    List<Unicorn> unicornsShuflList = new CopyOnWriteArrayList<>(unicorns);
                    Collections.shuffle(unicornsShuflList);
                    unicornsShuflList.forEach(unicorn -> {
                        unicorn.useMagic();
                        magicCounter.incrementAndGet();
                    });
                },
                0,
                3,
                TimeUnit.SECONDS
        );
    }

    /**
     * Этот метод для корректного завершения работы фермы и закрытия всех пулов потов
     */
    public void stopFarm() throws InterruptedException {
        // тут я инициирую завершения пулов
        feedingPool.shutdown();
        magicShowPool.shutdown();

        // если пулы не завершились в течении одной секунды, т.е.не выполнились оставшиеся в них задачи,
        // то принудительно завершаем их немедленно
        if(!feedingPool.awaitTermination(1, TimeUnit.SECONDS)){
            feedingPool.shutdownNow();
        }
        if(!magicShowPool.awaitTermination(1, TimeUnit.SECONDS)){
            magicShowPool.shutdownNow();
        }

        System.out.println("Всего магических действий было совершено: "
                + magicCounter.get());
    }
}
