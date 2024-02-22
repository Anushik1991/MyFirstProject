public class LernArray {
 public static void main(String[] args) {
  int[] number = new int[5];
  String[] names = new String[4];
  System.out.println(number[2]);
  System.out.println(names[3]);

  names[0] = "Mariam";
  names[1] = "Anush";
  names[2] = "Anna";
  names[3] = "Nelly";

  System.out.println(names[3]);

  String[] names2 = {"Anush", "Anna", "Sveta", "Arman"};
  System.out.println(names2.length);

  String[] names3 = names2;
  System.out.println(names3[0]);
  names3[0] = "Aram";
  System.out.println(names2[0]);//Aram

  String[] names4 = {"Anush", "Anna", "Sveta", "Arman"};
  int n = names4.length;
  for (int i = 0; i < n; i++) {
   System.out.println(names4[i]);
  }

  //initialyze
  System.out.println("exemple 1");

  int[] days;
  days = new int[7];
  for(int i:days)
  System.out.println(i);

  System.out.println("exemple 2");

  int[] days1 = new int[7];
  days1[0] = 1;
  days1[1] = 2;
  days1[2] = 3;
  days1[3] = 4;
  days1[4] = 5;
  days1[5] = 6;
  days1[6] = 7;
  for(int j : days1) {
   System.out.println(j);//1,2,3...7
  }
   //System.out.println(days1.length);//7-> size
   //System.out.println(days1[4]);//5

  System.out.println("exemple 3");

  int[] days2 = {1,2,3,4,5,6};
  int h = 0;//index
  while (h<days2.length) {
   System.out.println(days2[h]);//12...6
   h++;
  }

  System.out.println("exemple 4");

  String[] fruits = new String[4];
  fruits[0] = "apple";
  fruits[1] = "mango";
  fruits[2] = "orange";
  fruits[3] = "apple";
  //System.out.println(fruits[4]);//error
  System.out.println(fruits[3]);//apple
  fruits[3] = "cherry";
  System.out.println(fruits[3]);
  int k = 0;
  while(k < fruits.length){
  System.out.println(fruits[k]);
  k++;
  }

  System.out.println("exemple 5");

  int[][ ] numbers = new int[3][];
  numbers[0] = new int[] {11,22,33,44,55};
  numbers[1] = new int[] {66,77,88};
  numbers[2] = new int[] {99,98};
  System.out.println(numbers[0].length);//5
  System.out.println(numbers[1].length);//3
  System.out.println(numbers[2].length);//2
  System.out.println(numbers[1][2]);//88
  for(int[] numb : numbers){
    for(int l:numb) {
    System.out.print(l+" ");
   }
   System.out.println();
  }

  System.out.println("exemple 6");

  int[][] num = new int[2][3];
  num[0] = new int[] {100,200,300};
  //num[1] = new int[] {400,500,600,700};
  num[1] = new int[] {400,500,600};
  System.out.println(num[0].length);//3
  System.out.println(num[1].length);//3
  //System.out.println(num[1][3]);//error
  System.out.println(num[1][2]);//600
  for(int[] num1 : num){
   for(int m:num1) {
    System.out.print(m+" ");
   }
   System.out.println();
  }

  System.out.println("exemple 7");

  int[] nomer1 = {1,1,1,1,1};
  int[] nomer2 = {2,2,2,2,2};
  int[] nomer3 = {3,3,3,3,3};

  int[][] nomers = {nomer1,nomer2,nomer3};
  System.out.println(nomers[1].length);//5
  for (int[] index1 : nomers){
       for(int index2 : index1){
       System.out.print(index2 + " ");
       }
   System.out.println();
  }

  int[] nums = {25, 86, 41, 97, 22, 34};
  for(int index = 0; index < nums.length; index++) {
   //access each element using index
   int num3 = nums[index];
   System.out.println(num3);
  }

























 }
}
