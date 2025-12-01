import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberMaze {

  public static Map<Integer, Integer[]> permutationMap;
  public static void main(String[] args) {
    initializePermutationMap();
    Scanner scan = new Scanner(System.in);
    int testCases = scan.nextInt();
    for (int i=0;i<testCases;i++) {
      int n = scan.nextInt();
      int j = scan.nextInt();
      int k = scan.nextInt();
      printOutput(n,j,k);
    }
    scan.close();
  }
  public static void printOutput(int n, int j, int k) {
    String n1 = permutationMap.get(n)[j-1] + "";
    String n2 = permutationMap.get(n)[k-1] + "";
    System.out.println(getCode(n1, n2));
  }

  public static String getCode(String num1, String num2) {
    int x = 0;
    int y = 0;
    for (int i=0;i<num1.length();i++) {
      if (num1.charAt(i)==num2.charAt(i)) x++;
    }
    for (int i=0;i<num1.length();i++) {
      for (int j=0;j<num2.length();j++) {
        if (num1.charAt(i)==num2.charAt(j)) y++;
      }
    }
    y-=x;
    return x+"A"+y+"B";
  }

  public static void initializePermutationMap() {
    permutationMap = new HashMap<>();
    permutationMap.put(12,new Integer[]{12, 21});
    permutationMap.put(123,new Integer[]{123, 132, 213, 231, 312, 321});
    permutationMap.put(1234,new Integer[]{1234, 1243, 1324, 1342, 1423, 1432, 2134, 2143, 2314, 2341, 2413, 2431, 3124, 3142, 3214, 3241, 3412, 3421, 4123, 4132, 4213, 4231, 4312, 4321});
  }

}
