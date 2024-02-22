public class LernReferenceType {
    public static void main(String[] args) {
        String s = new String();
        s = "abdc";
        System.out.println(s);
        String s1 = new String("Anush");
        String s2 = "Petros";

        String a = "apple";
        String a1 = a;
        a = a.concat(" and orange");
        System.out.println(a);
        System.out.println(a1);

        String x = "Java";
        x = x.concat(" Rules");
        System.out.println("x = " + x);

        x.toUpperCase() ;
        System.out.println("x = " + x);

        x = x.toLowerCase();
        System.out.println("x = " + x);

        char defaultValue = '\u0000';
        System.out.println("Default value of char: " + defaultValue);

        String b1 = "spring ";
        String b2 = b1 + "summer "; //sping summer
        b1.concat("fall ") ; //spring fall
        b2.concat(b1); // sping summer spring
        b1 += "winter "; //spring winter
        System.out.println(b1 + " " + b2);

        StringBuilder variable1 = new StringBuilder("Akopyan");
        System.out.println(variable1);
        StringBuilder variable2 = variable1;
        System.out.println(variable2);
        variable1.append(" Akop");
        System.out.println(variable1);//StringBuilder is no immutable, so stringbuilder data was chaged
        System.out.println(variable2);//

        StringBuffer var1 = new StringBuffer("Age ");
        System.out.println(var1);
        StringBuffer var2 = var1;
        System.out.println(var2);
        var1.append("1991");
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var1.reverse());
        System.out.println(var2);

        String name = "Anush";
        System.out.println(name.length());
        System.out.println(name.charAt(4));

        String str1 = "abc";
        String str2 = "abc";
        System.out.println("str1==str2 is" + str1 ==str2);



    }
}
