

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        int num=5;
        long factorial;
        factorial=facto(num);
        System.out.println("factorial :"+factorial);
    }

    public static long facto(int n){
        if(n>=1){
            return n*facto(n-1);
        }
        else{
            return 1;
        }
    }
}
