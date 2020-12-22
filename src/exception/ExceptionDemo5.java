package exception;

import javafx.scene.control.SplitPane;

public class ExceptionDemo5 {
    public static void main(String[] args) {

        divide(10,5);
    }


    public static int divide(int a,int b){
        int c=0;
        int[] arr = {1,3,5,6,7};

        try {
            c = a/b;
            System.out.println(arr[100]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } /*catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }*/
        return c;

    }
}
