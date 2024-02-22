/** This code is available for all
 */
public class Main {
    public static void main(String[] args) {
 /*
 Hello
  */
    byte num1 = 127;
    byte numm2 = -128;
    short num3 = -30000;
    int num4 = 2000000;
    long num5 = 1000000000;
    float num6 = 2.3f;
    double num7 = 7.99999;
    char a = 'b';
    boolean isTrue = true;
    boolean isFalse = false;

    int x = 130;
    float xx = x;
    System.out.println(xx); //Widening Casting (automatically)

    float x1 = 55.5f;
    int x2 = (int)x1;
    System.out.println(x2); //Narrowing Casting

    }
}