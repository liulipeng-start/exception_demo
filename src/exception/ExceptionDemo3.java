package exception;

public class ExceptionDemo3 {
    public static void main(String[] args) {

        int result = 0;
        try {
            //接收异常对象
            result = divide(10, 0);
        } catch (Exception e) {
            //处理异常
            System.out.println("传错参数");
            result = divide(10,5);
        }
        System.out.println(result);
    }

    public static int divide(int a,int b){
        int c=0;
        c = a/b;
        return c;

    }
}
