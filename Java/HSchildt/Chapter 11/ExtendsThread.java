class MyThread extends Thread {
    MyThread(String name)
    {
        super(name);
    }

    static MyThread createAndStart(String name){
        MyThread mt = new MyThread(name);
        mt.start();
        return mt;
    }

    public void run() {
        try{
            for(int count = 1; count<=10; count++)
            {
                System.out.println("Значение count в потоке " + getName() + " равно: " + count);
                sleep(40);
            }
        }
        catch(InterruptedException exc){
            System.out.println("НИЧО НЕ РАБОТАЕТ");
            exc.printStackTrace();
        }
        System.out.println("Всё. Конец потока " + getName());
    }
}

public class ExtendsThread {
    public static void main(String[] args) {
        MyThread andr = MyThread.createAndStart("Andrew");
        try {
            for(int count = 0; count<50; count++){
                System.out.print('.');
                Thread.sleep(10);
            }
        }
        catch(InterruptedException exc) {
            System.out.println("В потоке " + andr.getName() + " возникла ошибка");
        }
        System.out.println();
        System.out.println("Всё. Конец метода main");
    }
}
