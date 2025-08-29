package queuestart.qdemo;

import queuesource.genqueue.FullQueueException;
import queuesource.genqueue.EmptyQueueException;
import userstructs.structs.*;

import java.util.ServiceLoader;

public class GenQDemo {
    public static void main(String[] args) {

        ServiceLoader<Structure> structService = ServiceLoader.load(Structure.class);
        GenericQueueInterface<String> struct = null;

        for(Structure s : structService)
        {
            if (s.getStruct(new Object[0]).getName().equals("Queue")) {
                struct = s.getStruct(new String[5]);
                break;
            }
        }

        if (struct!=null) {
            try {
                System.out.println("Попытка добавить 7 строчных значений в очередь");
                for (int i = 0; i < 7; i++) {
                    String v = "" + (char) (65 + i);
                    System.out.println("Попытка добавить строчное значение: " + (char) (65 + i));
                    struct.putElement(v);
                }
            } catch (FullQueueException exc) {
                System.out.println(exc);
            }

            System.out.println();


            System.out.println("Попытка извлечения " + 7 + " строчных элементов");
            String v = "";
            try {
                for (int i = 0; i < 7; i++) {
                    v += struct.getElement();
                    System.out.println("Извлекли значение: " + v.charAt(i));
                }
            } catch (EmptyQueueException exc) {
                System.out.println(exc);
            } finally {
                System.out.println("Извлечённая в виде строки очередь: " + v);
            }

            System.out.println();
        }

        struct = null;


        //Теперь используем стек


        for (Structure s : structService) {
            if(s.getStruct(new Object[0]).getName().equals("Stack")) {
                struct = s.getStruct(new String[5]);
                break;
            }
        }

        if (struct!=null) {
            try {
                System.out.println("Попытка добавить 7 строчных значений в очередь");
                for (int i = 0; i < 7; i++) {
                    String c = "" + (char) (65 + i);
                    System.out.println("Попытка добавить строчное значение: " + (char) (65 + i));
                    struct.putElement(c);
                }
            } catch (FullQueueException exc) {
                System.out.println(exc);
            }

            System.out.println();


            System.out.println("Попытка извлечения " + 7 + " строчных элементов");
            String c = "";
            try {
                for (int i = 0; i < 7; i++) {
                    c += struct.getElement();
                    System.out.println("Извлекли значение: " + c.charAt(i));
                }
            } catch (EmptyQueueException exc) {
                System.out.println(exc);
            } finally {
                System.out.println("Извлечённая в виде строки очередь: " + c);
            }
        }

        struct = null;

    }
}
