enum TrafficLightColor {
    GREEN(12000), YELLOW(2000), RED(12000);

    int delay;

    TrafficLightColor(int tos) {
        delay = tos;
    }

    int getDelay () {
        return delay;
    }

    static TrafficLightColor getNext(TrafficLightColor tlc) {
        if (tlc.ordinal() == 2) return values()[0];
        else return values()[tlc.ordinal()+1];
    }
}

class TrafficLightSimulator implements Runnable {
    private TrafficLightColor tLight;
    private boolean stop = false;
    private boolean changed = false;


    TrafficLightSimulator() {
        tLight = TrafficLightColor.RED;
    }

    TrafficLightSimulator(TrafficLightColor tl) {
        tLight = tl;
    }

    public void run() {
        while (!stop) {
            try {
                Thread.sleep(tLight.getDelay());
            }
            catch (InterruptedException exc) {
                System.out.println("Произошла ошибка ожидания");
            }
            changeColor();
        }
    }

    synchronized void StreamWaitChangingColor() {
        while(!changed) {
            try {
                wait();
            } catch (InterruptedException exc) {
                System.out.println("Ошибка ожидания");
            }
        }
        changed = false;
    }

    synchronized void changeColor() {

        tLight = TrafficLightColor.getNext(tLight);
        changed = true;
        notify();
    }

    TrafficLightColor getColor() {
        return tLight;
    }

    void stopTrafficLight() {
        stop = true;
    }
}

class TrafficLightDemo {
    public static void main(String[] args) {
        var tls = new TrafficLightSimulator();
        Thread TrafficLight = new Thread(tls);
        TrafficLight.start();
        for (int i = 0; i<10; i++) {
            System.out.println(tls.getColor());
            tls.StreamWaitChangingColor();
        }
        tls.stopTrafficLight();
        try {
            TrafficLight.join();
        } catch (InterruptedException exc) {
            System.out.println("Произошла ошибка");
        }
    }
}
