package exception;

public class TestReturn {
    public static void main(String[] args) {
        TestReturn tr = new TestReturn();
        String returnValue = tr.test();
        System.out.println("函数返回值是" + returnValue);
    }


    public String test() {
        int i = 0;
        for (; i < 3; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("现在i=" + i);
        if (i == 3) {
            return "中国";
        }
//		else {
//			return "华夏";
//		}
        System.out.println("我是return后的代码");
        return "神州";
    }

}
