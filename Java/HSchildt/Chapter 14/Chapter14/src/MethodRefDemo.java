class MyIntNum {

    private int v;

    MyIntNum(int n) {v = n;}

    int getNum() {return v;}

    boolean hasCommonFactor(int n) {
        int vCopy = v < 0 ? -v : v;
        n = n < 0 ? -n : n;
        System.out.print("Числа " + n + " и " + vCopy);
        while (vCopy != n) {
            if (vCopy < n) n = n - vCopy;
            if (vCopy > n) vCopy = vCopy - n;
        }
        if (n>1) {
            System.out.println(" имеют общий делитель: " + n);
            return true;
        }
        else {
            System.out.println(" не имеют общих делителей");
            return false;
        }
    }
}

interface MyIntNumPredicate {
    boolean test(int x);
}

interface MyIntNumPredicateFull {
    boolean test(MyIntNum ob, int x);
}

public class MethodRefDemo {
    public static void main(String[] args) {
        MyIntNum intValue = new MyIntNum(9);
        MyIntNumPredicate hasFactorRef = intValue::hasCommonFactor;

        boolean result = hasFactorRef.test(16);
        System.out.println(result);

        result = hasFactorRef.test(12);
        System.out.println(result);

        MyIntNumPredicateFull hasFactorFullRef = MyIntNum::hasCommonFactor;
        result = hasFactorFullRef.test(intValue, 27);
        System.out.println(result);

    }
}
