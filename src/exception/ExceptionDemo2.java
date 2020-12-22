package exception;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        int result = divide(10, 0);
        System.out.println("调用端异常后面的代码被执行了");
        System.out.println(result);
    }

    public static int divide(int a,int b){
        int c=0;
        try {
            c =a/b;
            System.out.println("try内部发生的异常下面的代码执行"); //try内不会得到打印
        } catch (Exception e) {
            System.out.println("发生异常");
            e.printStackTrace();
        }
        return c;

    }
}
