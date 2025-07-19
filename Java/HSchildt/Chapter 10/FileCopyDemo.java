import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.io.FileWriter;
import java.io.FileReader;

class FileCopy {
    static boolean fcopy(String fileFrom, String fileTo) {
        InputStreamReader f1 = null;
        OutputStreamWriter f2 = null;
        int ch;
        try {
            f1 = new InputStreamReader(new FileInputStream(fileFrom));
            f2 = new OutputStreamWriter(new FileOutputStream(fileTo));

            do {
                ch = f1.read();
                if ((char) ch == ' ') ch = '-';
                if(ch!=-1)f2.write((char) ch);
            } while(ch!=-1);
            System.out.println("Копирование файла прошло успешно");
            return true;
        }
        catch(IOException exc){
            System.out.println("Произошла ошибка ввода-вывода");
            exc.printStackTrace();
        }
        finally {
            try {
                if(f1!=null) f1.close();
            }
            catch(IOException exc) {
                System.out.println("Произошла ошибка ввода-вывода");
                exc.printStackTrace();
            }
            try {
                if(f2!=null) f2.close();
            }
            catch(IOException exc) {
                System.out.println("Произошла ошибка ввода-вывода");
                exc.printStackTrace();
            }

        }
        System.out.println("Копирование произошло безуспешно.\n Повторите попытку.");
        return false;
    }

    static boolean fcopytry(String fileFrom, String fileTo) {
        int ch;
        try (var f1 = new FileReader(fileFrom); var f2 = new FileWriter(fileTo)) {
            do {
                ch = f1.read();
                if ((char) ch == ' ') ch = '-';
                if(ch!=-1)f2.write((char) ch);
            } while(ch!=-1);
            System.out.println("Копирование файла прошло успешно");
            return true;
        }
        catch(IOException exc){
            System.out.println("Произошла ошибка ввода-вывода");
            exc.printStackTrace();
        }
        System.out.println("Копирование произошло безуспешно.\n Повторите попытку.");
        return false;
    }
}




class FileCopyDemo {
    public static void main(String[] args) {
        FileCopy.fcopy("FileFromCopy.txt", "FileToCopy.txt");
        FileCopy.fcopytry("TryFileFromCopy.txt", "TryFileToCopy.txt");
    }
}