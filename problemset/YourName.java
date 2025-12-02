import java.util.Scanner;

public class YourName {

  static int[] letterCount1 = new int[26];
  static int[] letterCount2 = new int[26];
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int testCases = scan.nextInt();
    for (int test=0;test<testCases;test++) {
      int length = scan.nextInt();
      String s = scan.next();
      String t = scan.next();
      for (int i=0;i<length;i++) {
        letterCount1[s.charAt(i) - 'a']++;
        letterCount2[t.charAt(i) - 'a']++;
      }
      System.out.println(checkIfJumble() ? "YES" : "NO");
      resetLetterArray();
    }
    scan.close();
  }

  public static boolean checkIfJumble() {
    for (int i=0;i<26;i++) {
      if (letterCount1[i]!=letterCount2[i]) return false;
    }
    return true;
  }

  public static void resetLetterArray() {
    for (int i=0;i<26;i++){
      letterCount1[i] = 0;
      letterCount2[i] = 0;
    } 
  }
}
