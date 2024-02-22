import org.w3c.dom.ls.LSOutput;

public class LernCasting {
    public static void main(String[] args) {
        long maxValue = Long.MAX_VALUE;
        int tiv = (int)maxValue;
        System.out.println(tiv);
        System.out.println(5%2);
        int num = 8;
        //num = num+3;
        num +=3;
        System.out.println(num);
        System.out.println(num++);
        System.out.println(num);
        System.out.println(++num);

        boolean isEqual = 1==2;
        boolean isNotEqual = 1!=2;
        boolean isGreatThen = 1>2;
        boolean isSmallThen = 1<2;
        boolean isSmallOrEqual = 2<=2;
        boolean isGreatOrEqual = 2>=2;
        System.out.println(isEqual);
        System.out.println(isNotEqual);
        System.out.println(isGreatThen);
        System.out.println(isSmallThen);
        System.out.println(isSmallOrEqual);
        System.out.println(isGreatOrEqual);
        System.out.println(isEqual && isNotEqual);
        System.out.println(isEqual || isNotEqual);

        String aa = "sdjihl";
        System.out.println(aa.substring(1));
        System.out.println(aa.substring(2,4));

        String word = "abcfsjdf";
        int countWorld = word.length();
        System.out.println(countWorld);
        if (countWorld % 2 > 0) {
            System.out.println(word.charAt(countWorld/2));
        } else {
            System.out.println(word.substring(countWorld/2-1,countWorld/2+1));
        }
        double a,b,c;
        a = 10;
        b = 15;
        c = 20;
        double p;
        p = (a+b+c)/2;
        System.out.println(p);
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println(s);


        // подсчет символов в тексте
        String text3 = "the quick brown fox jumps over the lazy dog";
        System.out.println((text3.length() - text3.replaceAll("o", "").length()) / "o".length());

        String text4 = "the quick brown fox jumps over the lazy dog";
        System.out.println(text4.length());//43
        System.out.println(text3.replaceAll("the", "").length()); //39
        System.out.println("the".length());
        int count1 = (text3.length() - text3.replaceAll("o", "").length()) / "o".length();

        //подсчет слов в предложение
        String text = "The quick brown fox jumps over the lazy dog";
        int n = text.length();
        System.out.println(n);//43
        String text1 = text.replaceAll("\\s","");
        System.out.println(text1);
        int n1 = text1.length();
        System.out.println(n1);
        int count = (n - n1)+1;
        System.out.println(count);

        //подсчет слов в предложении
        String text5 = "The quick brown fox jumps over the lazy dog";
        int count5;
        count5 = text5.length() - text5.replaceAll("\\s","").length() + 1;

        int [] even = {1,2,3,4,5};
        int sum = 0;
        for (int x:even) {
            System.out.println(x);
            if (x % 2 ==0) {
            sum +=x;
            }
            }
        System.out.println(sum);

        double[ ] stuff = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5};
        System.out.println(stuff.length);

        int age = 19;
        boolean ageGetPasport;
        ageGetPasport = (age>=14) ? true : false;
        System.out.println(ageGetPasport);





























    }
}


