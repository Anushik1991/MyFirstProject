public class LearnBufferBuilder {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("Java");//now original string is changed
        System.out.println(sb);// Hello Java

        StringBuffer sb1 = new StringBuffer("Hello Anush");
        sb1.insert(6,"student ");//now original string is changed
        System.out.println(sb1); // Hello student Anush

        StringBuffer sb2 = new StringBuffer("This is Pyton course");
        sb2.replace(8,13, "Java");//now original string is changed
        System.out.println(sb2); // This is Java course

        StringBuffer sb3 = new StringBuffer("This is Java course");
        sb3.delete(8,13);//now original string is changed
        System.out.println(sb3); // This is Java course

        StringBuffer sb4 = new StringBuffer("This is Java course");
        sb4.deleteCharAt(0);//now original string is changed
        System.out.println(sb4); // his is Java course

        StringBuffer sb5 = new StringBuffer("This is Java course");
        System.out.println(sb5.substring(13));// course // create new string object
        System.out.println(sb5.substring(8,13));// Java

        StringBuffer sb6 = new StringBuffer ("Hello");
        System.out.println (sb6);
        System.out.println(sb6.charAt(0)); // create new string object
        sb6.setCharAt(0,'G');
        System.out.println(sb6);
        sb6.setLength(3);
        System.out.println(sb6);










    }
}
