package exception;

public class FinallyDemo10 {
    public static void main(String[] args) {

        int result = divide(10,2);
        System.out.println(result);
    }

    //try…..finally
    public static int divide(int a,int b){
        int c=0;
        /*c = a/b;
        return c;
        //正常情况下return后不能有代码
        System.out.println("00000");*/

        try {
            c = a/b;
            return c;
        } finally {
            System.out.println("return后边的代码被执行");
        }
    }
}
