package queuestart.qdemo;

import queuesource.genqueue.GenericQueue;
import supportstruct.structs.FullQueueException;
import supportstruct.structs.EmptyQueueException;
import queuesource.genqueue.Stack;

public class GenQDemo {
    public static void main(String[] args) {
        GenericQueue<Integer> qInt = new GenericQueue<Integer>(new Integer[5]);

        try {
            System.out.println("Попытка добавить 7 Целочисленных значений в очередь");
            for (int i = 0; i < 7; i++) {
                System.out.println("Попытка добавить целочисленное значение: " + (i + 10));
                qInt.putElement(i + 10);
            }
        }
        catch(FullQueueException exc) {
            System.out.println(exc);
        }

        System.out.println();

        System.out.println("Попытка извлечения " + 7 + " целочисленных элементов");
        try {
            for (int i = 0; i< 7; i++) {
                System.out.println("Извлекли значение: " + qInt.getElement());
            }
        }
        catch(EmptyQueueException exc) {
            System.out.println(exc);
        }

        System.out.println();



        GenericQueue<String> qStr = new GenericQueue<String>(new String[5]);

        try {
            System.out.println("Попытка добавить 7 строчных значений в очередь");
            for (int i = 0; i < 7; i++) {
                String c = "" + (char) (65 + i);
                System.out.println("Попытка добавить строчное значение: " + (char) (65 + i));
                qStr.putElement(c);
            }
        }
        catch(FullQueueException exc) {
            System.out.println(exc);
        }

        System.out.println();


        System.out.println("Попытка извлечения " + 7 + " строчных элементов");
        String c = "";
        try {
            for (int i = 0; i< 7; i++) {
                c += qStr.getElement();
                System.out.println("Извлекли значение: " + c.charAt(i));
            }
        }
        catch(EmptyQueueException exc) {
            System.out.println(exc);
        }
        finally {
            System.out.println("Извлечённая в виде строки очередь: " + c);
        }

        System.out.println();

        Stack<Integer> sInt = new Stack<Integer>(new Integer[5]);

        try {
            System.out.println("Попытка добавить 7 Целочисленных значений в стек");
            for (int i = 0; i < 7; i++) {
                System.out.println("Попытка добавить целочисленное значение: " + (i + 10));
                sInt.putElement(i + 10);
            }
        }
        catch(FullQueueException exc) {
            System.out.println(exc);
        }

        System.out.println();

        System.out.println("Попытка извлечения " + 7 + " целочисленных элементов");
        try {
            for (int i = 0; i< 7; i++) {
                System.out.println("Извлекли значение: " + sInt.getElement());
            }
        }
        catch(EmptyQueueException exc) {
            System.out.println(exc);
        }
    }
}
