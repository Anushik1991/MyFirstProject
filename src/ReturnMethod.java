public class ReturnMethod {
    public static void main(String[] args) {
        int min1 = minNumbernew(1, 3);
        System.out.println(min1);
        int min2 = minNumbernew(100, 300);
        System.out.println(min2);
        int min3 = minNumbernew(5, 5);
        System.out.println(min3);
        int sum = printTotalnew(10, 5);
        System.out.println(sum);
        boolean even = isEvennew(7);
        System.out.println(even);
        boolean even1 = isEvennew(44);
        System.out.println(even1);
        double power = powerNumbernew(3, 2);
        System.out.println(power);
        double circle = areaCirclenew(5);
        System.out.println(circle);
        double rectangle = areaRectangle(4, 6);
        System.out.println(rectangle);
        String repeatedString = concateString("abc", 3);
        System.out.println(repeatedString);
        int smallNumber = smallestNumber(25, 37, 29);
        System.out.println(smallNumber);
        float average = averageNumber(25, 45, 65);
        System.out.println(average);
        String middleChar1 = middleCharacter("abcd");
        System.out.println(middleChar1);
        String middleChar2 = middleCharacter("abcdo");
        System.out.println(middleChar2);
        double triangleS = triangleArea(10, 15, 20);
        System.out.println(triangleS);
        boolean trueNumber1 = trueNumber(15, 20, 25);
        System.out.println(trueNumber1);
        boolean consecutiveNumber1 = consecutiveNumber(15, 16, 17);
        System.out.println(consecutiveNumber1);
        boolean consecutiveNumber2 = consecutiveNumber(20, 25, 25);
        System.out.println(consecutiveNumber2);
        String wordRevers1 = wordRevers("fasd");
        System.out.println(wordRevers1);
        int count = countWord("The quick brown fox jumps over the lazy dog");
        System.out.println(count);

        int[] evenDigits = {1, 2, 3, 4, 5};
        int SumEvenDigits = getSumOfEvenDigits(evenDigits);
        System.out.println(SumEvenDigits);

        int[] oddDigits = {1, 2, 3, 4, 5};
        int SumOddDigits = getSumOfOddDigits(oddDigits);
        System.out.println(SumOddDigits);

        int getSumOfOddDigits = getSumOfEvenDigits(evenDigits) * getSumOfOddDigits(oddDigits);
        System.out.println(getSumOfOddDigits);

        int countWords1 = countWords("The quick brown fox jumps over the lazy dog");
        System.out.println(countWords1);

        int numbers = calculateNumbers(5);
        System.out.println("vot eto" + numbers);

        int numbers1 = calculateNumbers1(5);
        System.out.println(numbers1);

        int calculSumNum1 = calculSumNum(4);
        System.out.println("Calculate the sum of first n natural number" + calculSumNum1);

    }

    static int minNumbernew(int x, int y) {
        if (x < y) {
            return x;
        } else if (y < x) {
            return y;
        } else {
            return x; // or return y; since they are equal
        }
    }

    static int printTotalnew(int a, int b) {
        return a + b;
    }

    public static boolean isEvennew(int aa) {
        if (aa % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static double powerNumbernew(double base, int ex) {
        return Math.pow(base, ex);
    }

    public static double areaCirclenew(double r) {
        return 3.14 * (r * r);
    }

    public static double areaRectangle(double width, double height) {
        return width * height;
    }

    public static String concateString(String st, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(st);
        }
        return result.toString();
    }

    public static int smallestNumber(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }

    public static float averageNumber(int A, int B, int C) {
        return (A + B + C) / 3;
    }

    public static String middleCharacter(String word) {
        int countWorld = word.length();
        if (countWorld % 2 > 0) {
            return word.substring(countWorld / 2, countWorld / 2 + 1);
        } else {
            return word.substring(countWorld / 2 - 1, countWorld / 2 + 1);
        }
    }

    public static double triangleArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static boolean trueNumber(int a, int b, int c) {
        if (a < b + c && b < a + c && c < a + b) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean consecutiveNumber(int x, int y, int z) {
        if (y - x == 1 && z - y == 1 && z - x == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static String wordRevers(String stroka) {
        StringBuffer word = new StringBuffer(stroka);
        word.reverse();
        return word.toString();
    }

    public static int countWord(String text) {
        return text.length() - text.replaceAll("\\s", "").length() + 1;
    }

    public static int getSumOfEvenDigits(int[] even) {
        int sum = 0;
        for (int x : even) {
            if (x % 2 == 0) {
                sum += x;
            }
        }
        return sum;
    }

    public static int getSumOfOddDigits(int[] odd) {
        int sum = 0;
        for (int x : odd) {
            if (x % 2 != 0) {
                sum += x;
            }
        }
        return sum;
    }

    public static int countWords(String text) {
        return text.split("\\s").length;
    }

    public static int calculateNumbers(int numbers) {
        int sum = 0;
        int i = 1;
        while (i <= numbers) {
            sum += i;
            i++;
        }
        return sum;

    }
    public static int calculateNumbers1(int numbers) {
        int sum = 0;
        for (int i = 1; i <= numbers; i++) {
            sum += i;
        }
        return sum;
    }

    public static int calculSumNum(int natNum) {
        int sum = 0;
        int i = 1;
        while(i<=natNum){
            if (natNum>0) {
                sum += i;
                i++;
            }
        }
        return sum;

    }











}



