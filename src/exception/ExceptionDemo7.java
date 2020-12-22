package exception;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public class ExceptionDemo7 {
    public static void main(String[] args) {

        int result = divide(10,5);
    }


    public static int divide(int a,int b){
        int c=0;
        int[] arr = {1,3,5,6,7};

        try {
            c = a/b;
            System.out.println(arr[100]);
        } catch (Exception e) {
            if(e instanceof ArithmeticException){
                System.out.println("被零除");
            }
            if(e instanceof ArrayIndexOutOfBoundsException){
                System.out.println("数组越界");
            }
            e.printStackTrace();
        }
        return c;

    }
}
