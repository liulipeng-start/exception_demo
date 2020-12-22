package exception;

public class ExceptionDemo4 {
    public static void main(String[] args) {

        int result = 0;
        try {
            result = divide(10, 0);
        } catch (Exception e) {

            //获得异常信息
            String message = e.getMessage();
            System.out.println(message);

            //获得异常的详细信息
            String s = e.toString();
            System.out.println(s);

            //打印异常超级详细信息
            e.printStackTrace();
        }
        System.out.println(result);
    }

    public static int divide(int a,int b){
        int c=0;
        c = a/b;
        return c;

    }
}
