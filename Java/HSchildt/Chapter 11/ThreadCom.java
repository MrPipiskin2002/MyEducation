class TickTock {
    String state;

    synchronized void tick(boolean running) {
        if (!running) {
            state = "ticked";
            notify(); // уведомить ожидающие потоки
            return;
        }
        try {
        Thread.sleep(500);
        }
        catch (InterruptedException exc){
            System.out.println("Произошла ошибка отсчёта времени");
        }
        System.out.print("Tick ");
        state = "ticked";
        notify(); // позволить методу tock() выполняться

        try {
            while (!state.equals("tocked")) {
                wait(); // ожидать завершения работы метода tock()
            }
        } catch (InterruptedException exc) {
            System.out.println("Поток tick прерван.");
        }
    }

    synchronized void tock(boolean running) {
        if (!running) {
            state = "tocked";
            notify(); // уведомить ожидающие потоки
            return;
        }
        try {
            Thread.sleep(500);
        }
        catch (InterruptedException exc){
            System.out.println("Произошла ошибка отсчёта времени");
        }
        System.out.println("Tock");
        state = "tocked";
        notify(); // позволить методу tick() выполняться

        try {
            while (!state.equals("ticked")) {
                wait(); // ожидать завершения работы метода tick()
            }
        } catch (InterruptedException exc) {
            System.out.println("Поток tock прерван.");
        }
    }
}

class MyyThread implements Runnable {
    Thread thrd;
    TickTock ttOb;

    // Конструктор нового потока.
    MyyThread(String name, TickTock tt) {
        thrd = new Thread(this, name);
        ttOb = tt;
    }

    // Фабричный метод, который создает и запускает поток
    public static MyyThread createAndStart(String name, TickTock tt) {
        MyyThread myThrd = new MyyThread(name, tt);
        myThrd.thrd.start();
        return myThrd;
    }

    // Точка входа в поток
    public void run() {
        if (thrd.getName().equals("Tick")) {
            for (int i = 0; i < 5; i++) ttOb.tick(true);
            ttOb.tick(false);
        } else {
            for (int i = 0; i < 5; i++) ttOb.tock(true);
            ttOb.tock(false);
        }
    }
}

public class ThreadCom {
    public static void main(String[] args) {
        TickTock tt = new TickTock();
        MyyThread mt1 = MyyThread.createAndStart("Tick", tt);
        MyyThread mt2 = MyyThread.createAndStart("Tock", tt);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Главный поток прерван.");
        }
    }
}
