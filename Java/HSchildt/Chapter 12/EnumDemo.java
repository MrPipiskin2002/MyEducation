
enum Tools {
    SCREWDRIVER, WRENCH, HAMMER, PLIES;
}

public class EnumDemo {
    public static void main(String[] args) {
        for (Tools x : Tools.values()) {
            System.out.println(x + " : "  + x.ordinal());
        }
    }
}
