public class SampleReturn {
    public static void main(String args[]) {
        SampleReturn obj = new SampleReturn();
        int result = obj.CompareNum(3,8);
        System.out.println("The greater number among x and y is: " + result);
    }

    public int CompareNum(int x, int y) {
        System.out.println("x = " + x + "\ny = " + y);
        if (x > y)
            return x;
        else
            return y;
    }
}