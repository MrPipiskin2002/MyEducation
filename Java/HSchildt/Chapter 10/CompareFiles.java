import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class CompareFiles {
    public static void main(String[] args)
    {
        int FileOneSymbol, FileTwoSymbol;
        if (args.length != 2) {
            System.out.println("Некооректное использование программы.\n" +
                    "Пример запуска:\n" + "java CompareFiles File1.txt File2.txt");
            return;
        }
        try (FileInputStream file1 = new FileInputStream(args[0]);
            FileInputStream file2 = new FileInputStream(args[1])) {
            do {
                FileOneSymbol = file1.read();
                FileTwoSymbol = file2.read();
                if(FileOneSymbol!=FileTwoSymbol)
                    if(!checkDifferentRegister(FileOneSymbol, FileTwoSymbol))break;
            } while(FileOneSymbol != -1 || FileTwoSymbol!=-1);
            if(FileOneSymbol!=FileTwoSymbol && !checkDifferentRegister(FileOneSymbol, FileTwoSymbol))
                System.out.println("Файлы отличаются друг от друга");
            else
                System.out.println("Содержимое файлов одинаково");

        }
        catch(IOException exc) {
        System.out.println("Возникла ошибка ввода вывода:");
        exc.printStackTrace();
        }
    }

    private static boolean checkDifferentRegister(int char1, int char2) {
        if ((char1>90 || char1<65) && (char1>122 || char1<97)) return false;
        if ((char2>90 || char2<65) && (char2>122 || char2<97)) return false;
        if(char1 - char2 == 32) return true;
        return false;
    }
}
