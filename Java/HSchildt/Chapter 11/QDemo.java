import qpack.*;


class QDemo {
    public static void main(String[] args) {
        QueueStatic q = new QueueStatic(5);
        char el;
        try {
            for (int i = 0; i < 7; i++) {
                el = (char) ('a' + i);
                System.out.println("Попытка добавить в очередь элемент " + el);
                q.putElement(el);

            }
        }
        catch (QueueFullException exc) {
            System.out.println(exc);
        }

        try {
            QueueStatic que = new QueueStatic(q);
            for (int i = 0; i < 7; i++) {
                System.out.println(i + 1 + " попытка извлечь элемент");
                el = que.getElement();
                if (el != (char) 0) {
                    System.out.println(el);
                }
            }
        }
        catch (QueueEmptyException exc) {
            System.out.println(exc);
        }


            QueueCycle bebra = new QueueCycle(3);
        try {
            for (int i = 0; i < 4; i++) {
                el = (char) ('a' + i);
                System.out.println("Попытка добавить в очередь элемент " + el);
                bebra.putElement(el);
            }
        }
        catch (QueueFullException exc) {
            System.out.println(exc);
        }
        try {
            bebra.getElement();
            bebra.getElement();
        }
        catch (QueueEmptyException exc) {
            System.out.println(exc);
        }

        try {
            for (int i = 0; i < 4; i++) {
                el = (char) ('a' + i);
                System.out.println("Попытка добавить в очередь элемент " + el);
                bebra.putElement(el);
            }
        }
        catch (QueueFullException exc) {
            System.out.println(exc);
        }

        QueueDynamic bababoy = new QueueDynamic(5);
        for (int i = 0; i < 10; i++) {
            el = (char) ('a' + i);
            System.out.println("Попытка добавить в очередь элемент " + el);
            bababoy.putElement(el);
        }

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + 1 + " попытка извлечь элемент");
                el = bababoy.getElement();
                if (el != (char) 0) {
                    System.out.println(el);
                }
            }
        }
        catch (QueueEmptyException exc) {
            System.out.println(exc);
        }

    }
}