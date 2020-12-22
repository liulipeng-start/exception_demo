package exception;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        int result = divide(10, 0);
        //抛出运行时异常时候,异常后边的代码不能执行
        System.out.println("调用端异常后面的代码被执行了");
        System.out.println(result);
    }

    public static int divide(int a,int b){
        int c=0;
        //抛出运行时异常
        //抛出运行时异常时候,异常后边的代码不能执行
        c =a/b;
        System.out.println("被调用端异常后面的代码被执行了");
        return c;

    }
}
