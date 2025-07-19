class UseMain {
    public static void main(String[] args) {

        Thread AndrewMain = Thread.currentThread();

        System.out.print("Имя главного потока: ");
        System.out.println(AndrewMain.getName());
        System.out.print("Приоритет главного потока: ");
        System.out.println(AndrewMain.getPriority());

        System.out.println();
        System.out.println("Изменяем приоритет и имя главного потока...");
        System.out.println();

        AndrewMain.setName("ANDREW-MEOW-MEOW-MEOW");
        AndrewMain.setPriority(Thread.NORM_PRIORITY + 4);

        System.out.print("Новое имя главного потока: ");
        System.out.println(AndrewMain.getName());
        System.out.print("Новый приоритет главного потока: ");
        System.out.println(AndrewMain.getPriority());
    }
}