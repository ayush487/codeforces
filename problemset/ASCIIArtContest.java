import java.util.Scanner;

public class ASCIIArtContest {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int g = s.nextInt();
    int c = s.nextInt();
    int l = s.nextInt();
    s.close();
    printVerdict(g, c, l);
  }

  public static void printVerdict(int g, int c, int l) {
    int min = Math.min(Math.min(g, c), l);
    int max = Math.max(Math.max(g, c), l);
    if (max-min>=10) {
      System.out.println("check again");
    } else {
      int median = 0;
      if ((g >= c && g <= l) || (g <= c && g >= l)) median = g;
      else if ((c >= g && c<=l) || (c <= g && c>=l)) median = c;
      else if ((l >= g && l <= c) || (l <= g && l >= c)) median = l;
      System.out.println("final " + median);
    }
  }
}