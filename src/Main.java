import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      Sort a = new Sort();
      int[] unsorted =a.setArray();
      System.out.println("unsorted array is 123: "+ Arrays.toString(unsorted));
      int[] sorted = a.sort(unsorted);
      System.out.println("sorted array is: "+Arrays.toString(sorted));
    }
}