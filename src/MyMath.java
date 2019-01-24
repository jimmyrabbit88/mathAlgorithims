public class MyMath {
    public static int smallestNum(int a, int b, int c){
        int smallest = a;
        if(b < smallest){
            smallest = b;
        }
        if(c < smallest){
            smallest = c;
        }
        return smallest;
    }

    public static double myPow(double a, int b){
        if (b == 1){
            return a;
        }
        else if(b==0){
            return 1;
        }
        else{
            double ans = a;
            for(int i=1; i<b; i++){
                ans = ans*a;
            }
            return ans;
        }
    }

    public static int sumOfNums(int n){
        int ans = 0;
        for(int i=1; i < n +1; i++){
            ans += i;
        }
        return ans;
    }

    public static int factorialOf(int n){
        int ans = 1;
        if (n == 0){
            return 1;
        }
        for(int i=n; i > 0; i--){
            ans = ans * i;
        }
        return ans;
    }

    public static boolean isPrime(int x){
        for(int i = x -1 ; i>1;i--){
            if(x%i == 0){
                return false;
            }

        }
        return true;
    }

}
