import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Help {
    String filename;

    Help(String f) {
        filename = f;
    }

    boolean findHelp(String themeName) {
        int sym;
        String outStr;
        try(BufferedReader fname = new BufferedReader(new FileReader(filename))) {
            do {
                sym = fname.read();
                if(sym == '#') {
                    if(fname.readLine().equals(themeName)) {
                        do {
                            outStr = fname.readLine();
                            System.out.println(outStr);
                        } while (!outStr.equals("..."));
                        return true;
                    }
                }
            } while(sym!=-1);
        }
        catch(IOException exc) {
            System.out.println("Ошибка ввода-вывода или файл не найден");
            exc.printStackTrace();
            return false;
        }
        return false;
    }

    String getSelection() {
        String themeName = null;
        try(BufferedReader rt = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Выберите название темы: ");
            themeName = rt.readLine();
        }
        catch(IOException exc) {
            System.out.println("Возникла ошибка ввода-вывода:");
            exc.printStackTrace();
        }
        return themeName;
    }

    String[] getMenu(){
        String outStr;
        try(BufferedReader fname = new BufferedReader(new FileReader(filename))) {
            do {
                outStr = fname.readLine();
                if(outStr.equals("@")) {
                    outStr = fname.readLine();
                    return outStr.split(", ");
                }
            } while(outStr!=null);
        }
        catch(IOException exc) {
            System.out.println("Ошибка ввода-вывода или файл не найден");
            exc.printStackTrace();
        }
        System.out.println("Меню не найдено.");
        return new String[0];
    }

    void printMenu() {
        String[] menu = getMenu();
        int count = 1;
        for (String x : menu) {
            System.out.println(count + ") " + x);
            count++;
        }
        return;
    }
}

class FileHelp {
    public static void main(String[] args) {
        Help hp = new Help("IOhelp.txt");
        hp.printMenu();
        hp.findHelp(hp.getSelection());
    }
}
