package error;

public class ErrorDemo {
    public static void main(String[] args) {

        int[] arr = new int[1024*1024*1024];

        /*Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        at error.ErrorDemo.main(ErrorDemo.java:6)*/
        //error是throwable的子类,他是程序出现了严重的问题,这种问题程序解决不了。
    }
}
