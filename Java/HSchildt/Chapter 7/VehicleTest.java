interface IVehicle {
    int range();
    double fuelNeed(int miles);
}

class Vehicle implements IVehicle {
    private int passengers;
    private int fuelConsumption;
    private int fuelVolume;

    Vehicle(int p, int fC, int fV) {
        passengers = p;
        fuelConsumption = fC;
        fuelVolume = fV;
    }

    public int range() {
        return fuelConsumption * fuelVolume;
    }

    public double fuelNeed (int miles) {
        return (double)miles/fuelConsumption;
    }

    void setPass(int p) {passengers = p;}
    void setFuelConsumption(int fC) {fuelConsumption = fC;}
    void setFuelVolume(int fV) {fuelVolume = fV;}
    int getPass() {return passengers;}
    int getFuelConsumption() {return fuelConsumption;}
    int getFuelVolume() {return fuelVolume;}
}

class Trucks extends Vehicle {
    private double cargocap;

    Trucks(int p, int fC, int fV, double c) {
        super(p, fC, fV);
        cargocap = c;
    }

    void setCargocap (double c) {
        cargocap = c;
    }

    double getCargocap () {return cargocap;}
}

class VehicleTest {
    public static void main(String[] args) {
        Trucks tr1 = new Trucks(2, 10, 100, 1000);
        Trucks tr2 = new Trucks(8, 8, 80, 100);
        Trucks tr3 = new Trucks(4, 15, 200, 2000);

        System.out.println("Количество пассажиров в 1 грузовике: " + tr1.getPass());
        System.out.println("Объём топливного бака в 1 грузовике: " + tr1.getFuelVolume());
        System.out.println("Грузоподъёмность в 1 грузовике: " + tr1.getCargocap());
        System.out.println("Чтобы проехать 100 миль 1 грузовику нужно " + tr1.fuelNeed(100) + " галлонов топлива");

        System.out.println();


    }
}