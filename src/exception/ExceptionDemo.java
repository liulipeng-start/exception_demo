package exception;

public class ExceptionDemo {
    public static void main(String[] args) {
        int result = divide(10, 0);
        System.out.println(result);
    }

    public static int divide(int a,int b){
        int c=0;
        c =a/b;
        return c;

    }
}
