import java.util.Scanner;

public class BeautifulAverage {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int testCases = scan.nextInt();
    for (int i=0;i<testCases;i++) {
      int n = scan.nextInt();
      int[] arr = new int[n];
      for (int j=0;j<n;j++) arr[j] = scan.nextInt();
      printMaxAvg(arr);
    }
    scan.close();
  }

  public static void printMaxAvg(int[] arr) {
    int max = arr[0];
    for (int i=0;i<arr.length;i++) {
      max = arr[i] > max ? arr[i] : max;
    }
    System.out.println(max);
  }
}
