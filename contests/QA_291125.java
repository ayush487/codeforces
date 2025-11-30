import java.util.Scanner;

public class QA_291125 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt(); // total test cases
    for (int i=0;i<t;i++) {
      int n = scan.nextInt(); // number of players
      int y = scan.nextInt(); // yellow cards
      int r = scan.nextInt(); // red cards
      System.out.println(getMaximumSuspendedPlayers(n, y, r));
    }
    scan.close();
  }
  public static int getMaximumSuspendedPlayers(int n, int y, int r) {
    int suspended = 0;
    if (n>r) {
      suspended = r;
      n = n-r;
    } else {
      return n;
    }
    int yellowCardPosibility = y/2;
    if (n>yellowCardPosibility) {
      suspended+=yellowCardPosibility;
    } else {
      suspended+=n;
    }
    return suspended;
  }
}
