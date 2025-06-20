package elective_1.unicorn;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Базовый класс для всех типов единорогов
 */
public class BasicUnicorn implements Unicorn {
    private final String name;
    // AtomicInteger гарантирует корректную работу с энергией из разных потоков
    // (потокобезопасный счетчик)
    private final AtomicInteger energy;
    // ReentrantLock - замок для синхронизации операций с энергией, используется в методе eat()
    // Позволяет только одному потоку увеличивать энергию и выводить на консоль инфу
    private final ReentrantLock lock = new ReentrantLock();

    public BasicUnicorn(String name, int initialEnergy) {
        this.name = name;
        this.energy = new AtomicInteger(initialEnergy);
    }

    @Override
    public void eat() {
        // тут происходит захват замка потоком, т.е.для других потоков доступ блокируется
        lock.lock();
        try{
            int newEnergy = energy.addAndGet(10);
            System.out.printf("%s поел. Энергия: %d%n", name, newEnergy);
        } finally {
            // освобождение замка в любом случае, даже если получим Exception
            lock.unlock();
        }
    }

    @Override
    public void useMagic() {
        System.out.printf("%s использует базовую магию!\n", name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getEnergy() {
        return energy.get();
    }
}
