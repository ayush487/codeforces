
import java.util.Scanner;

public class TwoScreens {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int testCases = scan.nextInt();
    for (int i=0;i<testCases;i++) {
      String s = scan.next();
      String t = scan.next();
      System.out.println(getMinimumTime(s,t));
    }
    scan.close();
  }
  public static int getMinimumTime(String s, String t) {
    int currentIdx = 0;
    int timeTaken = 0;
    String temp = "";
    while (currentIdx<s.length() && currentIdx<t.length()) {
      if (s.charAt(currentIdx)==t.charAt(currentIdx)) {
        temp+=t.charAt(currentIdx);
      } else {
        break;
      }
      currentIdx++;
      timeTaken++;
    }
    if (temp.length()>0) timeTaken++;
    timeTaken+= s.length()-temp.length();
    timeTaken+= t.length()-temp.length();

    return timeTaken;
  }
}

