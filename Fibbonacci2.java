public class Fibbonacci2 {

    public static int fib(int n){

        int first = 1;
        int second = 1;
        int sum = 1;

        //1 1 2 3 5 8

        for(int i = 2; i<n; i++){
            sum = first + second;
            first = second;
            second = sum;
        }

        return sum;

    }

    public static int recfib(int n){
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return 1;
        }

        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args){
        System.out.println(fib(4));
        System.out.println(fib(5));
        System.out.println(fib(6));
        System.out.println(fib(7));
        System.out.println(fib(8));

        System.out.println();

        System.out.println(recfib(4));
        System.out.println(recfib(5));
        System.out.println(recfib(6));
        System.out.println(recfib(7));
        System.out.println(recfib(8));
        

    }
    
}
