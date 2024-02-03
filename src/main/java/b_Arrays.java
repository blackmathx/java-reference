
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("all")
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


    int compare = Arrays.compare(fifth, acopy); // returns 0 if equal,  negative int if first is less, a positive int if first is bigger.
    // first is smaller when second has more elements, and vice versa
    // if the first element that differs is smaller in the first array return negative. smaller is in this order: null, numbers-uppercase-lowercase
    // compare {2, 3} to {2} returns positive number
    // compare {1, 2} to {1, 2} returns 0
    // compare {"a"} to {"aa"} returns negative
    // compare {"a"} to {"A"} returns positive
    // compare {"a"} to {null} returns positive
    // compare {1} to {"a"} Does Not Compile



    int mismatchIndex = Arrays.mismatch(first, second);
    // mismatch returns -1 if arrays are equal, otherwise returns the first index where they differ
    // mismatch {1} and {1} returns -1
    // mismatch {"a"} and {"A"} returns 0
    // mismatch {1, 2} and {1} returns 1


    boolean boolEqual = Arrays.equals(first, second); // boolean
    int intSearch = Arrays.binarySearch(first, 9); // needs to be sorted for accurate results
    // returns index where element is found, or if not found it returns the ( -(index where it should be + 1) );
    int intSearch2 = Arrays.binarySearch(new int[] {2, 4, 7, 9}, 3); // should go at index 1, so returns -2. (this is because 0 is already an index, consider searching for 1 (returns -1))


    
  }

}