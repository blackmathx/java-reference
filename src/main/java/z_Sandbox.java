
import java.util.Arrays;

@SuppressWarnings("all")
public class z_Sandbox {

  public static void runner() {
    System.out.println("\n=== Sandbox Notes ================\n");
    
    // ================================================================
    /*
     * == vs .equals();
     * 
     * 
     * .equals() is not defined for primitives. with any two primitives, use ==
     * //int x = 5, y = 5;
     * //System.out.println(x.equals(y)); // DOES NOT COMPILE
     * 
     * 
     */

    Integer a = 10, b = 10;
    System.out.println(a == b); // true
    System.out.println(a.equals(b)); // true
    // This fails after 127

    int p = 2;
    Integer q = 2;
    System.out.println("sdf");
    System.out.println(p == q); // true
    // System.out.println(p.equals(q)); //DNC

    Integer aprime = 127, bprime = 127;
    System.out.println(aprime == bprime); // true. true for 127 but not 128. pg?

    Integer c = 333, d = 333;
    System.out.println(c == d); // false
    System.out.println(c.equals(d)); // true

    // Strings are == when declaring as String a = "hello"; String b = "hello";
    // They are not == when declaring as String a = new String("hello"); String b =
    // ....
    // All String methods that return a value return by creating 'new String()'
    // unless
    // the method isn't needed, such as "hello".trim(); That returns "hello" w/o new
    String s1 = "hello";
    String s2 = "hello";
    String s3 = new String("hello");

    // Compare two arrays
    Integer[] arr1 = { 1, 2, 3 };
    Integer[] arr2 = { 1, 2, 3 };
    boolean arrEqual = Arrays.equals(arr1, arr2);
    System.out.println("Are arrays equal? " + arrEqual); // also true for int[] arrays

    
    // ================================================================

    int j = 0;
    
    for (;;j++) {
      if (j > 5)
        break;
      System.out.print(j);
    }

    j = 0;
    for (float k = 3.3f; j < 5;) {
      j++;
      System.out.print(j);
    }

    for (int i = 0;;) {
      i++;
      System.out.print(i);
      if (i > 5)
        break;
    }
  }

  // ================================================================
  
}