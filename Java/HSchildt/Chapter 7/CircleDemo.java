abstract class TwoDShape {
    private double width;
    private double height;
    private String name;

    // Стандартный конструктор.
    TwoDShape() {
        width = height = 0.0;
        name = "без имени";
    }

    // Параметризованный конструктор.
    TwoDShape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    // Конструктор с одним параметром.
    TwoDShape(double x, String n) {
        width = height = x;
        name = n;
    }

    // Конструктор объекта из объекта.
    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    // Методы доступа для width и height.
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }
    String getName() { return name; }

    void showDim() {
        System.out.println("Ширина и высота: " + width + " и " + height);
    }

    // Метод area(), определенный в классе TwoDShape.
    abstract double area();
}

class Circle extends TwoDShape{

    private double radius;

    Circle() {
        super();
        radius = 0.0;
    }
    Circle(double r, String n) {
        super(2*r, 2*r, n);
        radius = r;
    }

    Circle (Circle ob) {
        super(ob);
        radius = ob.radius;
    }

    void setRadius (double r) {radius = r;}
    double getRadius () {return radius;}

    double area () {
        return radius*radius*Math.PI;
    }
}

class CircleDemo {
    public static void main(String[] args) {

        Circle c1 = new Circle(10.0, "кружочек");
        Circle c2 = new Circle();
        Circle c3 = new Circle(c1);

        System.out.println("Название фигуры: " + c1.getName());
        System.out.println("Радиус 1 круга: " + c1.getRadius());
        System.out.println("Длина и ширина 1 круга: " + c1.getWidth() + " " + c1.getHeight());
        System.out.println("Площадь 1 круга: " + c1.area());
        System.out.println();
        System.out.println("Название фигуры: " + c2.getName());
        System.out.println("Радиус 2 круга: " + c2.getRadius());
        System.out.println("Длина и ширина 2 круга: " + c2.getWidth() + " " + c2.getHeight());
        System.out.println("Площадь 2 круга: " + c2.area());
        System.out.println();
        System.out.println("Название фигуры: " + c3.getName());
        System.out.println("Радиус 3 круга: " + c3.getRadius());
        System.out.println("Длина и ширина 3 круга: " + c3.getWidth() + " " + c3.getHeight());
        System.out.println("Площадь 3 круга: " + c3.area());

        System.out.println(c2);
        System.out.println(c1);
    }
}