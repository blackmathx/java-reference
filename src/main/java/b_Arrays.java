

import java.util.Arrays;
import java.util.List;

public class b_Arrays {


  public static void runner() {
    System.out.println("\n=== Arrays ==================\n");

    int[] first = new int[] { 1, 4, 3, 6, 9, 5, 8 };
    int second[] = { 5, 4, 2 };
    char[] third = "test".toCharArray();
    String[] fourth = { "test", "ing", "yeah", "bird" };
    Integer[] fifth = { 4, 3, 23, 26, 21, 29, 18, 28 };

    int a = first.length; // returns length
    int[] clone = first.clone(); //
    int x = first[2]; // 2
    Arrays.sort(first); // [1, 2, 4, 6]
    first.toString(); // returns the address
    List<Integer> mylist = Arrays.asList(fifth);
    System.out.println(mylist);
    
    Arrays.sort(fifth);
    Integer[] acopy = Arrays.copyOf(fifth, 4);
    System.out.println(Arrays.asList(acopy));
    System.out.println(Arrays.toString(Arrays.copyOf(first, 2)));


    System.out.println(Arrays.toString(Arrays.copyOfRange(first, 2, 5)));
    Arrays.sort(first);
    Arrays.fill(first, 5);
    Arrays.asList(acopy);
    Arrays.compare(fifth, acopy);
    Arrays.equals(first, second);
    Arrays.binarySearch(first, 9);


    
  }

}