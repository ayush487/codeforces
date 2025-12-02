import java.util.Scanner;

public class TabClosing {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int testCases = scan.nextInt();
    for (int test=0;test<testCases;test++) {
      int a = scan.nextInt();
      int b = scan.nextInt();
      int n = scan.nextInt();
      long totalDefaultSpaceRequired = (long) b * (long) n;
      if ((long) a >= totalDefaultSpaceRequired || a==b) System.out.println(1);
      else System.out.println(2);
    }
    scan.close();
  }
}