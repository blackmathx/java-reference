
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class b_Arrays {

  public static void runner() {

    System.out.println("\n=== Arrays ==================\n");

    int[] first = new int[] { 1, 4, 3, 6, 9, 5, 8 };
    int[] second = {4, 3, 1, 4, 5};
    char[] third = "test".toCharArray();
    String[] fourth = { "mock", "ing", "yeah", "bird" };
    Integer[] fifth = { 4, 3, 23, 26, 21, 29, 18, 28 };

    int len = first.length; // returns length
    int[] clone = first.clone(); //
    System.out.println("clone == first: " + (clone==first));
    System.out.println("clone.equals(first): " + Arrays.equals(first, clone));
    int intAt2 = first[2]; // 2
    Arrays.sort(first); // [1, 2, 4, 6]
    String str = first.toString(); // returns the address. use Arrays.toString(first);
    System.out.println("string: " + Arrays.toString(first));
    String str2 = Arrays.toString(first); // returns string
    List<Integer> mylist = Arrays.asList(fifth);
    System.out.println(mylist);
    
    Arrays.sort(fifth);
    Integer[] acopy = Arrays.copyOf(fifth, 4); // new length can truncate or extend
    List<Integer> intList = Arrays.asList(acopy);
    System.out.println(Arrays.toString(Arrays.copyOf(first, 20)));

//    Arrays.asList();
//    Arrays.sort();
//    Arrays.equals();
//    Arrays.binarySearch();
//    Arrays.parallelSort();
//    Arrays.compare();
//    Arrays.compareUnsigned();
//    Arrays.mismatch();
//    Arrays.fill();
//    Arrays.toString();
//    Arrays.stream();

    System.out.println(Arrays.toString(Arrays.copyOfRange(first, 2, 5)));
    Arrays.sort(first);
    Arrays.fill(first, 5); // fills the array with the second parameter
    int compare = Arrays.compare(fifth, acopy); // returns 0 if equal, <0 if first is less, >0 if first is bigger
    int mismatchIndex = Arrays.mismatch(first, second);
    boolean boolEqual = Arrays.equals(first, second);
    int intSearch = Arrays.binarySearch(first, 9); // needs to be sorted; returns index or if not found, the negative of the index where it should go + 1;


    
  }

}