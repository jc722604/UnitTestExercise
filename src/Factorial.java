public class Factorial {
    public static void main(String[] args) {
//        System.out.println(fact(10));

        if(fact(10) == 3628800) {
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
    }
    public static long fact(long n) {
        long r = 1;
        for(long i = 1; i <= n; i++) {
            r = r*i;
        }
        return r;
    }


}
