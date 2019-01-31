import java.util.ArrayList;

public class TestMyMath {
    public static void main(String[] args) {
        //testSmalest();
        //testPow();
        //testsumOf();
        //testFact();
        //testPrime();
        numberCounter();
    }

    public static void testSmalest(){
        int ans = MyMath.smallestNum(1,2,3);
        System.out.println(ans + " // Expected Result :: 1");
        ans = MyMath.smallestNum(4,3,7);
        System.out.println(ans + " // Expected Result :: 3");
        ans = MyMath.smallestNum(33,222,11);
        System.out.println(ans + " // Expected Result :: 11");
        ans = MyMath.smallestNum(19,19,3);
        System.out.println(ans + " // Expected Result :: 3");
    }

    public static void testPow(){
        double ans = MyMath.myPow(2, 1);
        System.out.println(ans + "//Expected result is 2");
        ans = MyMath.myPow(3, 2);
        System.out.println(ans + "//Expected result is 9");
        ans = MyMath.myPow(4, 3);
        System.out.println(ans + "//Expected result is 64");
        ans = MyMath.myPow(0, 3);
        System.out.println(ans + "//Expected result is 0");
        ans = MyMath.myPow(4, 0);
        System.out.println(ans + "//Expected result is 1");
    }

    public static void testsumOf(){
        int ans = MyMath.sumOfNums(10);
        System.out.println(ans + "//Expected result is 55");
        ans = MyMath.sumOfNums(5);
        System.out.println(ans + "//Expected result is 15");
        ans = MyMath.sumOfNums(1);
        System.out.println(ans + "//Expected result is 1");
        ans = MyMath.sumOfNums(0);
        System.out.println(ans + "//Expected result is 0");
    }

    public static void testFact(){
        int ans = MyMath.factorialOf(10);
        System.out.println(ans + "//Expected result is 3628800");
        ans = MyMath.factorialOf(5);
        System.out.println(ans + "//Expected result is 120");
        ans = MyMath.factorialOf(1);
        System.out.println(ans + "//Expected result is 1");
        ans = MyMath.factorialOf(0);
        System.out.println(ans + "//Expected result is 1");
    }

    public static void testPrime(){
        boolean ans = MyMath.isPrime(100);
        System.out.println(ans + " Expected result is false");
        ans = MyMath.isPrime(19);
        System.out.println(ans + " Expected result is true");
        ans = MyMath.isPrime(4703);
        System.out.println(ans + " Expected result is true");
        ans = MyMath.isPrime(2);
        System.out.println(ans + " Expected result is true");
    }

    public static void numberCounter(){




    }
}
