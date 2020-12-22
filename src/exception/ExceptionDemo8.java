package exception;

public class ExceptionDemo8 {
    public static void main(String[] args) {

        int result = divide(10,5);
    }


    public static int divide(int a,int b){
        int c=0;
        int[] arr = {1,3,5,6,7};

        try {
            c = a/b;
            System.out.println(arr[100]);
        } catch (ArithmeticException e) {
            System.out.println("被零除发生异常");

        }catch (Exception e){
            System.out.println("异常发生");
        }
        /*
        //如果上边是父类下边是子类这样是不允许的,
        //如果上边是父类下边是子类会导致异常都会被父类接收,异常无法到达下边的子类
        catch (Exception e) {
            System.out.println("被零除发生异常");

        }catch (ArithmeticException e){
            System.out.println("异常发生");
        }
         */
        return c;

    }
}
