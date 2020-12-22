package exception;

public class FinallyDemo9 {
    public static void main(String[] args) {

        int result = divide(10,0);
    }

    //try…..finally
    public static int divide(int a,int b){
        int c=0;
        try {
            c = a/b;
        } finally {
            System.out.println("异常后边的代码被执行");
        }
        return c;
    }
}
