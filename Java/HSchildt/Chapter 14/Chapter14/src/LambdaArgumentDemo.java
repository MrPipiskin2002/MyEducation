public class LambdaArgumentDemo {

    static String change(ChangeString code, String str) {
        return code.changeStr(str);
    }

    public static void main(String[] args) {

        ChangeString reverse = str -> {
            String result = "";
            for(int i = str.length()-1; i>=0; i--)
                result+=str.charAt(i);
            return result;
        };

        ChangeString changeRegister = str -> {
            String result = "";
            for (int i = 0; i<str.length(); i++) {
                if(str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                    result += (char) (str.charAt(i) + 32);
                    continue;
                }

                if(str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                    result += (char) (str.charAt(i) - 32);
                    continue;
                }

                result+=str.charAt(i);
            }
            return result;
        };

        ChangeString spaceToDash = str -> {
            String result = "";
            for (int i = 0; i<str.length(); i++)
                if (str.charAt(i) == 32) result+= (char) 45;
                else result+=str.charAt(i);
            return result;
        };

        ChangeString removeSpaces = str -> {
          String result = "";
          for (int i = 0; i<str.length(); i++)
              if (str.charAt(i) != ' ') result+=str.charAt(i);
          return result;
        };

        String testString = "Hello, my name is ARTUR PIROZHKOV!";
        System.out.println("Строка до выполнения лямбда-выражения:\n" + testString);
        System.out.println("Строка после выполнения первого лямбда-выражения:\n" + change(reverse, testString));
        System.out.println();
        System.out.println("Строка после выполнения второго лямбда-выражения:\n" + change(changeRegister, testString));
        System.out.println();
        System.out.println("Строка после выполнения третьего лямбда-выражения:\n" + change(spaceToDash, testString));
        System.out.println();
        System.out.println("Строка после выполнения четвёртого лямбда-выражения:\n" + change(removeSpaces, testString));
    }
}
