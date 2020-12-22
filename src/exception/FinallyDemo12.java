package exception;

public class FinallyDemo12 {
    public static void main(String[] args) {

        int result = divide(10,0);
        System.out.println(result);
    }

    //try…catch...finally
    public static int divide(int a,int b) {
        int c = 0;
        try {
            c = a/b;
            return c;
        } catch (Exception e) {
            c = 4;
            return c;
            //方法遇到return就形成返回值,后续再修改变量不会改变返回值
        } finally {
            c = 55;
            //finally 是唯一一个可以return一次之后还能return的代码块,可以修改方法的返回值
            //如果在c = 5后再来一个return c;那么就会返回55
            return c;
        }
    }
}
