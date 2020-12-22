package exception;

public class FinallyDemo11 {
    public static void main(String[] args) {

        int result = divide(10,2);
        System.out.println(result);
    }

    //try…catch...finally
    public static int divide(int a,int b){
        int c=0;
        try {
            c = a/b;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("最终代码被执行");
        }
        return c;
    }
}
