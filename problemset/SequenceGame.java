import java.util.Scanner;

public class SequenceGame {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int testCases = scan.nextInt();
    for (int t=0;t<testCases;t++) {
      int n = scan.nextInt();
      int[] seq = new int[n];
      for (int i=0;i<n;i++) {
        seq[i] = scan.nextInt();
      }
      int x = scan.nextInt();
      System.out.println(canSeqMergedToX(seq, x) ? "YES" : "NO");
    }
    scan.close();
  }
  public static boolean canSeqMergedToX(int[] seq, int x) {
    if (seq.length==1) return seq[0]==x;
    int max = seq[0];
    int min = seq[0];
    for (int i=1;i<seq.length;i++) {
      max = seq[i] > max ? seq[i] : max;
      min = seq[i] < min ? seq[i] : min;
    }
    if (x >= min && x <= max) return true;
    return false;
  }
}
