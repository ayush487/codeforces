import java.util.Scanner;

public class YetAnotherArrayProblem {

  static long[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53, 59, 61, 67, 71};
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int testCases = scan.nextInt();
    for (int i=0;i<testCases;i++) {
      int n = scan.nextInt();
      long[] a = new long[n];
      for (int j=0;j<n;j++) {
        a[j] = scan.nextLong();
      }
      System.out.println(findX(a));
    }
    scan.close();
  }

  public static long findX(long[] a) {
    for (int idx=0;idx<primes.length;idx++) {
      for (int i=0;i<a.length;i++) {
        if (gcd(Math.max(a[i], primes[idx]),Math.min(a[i], primes[idx]))==1) return primes[idx];
      }
    }
    return -1;
  }

  public static long gcd(long n1, long n2) {
    if (n2==0) return n1;
    return gcd(n2, n1%n2);
  }
  
}
