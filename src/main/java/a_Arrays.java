
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("all")
public class a_Arrays {

  public static void run() {
    System.out.println("\n======= Arrays =========================\n");

    int[] first = new int[] { 1, 4, 3, 6, 9, 5, 8 }; // create an array
    int[] second = {4, 3, 1, 4, 5}; // simpler way to create array
    char[] third = "test".toCharArray(); // turn a string to char[] array
    String[] fourth = { "mock", "ing", "yeah", "bird" }; // create a String[] array
    Integer[] fifth = { 4, 3, 23, 26, 21, 29, 18, 28 }; // create an Integer[] array
    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} }; // multidimensional arrays

    String var100 = Arrays.toString(first); // returns "[1, 4, 3, 6, 9, 5, 8]"

    // enhanced for loop
    for(int i : first) System.out.println(i);

    int len = first.length; // returns length
    int[] clone = first.clone(); // creates new object as a clone of the array, faster than Arrays.copyOf but you can't truncate or extend
    Integer[] clone2 = Arrays.copyOf(fifth, fifth.length); // creates a copy, clone is faster but copyOf allows you to truncate or extend
    boolean compare100 = (clone2 == fifth); // false, they are not equal as objects
    boolean compare101 = (clone == first); // false, they are not equal as objects
    boolean compare102 = Arrays.equals(first, clone); // true, the contents are compared (but compareTo is not implemented in arrays)
    int compare103 = Arrays.compare(first, clone); // explained below, returns 0 if equal, negative if first is smaller, positive if first is bigger
    int var150 = first[2]; // the value at index 2, which is 3
    Arrays.sort(first);
    String var155 = first.toString(); // returns the address. use Arrays.toString(first);
    String var156 = Arrays.toString(first); // it's now sorted "[1, 3, 4, 5, 6, 8, 9]"
    String var160 = Arrays.toString(first); // "[1, 3, 4, 5, 6, 8, 9]"
    Arrays.fill(second, 1); // fills the array with the second parameter
    String var161 = Arrays.toString(second); // "[1, 1, 1, 1, 1]"



    /*
     * Arrays.compare(T[] first, S[] second);
     * returns 0 if equal, negative int if first is smaller, and a positive int if first is bigger.
     * first is smaller when second has more elements, and vice versa
     * if the first element that differs is smaller in the first array return negative. smaller is in this order: null, numbers-uppercaseLetters-lowercaseLetters
     */
    int compare = Arrays.compare(fifth, clone2);
    // compare {2, 3} to {2} returns positive number
    // compare {1, 2} to {1, 2} returns 0
    // compare {"a"} to {"aa"} returns negative
    // compare {"a"} to {"A"} returns positive because "a" is bigger than "A" as Lowercase is bigger than Uppercase
    // compare {"a"} to {null} returns positive because "a" is bigger
    // compare {1} to {"a"} Does Not Compile


    /*
     * Arrays.mismatch(T[] first, S[] second);
     * mismatch returns -1 if arrays are equal, otherwise returns the first index where they differ
     */
    int mismatchIndex = Arrays.mismatch(first, second);
    // mismatch {1} and {1} returns -1
    // mismatch {"a"} and {"A"} returns 0
    // mismatch {1, 2} and {1} returns 1


    /*
     * Arrays.binearySearch(T[] a, int key);
     * needs to be sorted for accurate results.
     * returns index where element is found, or if not found it returns the ( -(index where it should be + 1) );
     * this is because 0 is already an index, consider searching for 1  in {2, 4}. so it returns (returns -1)
     */
    int var310 = Arrays.binarySearch(new int[] {2, 3, 7}, 9);
    int var320 = Arrays.binarySearch(new int[] {2, 4, 7, 9}, 3); // should end searching at index 1, so returns -2.


    // Other Arrays methods
    //    Arrays.parallelSort();
    //    Arrays.compareUnsigned();
    //    Arrays.stream();
    //    Arrays.copyOfRance()

    //========== Arrays and Lists together ==================================
    System.out.println("======= Using Arrays and Lists together =========================");
    List<Integer> var200 = Arrays.asList(6, 1, 4, 3); // create a List, remember asList() yields an immutable List
    Integer[] var210 = var200.toArray(new Integer[0]); // convert List to Array
    Integer[] var220 = var200.toArray(Integer[]::new); // alternate syntax using a method reference
    List<Integer> var230 = Arrays.asList(fifth); // convert array to List of Integers. Arrays.asList is immutable, can't .add() to it as in...
    List<String> var250 = Arrays.asList("x", "y", "z"); // immutable
    //var250.add("f"); // exception

    // Instead, the proper way to use Arrays.asList and have mutability is this...
    List<String> var260 = new ArrayList<>();
    var260.addAll(Arrays.asList("sdf", "fsdfsd", "abc", "def", "ghi"));
    var260.add("new list item"); // allowed to add and remove items
    var260.forEach(j -> System.out.println(j));
    Collections.sort(var260);







  }

}